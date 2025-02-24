
package itson.ticketwizard.persistencia;

import itson.ticketwizard.dtos.CompraReservaUsuarioTransaccionDTO;
import itson.ticketwizard.entidades.Boleto;
import itson.ticketwizard.entidades.Transaccion;
import itson.ticketwizard.entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class TransaccionesDAO {
    
    private final ManejadorConexiones manejadorConexiones;
    
    
    public TransaccionesDAO(ManejadorConexiones manejadorConexiones){
        this.manejadorConexiones = manejadorConexiones;
    }
    
    
    public Transaccion obtenerVentasVigentesBoleto(Integer codigoBoletoP){
        String codigoSQL = """
                            SELECT 
                            	codigo, 
                            	fechaLimite, 
                            	fechaHora,
                            	numeroSerieBoleto, 
                            	codigoBoleto, 
                            	codigoUsuarioRevendedor,
                            	codigoUsuarioComprador,
                                precioVenta
                            FROM Transacciones AS ta
                            WHERE codigoBoleto = ? AND
                            (codigoUsuarioComprador IS NULL OR EXISTS 
                            	(SELECT 1 FROM Reservas AS re
                            	WHERE re.codigoTransaccion = ta.codigo
                            	AND (re.fechaHoraLimite IS NULL OR re.fechaHoraLimite <= NOW())));
                        """;

        Transaccion transaccion = null;
        try {
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setInt(1, codigoBoletoP);
            ResultSet resultadosConsultaTransacciones = comando.executeQuery();
            
            while(resultadosConsultaTransacciones.next()){ 
                Integer codigo = resultadosConsultaTransacciones.getInt("codigo");
                String fechaLimite = resultadosConsultaTransacciones.getString("fechaLimite");
                String fechaHora = resultadosConsultaTransacciones.getString("fechaHora");
                String numeroSerieBoleto = resultadosConsultaTransacciones.getString("numeroSerieBoleto");
                Integer codigoBoleto = resultadosConsultaTransacciones.getInt("codigoBoleto");
                Integer codigoUsuarioRevendedor = resultadosConsultaTransacciones.getInt("codigoUsuarioRevendedor");
                Integer codigoUsuarioComprador = resultadosConsultaTransacciones.getInt("codigoUsuarioComprador");
                Double precioVenta = resultadosConsultaTransacciones.getDouble("precioVenta");
                
                transaccion = new Transaccion(codigo, fechaLimite, fechaHora, numeroSerieBoleto, codigoBoleto, 
                        codigoUsuarioRevendedor, codigoUsuarioComprador, precioVenta);
            }

        } catch(SQLException ex){
            System.out.println("Error al obtener las transacciones: " + ex.getMessage());
        }
        return transaccion; 
    }
    
    public void concretarTransaccion(CompraReservaUsuarioTransaccionDTO compraReservaUsuarioTransaccionDTO){
        String codigoSQL = """
                            CALL actualizarCuentasTransaccion(?, ?);
                        """;

        try {
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setInt(1, compraReservaUsuarioTransaccionDTO.getCodigoUsuario());
            comando.setInt(2, compraReservaUsuarioTransaccionDTO.getCodigoTransaccion());
            int filasAfectadas = comando.executeUpdate();
            

        } catch(SQLException ex){
            System.out.println("Error al obtener las transacciones: " + ex.getMessage());
        }

    }
    
    public Transaccion obtenerTransaccion(Integer codigoTransaccion){
        String codigoSQL = """
                           SELECT 
                                codigo,
                                fechaLimite,
                                fechaHora,
                                numeroSerieBoleto,
                                precioVenta,
                                codigoBoleto,
                                codigoUsuarioRevendedor,
                                codigoUsuarioComprador,
                           FROM Transacciones
                           WHERE codigo = ?;
                           """;
        
        Transaccion transaccion = null;
        try(
            Connection conexion = manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);

        ){
            comando.setInt(1, codigoTransaccion);
            try(
                ResultSet resultados = comando.executeQuery();
            ){
                while(resultados.next()){
                    Integer codigo = resultados.getInt("codigo");
                    String fechaLimite = resultados.getString("fechaLimite");
                    String fechaHora = resultados.getString("fechaHora");
                    String numeroSerieBoleto = resultados.getString("numeroSerieBoleto");
                    Double precioVenta = resultados.getDouble("precioVenta");
                    Integer codigoBoleto = resultados.getInt("codigoBoleto");
                    Integer codigoUsuarioRevendedor = resultados.getInt("codigoUsuarioRevendedor");
                    Integer codigoUsuarioComprador = resultados.getInt("codigoUsuarioComprador");
                    
                    transaccion = new Transaccion(codigo, fechaLimite, fechaHora, numeroSerieBoleto, codigoBoleto, codigoUsuarioRevendedor, codigoUsuarioComprador, precioVenta);
                }
            }
  
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }

        return transaccion;
        
    }
    
}
