package itson.ticketwizard.persistencia;

import itson.ticketwizard.dtos.UsuarioEventoElegidoDTO;
import itson.ticketwizard.entidades.Boleto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class BoletosDAO {
    
    private final ManejadorConexiones manejadorConexiones;
    
    
    public BoletosDAO(ManejadorConexiones manejadorConexiones){
        this.manejadorConexiones = manejadorConexiones;
    }
    
    
    /*
    Considerando que existe la sigueinte vista boletos_en_venta:
    
    CREATE VIEW boletos_en_venta AS
    SELECT bo.codigo, bo.numeroSerie, bo.fila, bo.asiento, bo.precio, bo.codigoEvento FROM Boletos AS bo
    INNER JOIN Transacciones AS ta ON ta.codigoBoleto = bo.codigo
    WHERE ta.codigoUsuarioComprador IS NULL OR ta.codigo IN(
        SELECT re.codigoTransaccion FROM Reservas AS re
        WHERE re.fecha_hora_limite <= NOW());
    */
    
    public Boleto obtenerBoleto(Integer codigoBoleto){
        String codigoSQL = """
                           SELECT codigo,
                           	numeroSerie,
                           	fila, 
                           	asiento,
                                precio,
                           	codigoEvento
                           FROM Boletos
                           WHERE codigo = ?;
                           """;
        
        Boleto boleto = null;
        
        try{
            
            Connection conexion = this.manejadorConexiones.crearConexion();
            
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setInt(1, codigoBoleto);
            
            ResultSet resultadosConsultaBoleto = comando.executeQuery();
            
            while(resultadosConsultaBoleto.next()){
                Integer codigo = resultadosConsultaBoleto.getInt("codigo");
                String numeroSerie = resultadosConsultaBoleto.getString("numeroSerie");
                String fila = resultadosConsultaBoleto.getString("fila");
                Integer asiento = resultadosConsultaBoleto.getInt("asiento");
                Double precio = resultadosConsultaBoleto.getDouble("precio");
                Integer codigoEvento = resultadosConsultaBoleto.getInt("codigoEvento");
                
                boleto = new Boleto(codigo, numeroSerie, fila, asiento, precio, codigoEvento);
  
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return boleto;
    }
    
    
    
    
    
    public List<Boleto> listarBoletos(UsuarioEventoElegidoDTO usuarioEventoElegidoDTO){
        String codigoSQL = """
                            SELECT
                            	bo.codigo,
                                bo.numeroSerie,
                                bo.fila, 
                                bo.asiento,
                                bo.precio,
                                bo.codigoEvento
                            FROM Boletos AS bo
                            WHERE bo.codigoEvento = ? AND bo.codigo IN(
                            	SELECT ta.codigoBoleto 
                                FROM Transacciones AS ta
                                LEFT JOIN Reservas AS re ON ta.codigo = re.codigoTransaccion
                                WHERE (ta.codigoUsuarioRevendedor IS NULL OR ta.codigoUsuarioRevendedor != ?)
                                AND ta.codigoUsuarioComprador IS NULL AND (re.fechaHoraLimite IS NULL OR re.fechaHoraLimite <= NOW())
                            ) ORDER BY bo.fila ASC, bo.asiento ASC;
                        """;

        List<Boleto> listaBoletos = new LinkedList<>();
        try {
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setInt(1, usuarioEventoElegidoDTO.getCodigoEvento());
            comando.setInt(2, usuarioEventoElegidoDTO.getCodigoUsuario());
            
            ResultSet resultadosConsultaBoletos = comando.executeQuery();
            
            while(resultadosConsultaBoletos.next()){ 
                Integer codigo = resultadosConsultaBoletos.getInt("codigo");
                String numeroSerie = resultadosConsultaBoletos.getString("numeroSerie");
                String fila = resultadosConsultaBoletos.getString("fila");
                Integer asiento = resultadosConsultaBoletos.getInt("asiento");
                Double precio = resultadosConsultaBoletos.getDouble("precio");
                Integer codigoEvento = resultadosConsultaBoletos.getInt("codigoEvento");
                
                Boleto boleto = new Boleto(codigo, numeroSerie, fila, asiento, precio, codigoEvento);
                listaBoletos.add(boleto);
            }

        } catch(SQLException ex){
            System.out.println("Error al desplegar los boletos: " + ex.getMessage());
        }
        return listaBoletos; 
    }
    
    public List<Boleto> listarBoletosReventa(UsuarioEventoElegidoDTO usuarioEventoElegidoDTO){
        
        String codigoSQL = """
                        SELECT
                            bo.codigo,
                            bo.numeroSerie,
                            bo.fila, 
                            bo.asiento,
                            bo.precio,
                            bo.codigoEvento
                        FROM Boletos AS bo
                        WHERE bo.codigoEvento = ? AND bo.codigo IN(
                        	SELECT ta.codigoBoleto 
                            FROM Transacciones AS ta
                            LEFT JOIN Reservas AS re ON ta.codigo = re.codigoTransaccion
                            WHERE ta.codigoUsuarioRevendedor IS NOT NULL AND ta.codigoUsuarioRevendedor != ?
                            AND ta.codigoUsuarioComprador IS NULL AND (re.fechaHoraLimite IS NULL OR re.fechaHoraLimite <= NOW())
                        ) ORDER BY bo.fila ASC, bo.asiento ASC;
        """;

        List<Boleto> listaBoletos = new LinkedList<>();
        try {
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setInt(1, usuarioEventoElegidoDTO.getCodigoEvento());
            comando.setInt(2, usuarioEventoElegidoDTO.getCodigoUsuario());
            ResultSet resultadosConsultaBoletos = comando.executeQuery();
            
            while(resultadosConsultaBoletos.next()){ 
                Integer codigo = resultadosConsultaBoletos.getInt("codigo");
                String numeroSerie = resultadosConsultaBoletos.getString("numeroSerie");
                String fila = resultadosConsultaBoletos.getString("fila");
                Integer asiento = resultadosConsultaBoletos.getInt("asiento");
                Double precio = resultadosConsultaBoletos.getDouble("precio");
                Integer codigoEvento = resultadosConsultaBoletos.getInt("codigoEvento");
                
                Boleto boleto = new Boleto(codigo, numeroSerie, fila, asiento, precio, codigoEvento);
                listaBoletos.add(boleto);
            }
            
        } catch(SQLException ex){
            System.out.println("Error al desplegar los boletos: " + ex.getMessage());
        }
        return listaBoletos; 
    }
    
    public List<Boleto> listarBoletosBoletera(Integer codigoEventoP){

        String codigoSQL = """
                        SELECT
                            bo.codigo,
                            bo.numeroSerie,
                            bo.fila, 
                            bo.asiento,
                            bo.precio,
                            bo.codigoEvento
                        FROM Boletos AS bo
                        WHERE bo.codigoEvento = ? AND EXISTS(
                        	SELECT 1 FROM Transacciones AS ta
                            LEFT JOIN Reservas AS re ON ta.codigo = re.codigoTransaccion
                            WHERE ta.codigoBoleto = bo.codigo AND ta.codigoUsuarioRevendedor IS NULL
                            AND ta.codigoUsuarioComprador IS NULL AND (re.fechaHoraLimite IS NULL OR re.fechaHoraLimite <= NOW())
                        ) ORDER BY bo.fila ASC, bo.asiento ASC;
        """;

        List<Boleto> listaBoletos = new LinkedList<>();
        try {
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setInt(1, codigoEventoP);
            ResultSet resultadosConsultaBoletos = comando.executeQuery();
            
            while(resultadosConsultaBoletos.next()){ 
                Integer codigo = resultadosConsultaBoletos.getInt("codigo");
                String numeroSerie = resultadosConsultaBoletos.getString("numeroSerie");
                String fila = resultadosConsultaBoletos.getString("fila");
                Integer asiento = resultadosConsultaBoletos.getInt("asiento");
                Double precio = resultadosConsultaBoletos.getDouble("precio");
                Integer codigoEvento = resultadosConsultaBoletos.getInt("codigoEvento");
                
                Boleto boleto = new Boleto(codigo, numeroSerie, fila, asiento, precio, codigoEvento);
                listaBoletos.add(boleto);
            }

        } catch(SQLException ex){
            System.out.println("Error al desplegar los boletos: " + ex.getMessage());
        }
        return listaBoletos; 
    }
     
}
