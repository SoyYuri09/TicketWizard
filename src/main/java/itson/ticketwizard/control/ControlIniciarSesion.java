
package itson.ticketwizard.control;

import itson.ticketwizard.dtos.NuevoUsuarioDTO;
import itson.ticketwizard.persistencia.UsuariosDAO;
import itson.ticketwizard.presentacion.IngresoDatosInicioSesion;
import itson.ticketwizard.presentacion.InicioSesionUsuario;
import itson.ticketwizard.presentacion.IngresoDatosRegistro;


public class ControlIniciarSesion {
    private InicioSesionUsuario pantallaInicioSesion;
    private IngresoDatosRegistro formIngresoDatosRegistro;
    private IngresoDatosInicioSesion formIngresoDatosInicioSesion;
    
    private UsuariosDAO usuariosDAO;

    public ControlIniciarSesion(UsuariosDAO usuariosDAO) {
        this.usuariosDAO = usuariosDAO;
        pantallaInicioSesion = new InicioSesionUsuario(this);
    }
    
    public void iniciarCasoUso(){
        this.pantallaInicioSesion.setVisible(true);
    }
    
    public void mostrarFormularioRegistro(){
        formIngresoDatosRegistro = new IngresoDatosRegistro(this);
        pantallaInicioSesion.dispose();
        formIngresoDatosRegistro.setVisible(true);
    }
    
    public void mostrarFormularioIngreso(){
        formIngresoDatosInicioSesion = new IngresoDatosInicioSesion(this);
        pantallaInicioSesion.dispose();
        formIngresoDatosInicioSesion.setVisible(true);
    }
    
    public void validarUsuario(NuevoUsuarioDTO nuevoUsuarioDTO){
        
        if(usuariosDAO.validarExistencia(nuevoUsuarioDTO)){
            formIngresoDatosRegistro.mostrarMensajeUsuarioExistente();
        }
    }
    
    public void volverPantallaIniciarSesion(){
        this.formIngresoDatosRegistro.dispose();
        this.iniciarCasoUso();
    }

    
    
}
