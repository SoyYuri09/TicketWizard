
package itson.ticketwizard.control;

import itson.ticketwizard.dtos.IngresoUsuarioDTO;
import itson.ticketwizard.dtos.NombreCorreoUsuarioDTO;
import itson.ticketwizard.dtos.NuevaDireccionUsuarioDTO;
import itson.ticketwizard.dtos.NuevoUsuarioDTO;
import itson.ticketwizard.dtos.SolicitudRegistroUsuarioDTO;
import itson.ticketwizard.dtos.UsuarioEventoElegidoDTO;
import itson.ticketwizard.entidades.DireccionUsuario;
import itson.ticketwizard.entidades.Usuario;
import itson.ticketwizard.persistencia.BoletosDAO;
import itson.ticketwizard.persistencia.DireccionesUsuariosDAO;
import itson.ticketwizard.persistencia.EventosDAO;
import itson.ticketwizard.persistencia.ManejadorConexiones;
import itson.ticketwizard.persistencia.ReservasDAO;
import itson.ticketwizard.persistencia.TransaccionesDAO;
import itson.ticketwizard.persistencia.UsuariosDAO;
import itson.ticketwizard.presentacion.IngresoDatosInicioSesion;
import itson.ticketwizard.presentacion.InicioSesionUsuario;
import itson.ticketwizard.presentacion.IngresoDatosRegistro;
import itson.ticketwizard.presentacion.EventosDisponibles;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class ControlIniciarSesion {
    private InicioSesionUsuario pantallaInicioSesion;
    private IngresoDatosRegistro formIngresoDatosRegistro;
    private IngresoDatosInicioSesion formIngresoDatosInicioSesion;
    private EventosDisponibles formOpcionesDeUsuario;
    
    private UsuariosDAO usuariosDAO;
    private DireccionesUsuariosDAO direccionesUsuariosDAO;

    public ControlIniciarSesion(UsuariosDAO usuariosDAO, DireccionesUsuariosDAO direccionesUsuariosDAO) {
        this.usuariosDAO = usuariosDAO;
        this.direccionesUsuariosDAO = direccionesUsuariosDAO;
    }
    
    public void iniciarCasoUso(){
        pantallaInicioSesion = new InicioSesionUsuario(this);
        this.pantallaInicioSesion.setVisible(true);
    }
    
    public void mostrarFormularioRegistro(JFrame frameAnterior){
        formIngresoDatosRegistro = new IngresoDatosRegistro(this);
        frameAnterior.dispose();
        formIngresoDatosRegistro.setVisible(true);
    }
    
    public void mostrarFormularioIngreso(JFrame frameAnterior){
        formIngresoDatosInicioSesion = new IngresoDatosInicioSesion(this);
        frameAnterior.dispose();
        formIngresoDatosInicioSesion.setVisible(true);
    }
    
    public void inciarSesion(IngresoUsuarioDTO ingresoUsuarioDTO){
        if(usuariosDAO.validarUsuarioContrasenia(ingresoUsuarioDTO) == true){
            String correoElectronico = ingresoUsuarioDTO.getCorreoElectronico();
            String nombreUsuario = usuariosDAO.obtenerNombres(correoElectronico);
            String apellidoPaternoUsuario = usuariosDAO.obtenerApellidoPaterno(correoElectronico);
            String apellidoMaternoUsuario = usuariosDAO.obtenerApellidoMaterno(correoElectronico);

            NombreCorreoUsuarioDTO nombreCorreoUsuarioDTO = new NombreCorreoUsuarioDTO(nombreUsuario, apellidoPaternoUsuario, apellidoMaternoUsuario, correoElectronico);
            this.terminarInicioSesion(nombreCorreoUsuarioDTO);
        }
        else{
            formIngresoDatosInicioSesion.mostrarMensajeUsuarioContraseniaInvalido("Usuario y/o contraseña incorrectos", "Datos erróneos", 1);
        }
    }
  
    public void terminarInicioSesion(NombreCorreoUsuarioDTO nombreCorreoUsuarioDTO){
        EventosDAO eventosDAO = new EventosDAO(new ManejadorConexiones());
        BoletosDAO boletosDAO = new BoletosDAO(new ManejadorConexiones());
        UsuariosDAO usuariosDAO = new UsuariosDAO(new ManejadorConexiones());
        TransaccionesDAO transaccionesDAO = new TransaccionesDAO(new ManejadorConexiones());
        ReservasDAO reservasDAO = new ReservasDAO(new ManejadorConexiones());
        ControlCompra controlCompra = new ControlCompra(eventosDAO, boletosDAO, usuariosDAO, transaccionesDAO, nombreCorreoUsuarioDTO, reservasDAO);
        controlCompra.iniciarCompra(formIngresoDatosInicioSesion);
    }
    
    public void registrarUsuario(SolicitudRegistroUsuarioDTO solicitudRegistroUsuario){
        
        if(usuariosDAO.validarExistencia(solicitudRegistroUsuario.getCorreoElectronico())){
            formIngresoDatosRegistro.mostrarMensajeUsuarioExistente("El usuario " + solicitudRegistroUsuario.getCorreoElectronico() + " ya está en uso",
                    "Correo electrónico inválido", JOptionPane.INFORMATION_MESSAGE);
        } else{
            NuevaDireccionUsuarioDTO nuevaDireccionUsuarioDTO = 
                    new NuevaDireccionUsuarioDTO(solicitudRegistroUsuario.getEstado(), solicitudRegistroUsuario.getCiudad(),
                    solicitudRegistroUsuario.getColonia(), solicitudRegistroUsuario.getCalle(), solicitudRegistroUsuario.getNumero());
            
            DireccionUsuario direccionUsuario = direccionesUsuariosDAO.registrar(nuevaDireccionUsuarioDTO);
            
            
            NuevoUsuarioDTO nuevoUsuarioDTO = new NuevoUsuarioDTO(solicitudRegistroUsuario.getNombres(), 
                    solicitudRegistroUsuario.getApellidoPaterno(),solicitudRegistroUsuario.getApellidoMaterno(), 
                    solicitudRegistroUsuario.getCorreoElectronico(), solicitudRegistroUsuario.getFechaNacimiento(), 
                    solicitudRegistroUsuario.getContrasenia(), direccionUsuario.getCodigo());
            
            Usuario usuario = usuariosDAO.registrar(nuevoUsuarioDTO);
            
            formIngresoDatosRegistro.mostrarMensajeUsuarioExistente("Registro exitoso",
                    "Correo electrónico inválido", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void volverPantallaIniciarSesion(JFrame frameAnterior){
        frameAnterior.dispose();
        this.iniciarCasoUso();
    }
    
    
    
}
