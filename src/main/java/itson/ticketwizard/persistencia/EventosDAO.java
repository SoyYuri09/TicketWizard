package itson.ticketwizard.persistencia;
import itson.ticketwizard.entidades.Evento;
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

public class EventosDAO {
    
    private final ManejadorConexiones manejadorConexiones;
    
    
    public EventosDAO(ManejadorConexiones manejadorConexiones){
        this.manejadorConexiones = manejadorConexiones;
    }
    
    public List<Evento> listarEventos(){
        String codigoSQL = """
                            SELECT 
                           	codigo,
                                nombre,
                                recinto,
                                descripcion,
                                fecha,
                                estado,
                                ciudad
                            FROM EVENTOS;
        """;

        List<Evento> listaEventos = new LinkedList<>();
        try {
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            ResultSet resultadosConsultaEventos = comando.executeQuery();
            while(resultadosConsultaEventos.next()){
                Integer codigo = resultadosConsultaEventos.getInt("codigo");
                String nombre = resultadosConsultaEventos.getString("nombre");
                String recinto = resultadosConsultaEventos.getString("recinto");
                String descripcion = resultadosConsultaEventos.getString("descripcion");
                String fecha = resultadosConsultaEventos.getString("fecha");
                String estado = resultadosConsultaEventos.getString("estado");
                String ciudad = resultadosConsultaEventos.getString("ciudad");
                Evento evento = new Evento(codigo, nombre, recinto, descripcion, fecha, estado, ciudad);
                listaEventos.add(evento);
            }
        } catch(SQLException ex){
            System.out.println("Error al desplegar los eventos: " + ex.getMessage());
        }
        return listaEventos;
    }
    
}