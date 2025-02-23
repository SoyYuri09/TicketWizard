package itson.ticketwizard.control;

import itson.ticketwizard.dtos.BoletoElegidoDTO;
import itson.ticketwizard.dtos.CompraReservaUsuarioTransaccionDTO;
import itson.ticketwizard.dtos.EventoDisponibilidadBoletoDTO;
import itson.ticketwizard.dtos.EventoMostrarListaDTO;
import itson.ticketwizard.dtos.NombreCorreoUsuarioDTO;
import itson.ticketwizard.dtos.UsuarioEventoElegidoDTO;
import itson.ticketwizard.dtos.UsuarioSaldoDTO;
import itson.ticketwizard.entidades.Boleto;
import itson.ticketwizard.entidades.Evento;
import itson.ticketwizard.entidades.Transaccion;
import itson.ticketwizard.entidades.Usuario;
import itson.ticketwizard.persistencia.BoletosDAO;
import itson.ticketwizard.persistencia.EventosDAO;
import itson.ticketwizard.persistencia.ReservasDAO;
import itson.ticketwizard.persistencia.TransaccionesDAO;
import itson.ticketwizard.persistencia.UsuariosDAO;
import itson.ticketwizard.presentacion.ConfirmacionCompra;
import itson.ticketwizard.presentacion.DisponibilidadBoletos;
import itson.ticketwizard.presentacion.EventosDisponibles;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */
public class ControlCompra {

    private EventosDisponibles eventosDisponibles;
    private DisponibilidadBoletos disponibilidadDeBoletos;
    private ConfirmacionCompra confirmacionCompra;
    private NombreCorreoUsuarioDTO nombreCorreoUsuarioDTO;

    private UsuariosDAO usuariosDAO;
    private EventosDAO eventosDAO;
    private BoletosDAO boletosDAO;
    private TransaccionesDAO transaccionesDAO;
    private ReservasDAO reservasDAO;

    public ControlCompra(EventosDAO eventosDAO, BoletosDAO boletosDAO, UsuariosDAO usuariosDAO, TransaccionesDAO transaccionesDAO, NombreCorreoUsuarioDTO nombreCorreoUsuarioDTO, 
            ReservasDAO reservasDAO) {
        this.eventosDAO = eventosDAO;
        this.boletosDAO = boletosDAO;
        this.usuariosDAO = usuariosDAO;
        this.transaccionesDAO = transaccionesDAO;
        this.reservasDAO = reservasDAO; 
        this.nombreCorreoUsuarioDTO = nombreCorreoUsuarioDTO;
    }
    
    public NombreCorreoUsuarioDTO obtenerNombreCorreoUsuarioDTO(){
        return this.nombreCorreoUsuarioDTO;
    }

    public void iniciarCompra(JFrame frameAnterior) {
        eventosDisponibles = new EventosDisponibles(this);
        frameAnterior.dispose();
        eventosDisponibles.setVisible(true);
    }

    public List<Evento> consultarListaEventos() {
        return this.eventosDAO.listarEventos();
    }

    public List<Boleto> obtenerBoletos(Integer codigoEvento) {
        
        String correoElectronicoUsuario = nombreCorreoUsuarioDTO.getCorreoElectronico();
        Usuario usuario = usuariosDAO.obtenerUsuario(correoElectronicoUsuario); 
        UsuarioEventoElegidoDTO usuarioEventoElegidoDTO = new UsuarioEventoElegidoDTO(usuario.getCodigo(),codigoEvento);
        
        return boletosDAO.listarBoletos(usuarioEventoElegidoDTO);
    }

    public List<Boleto> obtenerBoletosReventa(Integer codigoEvento) {
        
        String correoElectronicoUsuario = nombreCorreoUsuarioDTO.getCorreoElectronico();
        Usuario usuario = usuariosDAO.obtenerUsuario(correoElectronicoUsuario);
        UsuarioEventoElegidoDTO usuarioEventoElegidoDTO = new UsuarioEventoElegidoDTO(usuario.getCodigo(),codigoEvento);
        
        return boletosDAO.listarBoletosReventa(usuarioEventoElegidoDTO);
    }

