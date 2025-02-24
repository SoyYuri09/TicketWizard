package itson.ticketwizard.control;

import itson.ticketwizard.dtos.CompraReservaUsuarioTransaccionDTO;
import itson.ticketwizard.dtos.NombreCorreoUsuarioDTO;
import itson.ticketwizard.dtos.TransaccionApartadaDTO;
import itson.ticketwizard.dtos.UsuarioSaldoDTO;
import itson.ticketwizard.dtos.MontoTotalSaldoFinCompraDTO;
import itson.ticketwizard.entidades.Usuario;
import itson.ticketwizard.persistencia.BoletosDAO;
import itson.ticketwizard.persistencia.EventosDAO;
import itson.ticketwizard.persistencia.ManejadorConexiones;
import itson.ticketwizard.persistencia.UsuariosDAO;
import itson.ticketwizard.presentacion.CargarSaldo;
import itson.ticketwizard.presentacion.CargaSaldoCompraExitosa;
import itson.ticketwizard.presentacion.ComprasRealizadas;
import itson.ticketwizard.persistencia.ReservasDAO;
import itson.ticketwizard.persistencia.TransaccionesDAO;
import java.util.List;
import javax.swing.JFrame;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */
public class ControlCargarSaldo {
    
    private final UsuariosDAO usuariosDAO;
    private final NombreCorreoUsuarioDTO nombreCorreoUsuarioDTO;
    private final ReservasDAO reservasDAO;
    private final TransaccionesDAO transaccionesDAO;
    private ComprasRealizadas comprasRealizadas;
    private CargaSaldoCompraExitosa cargaSaldoCompraExitosa;
    private CargarSaldo cargarSaldo;

    public ControlCargarSaldo(NombreCorreoUsuarioDTO nombreCorreoUsuarioDTO, UsuariosDAO usuariosDAO, ReservasDAO reservasDAO, TransaccionesDAO transaccionesDAO) {
        this.usuariosDAO = usuariosDAO;
        this.reservasDAO = reservasDAO;
        this.transaccionesDAO = transaccionesDAO;
        this.nombreCorreoUsuarioDTO = nombreCorreoUsuarioDTO;
    }
    
    public NombreCorreoUsuarioDTO obtenerNombreCorreoUsuarioDTO(){
        return this.nombreCorreoUsuarioDTO;
    }
    
    public void iniciarCargaSaldo(JFrame frameAnterior){
        cargarSaldo = new CargarSaldo(this);
        frameAnterior.dispose();
        cargarSaldo.setVisible(true);
    }
       
    public UsuarioSaldoDTO obtenerUsuarioSaldoDTO(String correoElectronico){
        Usuario usuario = usuariosDAO.obtenerUsuario(correoElectronico);
        return new UsuarioSaldoDTO(usuario.getCodigo(), usuario.getSaldo()); 
    }
    
    public void mostrarComprasRealizadas(JFrame frameAnterior){
        List<TransaccionApartadaDTO> listaTransaccionApartadaDTOs = obtenerTransaccionApartadaDTOs(obtenerNombreCorreoUsuarioDTO().getCorreoElectronico());
        if(listaTransaccionApartadaDTOs.size() > 0){
            for(TransaccionApartadaDTO transaccionApartadaDTO: listaTransaccionApartadaDTOs){
                Usuario usuario = usuariosDAO.obtenerUsuario(this.obtenerNombreCorreoUsuarioDTO().getCorreoElectronico());
                CompraReservaUsuarioTransaccionDTO compraReservaUsuarioTransaccionDTO = 
                        new CompraReservaUsuarioTransaccionDTO(usuario.getCodigo(),transaccionApartadaDTO.getCodigoTransaccion());
                transaccionesDAO.concretarTransaccion(compraReservaUsuarioTransaccionDTO);
            }
            
            comprasRealizadas = new ComprasRealizadas(this, listaTransaccionApartadaDTOs);
            frameAnterior.dispose();
            comprasRealizadas.setVisible(true);
        } else {
            this.mostrarCompra(frameAnterior);
        }
    }
    
    public void actualizarSaldoUsuario(String correoElectronico, Double saldo){
        this.usuariosDAO.actualizarSaldo(saldo, correoElectronico);
    }
    
    public List<TransaccionApartadaDTO> obtenerTransaccionApartadaDTOs(String correoElectronico){
        return reservasDAO.obtenerResevasValidas(correoElectronico);
    } 
    
    
    public void comprarBoletoApartado(Integer[] codigosTransacciones, Integer codigoUsuarioComprador, JFrame frameAnterior){
        Double montoTotal = 0d;
        for(Integer codigoTransaccion: codigosTransacciones){
            CompraReservaUsuarioTransaccionDTO compraReservaUsuarioTransaccionDTO = new CompraReservaUsuarioTransaccionDTO(codigoTransaccion, codigoUsuarioComprador);
            this.transaccionesDAO.concretarTransaccion(compraReservaUsuarioTransaccionDTO);
            montoTotal += this.transaccionesDAO.obtenerTransaccion(codigoTransaccion).getPrecioVenta();
        }
        Double saldo = usuariosDAO.obtenerSaldo(codigoUsuarioComprador);
        MontoTotalSaldoFinCompraDTO montoTotalSaldoFinCompraDTO = new MontoTotalSaldoFinCompraDTO(montoTotal, saldo);
        this.mostrarPantallaCompraExitosa(frameAnterior, montoTotalSaldoFinCompraDTO);
    }
    
    public void mostrarPantallaCompraExitosa(JFrame frameAnterior, MontoTotalSaldoFinCompraDTO montoTotalSaldoFinCompraDTO){
        cargaSaldoCompraExitosa = new CargaSaldoCompraExitosa(this, montoTotalSaldoFinCompraDTO.getSaldo(), montoTotalSaldoFinCompraDTO.getPrecioVenta());
        frameAnterior.dispose();
        cargaSaldoCompraExitosa.setVisible(true);
    }
    
    public void mostrarCompra(JFrame frameAnterior){
        EventosDAO eventosDAO = new EventosDAO(new ManejadorConexiones());
        BoletosDAO boletosDAO = new BoletosDAO(new ManejadorConexiones());
        UsuariosDAO usuariosDAO = new UsuariosDAO(new ManejadorConexiones());
        TransaccionesDAO transaccionesDAO = new TransaccionesDAO(new ManejadorConexiones());
        ReservasDAO reservasDAO = new ReservasDAO(new ManejadorConexiones());
        ControlCompra controlCompra = new ControlCompra(eventosDAO, boletosDAO, usuariosDAO, transaccionesDAO, nombreCorreoUsuarioDTO, reservasDAO);
        controlCompra.iniciarCompra(frameAnterior);
    }
}
