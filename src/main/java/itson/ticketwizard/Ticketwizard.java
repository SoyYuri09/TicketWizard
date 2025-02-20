/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package itson.ticketwizard;

import itson.ticketwizard.control.ControlIniciarSesion;
import itson.ticketwizard.persistencia.DireccionesUsuariosDAO;
import itson.ticketwizard.persistencia.ManejadorConexiones;
import itson.ticketwizard.persistencia.UsuariosDAO;

/**
 *
 * @author romom
 */
public class Ticketwizard {

    public static void main(String[] args) {
        
        ManejadorConexiones manejadorConexiones = new ManejadorConexiones();
        UsuariosDAO usuariosDAO = new UsuariosDAO(manejadorConexiones);
        DireccionesUsuariosDAO direccionesUsuariosDAO = new DireccionesUsuariosDAO(manejadorConexiones);
        
        ControlIniciarSesion control = new ControlIniciarSesion(usuariosDAO, direccionesUsuariosDAO);
        control.iniciarCasoUso();
    }
}