    public List<Boleto> obtenerBoletosBoletera(Integer codigoEvento) {
        return boletosDAO.listarBoletosBoletera(codigoEvento);
    }

    public void mostrarListaBoletos(JFrame frameAnterior, Integer codigoEvento) {
        disponibilidadDeBoletos = new DisponibilidadBoletos(this, codigoEvento);
        frameAnterior.dispose();
        disponibilidadDeBoletos.setVisible(true);
    }
    
    public EventoDisponibilidadBoletoDTO obtenerDatosBasicosEvento(Integer codigoEvento){
        Evento evento = eventosDAO.obtenerEvento(codigoEvento);
        return new EventoDisponibilidadBoletoDTO(evento.getCodigo(), evento.getNombre(),
                evento.getRecinto(), evento.getFecha(), evento.getEstado(), evento.getCiudad(), 
                evento.getDireccionBanner());
    }

    public void mostrarConfirmacionCompra(JFrame frameAnterior, LinkedList<Integer> codigosBoletosSeleccionados, Integer codigoEvento) {
        
        ConfirmacionCompra confirmacionCompra = new ConfirmacionCompra(this, codigosBoletosSeleccionados, codigoEvento);
        frameAnterior.dispose();
        confirmacionCompra.setVisible(true);
    }
    
    public UsuarioSaldoDTO obtenerUsuarioSaldoDTO(String correoElectronico){
        Usuario usuario = usuariosDAO.obtenerUsuario(correoElectronico);
        return new UsuarioSaldoDTO(usuario.getCodigo(), usuario.getSaldo());
        
    }
    
    public List<BoletoElegidoDTO> obtenerListaBoletosElegidoDTO(LinkedList<Integer> codigosBoletosSeleccionados){
        
        List<BoletoElegidoDTO> listaBoletosElegidosDTO = new LinkedList<>();
        
        for(Integer codigoBoleto: codigosBoletosSeleccionados){
            Boleto boleto = boletosDAO.obtenerBoleto(codigoBoleto);
            Evento evento = eventosDAO.obtenerEvento(boleto.getCodigoEvento());
            
            BoletoElegidoDTO boletoElegidoDTO = new BoletoElegidoDTO(boleto.getNumeroSerie(), boleto.getFila(), 
                    boleto.getAsiento(), boleto.getPrecio(),evento.getNombre(), evento.getRecinto(),
                    evento.getFecha(), evento.getCiudad(), evento.getEstado());
            
            listaBoletosElegidosDTO.add(boletoElegidoDTO);
        }
        
        return listaBoletosElegidosDTO;
    }
    
    public void comprarBoletos(LinkedList<Integer> codigosBoletosSeleccionados, Integer codigoUsuarioComprador){
        for(Integer codigoBoleto: codigosBoletosSeleccionados){
            Transaccion transaccion = transaccionesDAO.obtenerVentasVigentesBoleto(codigoBoleto);
            
            if(transaccion != null){
                CompraReservaUsuarioTransaccionDTO compraReservaUsuarioTransaccionDTO = 
                        new CompraReservaUsuarioTransaccionDTO(codigoUsuarioComprador, transaccion.getCodigo());
                transaccionesDAO.concretarTransaccion(compraReservaUsuarioTransaccionDTO);
            }
        }
    }
    
    public void crearReserva(LinkedList<Integer> codigosBoletosSeleccionados, Integer codigoUsuarioComprador){
        for(Integer codigoBoleto: codigosBoletosSeleccionados){
            Transaccion transaccion = transaccionesDAO.obtenerVentasVigentesBoleto(codigoBoleto);
            if(transaccion != null){
                CompraReservaUsuarioTransaccionDTO compraReservaUsuarioTransaccionDTO = 
                        new CompraReservaUsuarioTransaccionDTO(codigoUsuarioComprador, transaccion.getCodigo());
                reservasDAO.registrar(compraReservaUsuarioTransaccionDTO);
            }
        }
    }

}
