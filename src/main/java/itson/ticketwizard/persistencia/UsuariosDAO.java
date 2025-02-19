/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.ticketwizard.persistencia;

import itson.ticketwizard.dtos.NuevoUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuariosDAO {
    private final ManejadorConexiones manejadorConexiones;
    
    
    public UsuariosDAO(ManejadorConexiones manejadorConexiones){
        this.manejadorConexiones = manejadorConexiones;
    }
    
    public boolean validarExistencia(NuevoUsuarioDTO usuarioDTO){
        String codigoSQL = """
                           SELECT COUNT(correoElectronico) AS numeroUsuarios
                           FROM Usuarios
                           WHERE correoElectronico = ?;
                           """;
        
        boolean usuarioExiste = false;
        try(
            Connection conexion = manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);

        ){
            comando.setString(1, usuarioDTO.getCorreoElectronico());
            try(
                ResultSet resultados = comando.executeQuery();
            ){
                while(resultados.next()){
                
                    usuarioExiste = resultados.getInt("numeroUsuarios") == 1;
                }
            }
  
        } catch (SQLException e){
            System.err.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }
        
        return usuarioExiste;
        
    }
}
