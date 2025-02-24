
package itson.ticketwizard.persistencia;

import itson.ticketwizard.dtos.NuevaDireccionUsuarioDTO;
import itson.ticketwizard.entidades.DireccionUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class DireccionesUsuariosDAO {
    private final ManejadorConexiones manejadorConexiones;
    
    
    public DireccionesUsuariosDAO(ManejadorConexiones manejadorConexiones){
        this.manejadorConexiones = manejadorConexiones;
    }
    
    public DireccionUsuario registrar(NuevaDireccionUsuarioDTO nuevaDireccionUsuarioDTO){
        String codigoSQLInsercion = """
                           INSERT INTO DireccionesUsuarios (
                           numero, 
                           calle, 
                           colonia, 
                           ciudad, 
                           estado
                           ) VALUES (?, ?, ?, ?, ?);
                           """;
        
        String codigoSQLConsultaCodigo = "SELECT LAST_INSERT_ID() AS Codigo;";
        
        DireccionUsuario direccionUsuario = null;
        try(
            Connection conexion = manejadorConexiones.crearConexion();
            PreparedStatement comando1 = conexion.prepareStatement(codigoSQLInsercion);
            PreparedStatement comando2 = conexion.prepareStatement(codigoSQLConsultaCodigo);
                
        ){
            comando1.setInt(1, nuevaDireccionUsuarioDTO.getNumero());
            comando1.setString(2, nuevaDireccionUsuarioDTO.getCalle());
            comando1.setString(3, nuevaDireccionUsuarioDTO.getColonia());
            comando1.setString(4, nuevaDireccionUsuarioDTO.getCiudad());
            comando1.setString(5, nuevaDireccionUsuarioDTO.getEstado());
            
            int filasAfectadas = comando1.executeUpdate();
            
            try(
                ResultSet resultado = comando2.executeQuery();
            ){
                Integer codigo = null;
                while(resultado.next()){
                    codigo = resultado.getInt("Codigo");
                }
            
                direccionUsuario = new DireccionUsuario(codigo, nuevaDireccionUsuarioDTO.getEstado(),
                        nuevaDireccionUsuarioDTO.getCiudad(), nuevaDireccionUsuarioDTO.getColonia(),
                        nuevaDireccionUsuarioDTO.getCalle(), nuevaDireccionUsuarioDTO.getNumero());
            }
            
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }

        return direccionUsuario;
    }
    
}
