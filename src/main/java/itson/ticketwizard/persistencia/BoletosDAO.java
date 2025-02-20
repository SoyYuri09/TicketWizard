package itson.ticketwizard.persistencia;

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
    SELECT bo.codigo, bo.numeroSerie, bo.fila, bo.asiento, bo.codigoEvento FROM Boletos AS bo
    INNER JOIN Transacciones AS ta ON ta.codigoBoleto = bo.codigo
    WHERE ta.codigoUsuarioComprador IS NULL OR ta.codigo IN(
        SELECT re.codigoTransaccion FROM Reservas AS re
        WHERE re.fecha_hora_limite <= NOW());
    */
    
    public List<Boleto> listarBoletos(Integer codigoEventoP){
        String codigoSQL = """
                            SELECT bo_ven.codigo, bo_ven.numeroSerie, bo_ven.fila, bo_ven.asiento, bo_ven.codigoEvento
                            FROM boletos_en_venta AS bo_ven
                            WHERE bo_ven.codigoEvento = ?;
                        """;

        List<Boleto> listaBoletos = new LinkedList<>();
        try {
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setInt(1, codigoEventoP);
            ResultSet resultadosConsultaEventos = comando.executeQuery();
            
            while(resultadosConsultaEventos.next()){ 
                String codigo = resultadosConsultaEventos.getString("codigo");
                String numeroSerie = resultadosConsultaEventos.getString("numeroSerie");
                String fila = resultadosConsultaEventos.getString("fila");
                Integer asiento = resultadosConsultaEventos.getInt("asiento");
                Integer codigoEvento = resultadosConsultaEventos.getInt("codigoEvento");
                
                Boleto boleto = new Boleto(codigo, numeroSerie, fila, asiento, codigoEvento);
                listaBoletos.add(boleto);
            }

        } catch(SQLException ex){
            System.out.println("Error al desplegar los boletos: " + ex.getMessage());
        }
        return listaBoletos; 
    }
    
    public List<Boleto> listarBoletosReventa(Integer codigoEventoP){
        
        String codigoSQL = """
                        SELECT  bo_ven.codigo, bo_ven.numeroSerie, bo_ven.fila, bo_ven.asiento, bo_ven.codigoEvento
                        FROM boletos_en_venta AS bo_ven
                        WHERE bo_ven.codigoEvento = ? AND bo_ven.codigo IN (
                            SELECT ta.codigoBoleto
                            FROM Transacciones AS ta
                            WHERE ta.codigoUsuarioRevendedor IS NOT NULL
                        );   
        """;

        List<Boleto> listaBoletos = new LinkedList<>();
        try {
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setInt(1, codigoEventoP);
            ResultSet resultadosConsultaEventos = comando.executeQuery();
            
            while(resultadosConsultaEventos.next()){ 
                String codigo = resultadosConsultaEventos.getString("codigo");
                String numeroSerie = resultadosConsultaEventos.getString("numeroSerie");
                String fila = resultadosConsultaEventos.getString("fila");
                Integer asiento = resultadosConsultaEventos.getInt("asiento");
                Integer codigoEvento = resultadosConsultaEventos.getInt("codigoEvento");
                
                Boleto boleto = new Boleto(codigo, numeroSerie, fila, asiento, codigoEvento);
                listaBoletos.add(boleto);
            }
            
        } catch(SQLException ex){
            System.out.println("Error al desplegar los boletos: " + ex.getMessage());
        }
        return listaBoletos; 
    }
    
    public List<Boleto> listarBoletosBoletera(Integer codigoEventoP){
        
        String codigoSQL = """
                        SELECT  bo_ven.codigo, bo_ven.numeroSerie, bo_ven.fila, bo_ven.asiento, bo_ven.codigoEvento
                        FROM boletos_en_venta AS bo_ven
                        WHERE bo_ven.codigoEvento = ? AND bo_ven.codigo IN (
                            SELECT ta.codigoBoleto
                            FROM Transacciones AS ta
                            WHERE ta.codigoUsuarioRevendedor IS NULL
                        );
        """;

        List<Boleto> listaBoletos = new LinkedList<>();
        try {
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setInt(1, codigoEventoP);
            ResultSet resultadosConsultaEventos = comando.executeQuery();
            
            while(resultadosConsultaEventos.next()){ 
                String codigo = resultadosConsultaEventos.getString("bo_ven.codigo");
                String numeroSerie = resultadosConsultaEventos.getString("bo_ven.numeroSerie");
                String fila = resultadosConsultaEventos.getString("bo_ven.fila");
                Integer asiento = resultadosConsultaEventos.getInt("bo_ven.asiento");
                Integer codigoEvento = resultadosConsultaEventos.getInt("bo_ven.codigoEvento");
                
                Boleto boleto = new Boleto(codigo, numeroSerie, fila, asiento, codigoEvento);
                listaBoletos.add(boleto);
            }

        } catch(SQLException ex){
            System.out.println("Error al desplegar los boletos: " + ex.getMessage());
        }
        return listaBoletos; 
    }
     
}
