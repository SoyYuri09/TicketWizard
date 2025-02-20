package itson.ticketwizard.persistencia;

import itson.ticketwizard.entidades.Boleto;
import itson.ticketwizard.entidades.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Usuario
 */
public class BoletosDAO {
    
    private final ManejadorConexiones manejadorConexiones;
    
    
    public BoletosDAO(ManejadorConexiones manejadorConexiones){
        this.manejadorConexiones = manejadorConexiones;
    }
    
    public List<Boleto> listarBoletos(Integer codigoEventoP){
        String codigoSQL = """
                            SELECT 
                           	codigo,
                                numeroSerie,
                                fila,
                                asiento,
                                codigoEvento
                            FROM BOLETOS
                            WHERE codigoEvento = ?;
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
            System.out.println(listaBoletos);
        } catch(SQLException ex){
            System.out.println("Error al desplegar los boletos: " + ex.getMessage());
        }
        return listaBoletos; 
    }
    
}
