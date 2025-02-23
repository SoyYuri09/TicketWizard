
package itson.ticketwizard.persistencia;

import itson.ticketwizard.dtos.IngresoUsuarioDTO;
import itson.ticketwizard.dtos.NuevoUsuarioDTO;
import itson.ticketwizard.entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class UsuariosDAO {
    private final ManejadorConexiones manejadorConexiones;
    
    
    public UsuariosDAO(ManejadorConexiones manejadorConexiones){
        this.manejadorConexiones = manejadorConexiones;
    }
    
    public boolean validarExistencia(String correoElectronico){
        String codigoSQL = """
                           SELECT correoElectronico
                           FROM Usuarios
                           WHERE correoElectronico = ?;
                           """;
        
        boolean usuarioExiste = false;
        try(
            Connection conexion = manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);

        ){
            comando.setString(1, correoElectronico);
            try(
                ResultSet resultados = comando.executeQuery();
            ){
                while(resultados.next()){
                
                    if(resultados.getString("correoElectronico") != null)
                        usuarioExiste = true;
                }
            }
  
        } catch (SQLException e){
            System.err.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }
        System.out.println(usuarioExiste);
        return usuarioExiste;
        
    }
    
    public Usuario obtenerUsuario(String correoElectronico){
        String codigoSQL = """
                           SELECT 
                                codigo,
                                nombres,
                                apellidoPaterno,
                                apellidoMaterno,
                                contrasenia,
                                correoElectronico,
                                fechaNacimiento,
                                saldo,
                                codigoDireccion
                           FROM Usuarios
                           WHERE correoElectronico = ?;
                           """;
        
        Usuario usuario = null;
        try(
            Connection conexion = manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);

        ){
            comando.setString(1, correoElectronico);
            try(
                ResultSet resultados = comando.executeQuery();
            ){
                while(resultados.next()){
                    Integer codigo = resultados.getInt("codigo");
                    String nombres = resultados.getString("nombres");
                    String apellidoPaterno = resultados.getString("apellidoPaterno");
                    String apellidoMaterno = resultados.getString("apellidoMaterno");
                    String contrasenia = resultados.getString("correoElectronico");
                    String fechaNacimiento = resultados.getString("fechaNacimiento");
                    Double saldo = resultados.getDouble("saldo");
                    Integer codigoDireccion = resultados.getInt("codigoDireccion");
                    
                    usuario = new Usuario(codigo, nombres, apellidoPaterno, apellidoMaterno, correoElectronico, fechaNacimiento, contrasenia, saldo, codigoDireccion);
                }
            }
  
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }

        return usuario;
        
    }
    
    public Usuario registrar(NuevoUsuarioDTO nuevoUsuarioDTO){
        String codigoSQLInsercion = """
                           INSERT INTO Usuarios (
                           nombres, 
                           apellidoPaterno, 
                           apellidoMaterno, 
                           contrasenia, 
                           correoElectronico, 
                           fechaNacimiento, 
                           saldo,
                           codigoDireccion
                           ) VALUES (?, ?, ?, ?, ?, ?, ?, ?);
                           """;
        
        String codigoSQLConsultaCodigo = "SELECT LAST_INSERT_ID() AS Codigo;";
        
        Usuario usuario = null;
        try(
            Connection conexion = manejadorConexiones.crearConexion();
            PreparedStatement comando1 = conexion.prepareStatement(codigoSQLInsercion);
            PreparedStatement comando2 = conexion.prepareStatement(codigoSQLConsultaCodigo);

        ){
            comando1.setString(1, nuevoUsuarioDTO.getNombres());
            comando1.setString(2, nuevoUsuarioDTO.getApellidoPaterno());
            comando1.setString(3, nuevoUsuarioDTO.getApellidoMaterno());
            comando1.setString(4, nuevoUsuarioDTO.getContrasenia());
            comando1.setString(5, nuevoUsuarioDTO.getCorreoElectronico());
            comando1.setString(6, nuevoUsuarioDTO.getFechaNacimiento());
            comando1.setDouble(7, 0);
            comando1.setInt(8, nuevoUsuarioDTO.getCodigoDireccion());
            
            int filasAfectadas = comando1.executeUpdate();
            
            try(
                ResultSet resultado = comando2.executeQuery();
            ){
                Integer codigo = null;
                while(resultado.next()){
                    codigo = resultado.getInt("Codigo");
                }
            
                usuario = new Usuario(codigo, nuevoUsuarioDTO.getNombres(),
                        nuevoUsuarioDTO.getApellidoPaterno(), nuevoUsuarioDTO.getApellidoMaterno(),
                        nuevoUsuarioDTO.getContrasenia(), nuevoUsuarioDTO.getCorreoElectronico(),
                        nuevoUsuarioDTO.getFechaNacimiento(), 0d, nuevoUsuarioDTO.getCodigoDireccion());
            }
  
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return usuario;
    }
    
    
    public boolean validarUsuarioContrasenia(IngresoUsuarioDTO ingresoUsuarioDTO){
        String codigoSQL = """
                           SELECT correoElectronico, contrasenia
                           FROM Usuarios
                           WHERE correoElectronico = ?
                           AND contrasenia = ?;
                           """;
        
        boolean usuarioValido = false;
        try(
            Connection conexion = manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);

        ){
            comando.setString(1, ingresoUsuarioDTO.getCorreoElectronico());
            comando.setString(2, ingresoUsuarioDTO.getContrasenia());
            
            try(
                ResultSet resultados = comando.executeQuery();
            ){
                while(resultados.next()){
                
                    if(resultados.getString("correoElectronico") != null)
                        usuarioValido = true;
                }
            }
  
        } catch (SQLException e){
            System.err.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }

        return usuarioValido;
        
    }
    
    public String obtenerNombres(String correoElectronico){
        String codigoSQL = """
                           SELECT nombres
                           FROM Usuarios
                           WHERE correoElectronico = ?
                           """;
        
        String nombres = null;
        try(
            Connection conexion = manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);

        ){
            comando.setString(1, correoElectronico);
            
            try(
                ResultSet resultados = comando.executeQuery();
            ){
                while(resultados.next()){
                
                    if(resultados.getString("nombres") != null){
                        nombres = resultados.getString("nombres");
                    }             
                }
            }
  
        } catch (SQLException e){
            System.err.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }

        return nombres;
        
    } 
    
    public String obtenerApellidoPaterno(String correoElectronico){
        String codigoSQL = """
                           SELECT apellidoPaterno
                           FROM Usuarios
                           WHERE correoElectronico = ?
                           """;
        
        String apellidoPaterno = null;
        try(
            Connection conexion = manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);

        ){
            comando.setString(1, correoElectronico);
            
            try(
                ResultSet resultados = comando.executeQuery();
            ){
                while(resultados.next()){
                    if(resultados.getString("apellidoPaterno") != null){
                        apellidoPaterno = resultados.getString("apellidoPaterno");
                    }             
                }
            }
  
        } catch (SQLException e){
            System.err.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }

        return apellidoPaterno;
    }
    
    public String obtenerApellidoMaterno(String correoElectronico){
        String codigoSQL = """
                           SELECT apellidoMaterno
                           FROM Usuarios
                           WHERE correoElectronico = ?
                           """;
        
        String apellidoMaterno = null;
        try(
            Connection conexion = manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);

        ){
            comando.setString(1, correoElectronico);
            
            try(
                ResultSet resultados = comando.executeQuery();
            ){
                while(resultados.next()){
                    if(resultados.getString("apellidoMaterno") != null){
                        apellidoMaterno = resultados.getString("apellidoMaterno");
                    }             
                }
            }
  
        } catch (SQLException e){
            System.err.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }

        return apellidoMaterno;
    }
}
