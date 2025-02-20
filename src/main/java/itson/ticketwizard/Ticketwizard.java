package itson.ticketwizard;

import itson.ticketwizard.control.ControlIniciarSesion;
import itson.ticketwizard.persistencia.ManejadorConexiones;
import itson.ticketwizard.persistencia.UsuariosDAO;
import itson.ticketwizard.presentacion.IngresoDatosRegistro;
/**
 * @author romom
 */
public class Ticketwizard {

    public static void main(String[] args) {
        ManejadorConexiones manejadorConexiones = new ManejadorConexiones();
        UsuariosDAO usuariosDAO = new UsuariosDAO(manejadorConexiones);
        
        ControlIniciarSesion control = new ControlIniciarSesion(usuariosDAO);
        control.iniciarCasoUso();
    }
}
