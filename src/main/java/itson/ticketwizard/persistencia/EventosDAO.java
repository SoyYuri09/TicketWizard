package itson.ticketwizard.persistencia;
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

        List<Evento> listarEventos = new LinkedList<>();
        try {
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            //Si hubiera parámetros se pone comando.setStrin(), en este caso es una consulta así que no
            ResultSet resultadosConsultaEventos = comando.executeQuery(); //executeQuery es para las consultas para que las filas de workbench salgan en java
            while(resultadosConsultaEventos.next()){ //Cuando no sabes que tantas iteraciones hay es recomendable usar el while, mover a cada una de las filas devueltas
                //Estamos dentro de una fila y podemos sacar cada una de sus partes
                Integer codigo = resultadosConsultaEventos.getInt("codigo");
                String nombre = resultadosConsultaEventos.getString("nombre");
                String recinto = resultadosConsultaEventos.getString("recinto");
                String descripcion = resultadosConsultaEventos.getString("descripcion");
                String fecha = resultadosConsultaEventos.getString("fecha");
                String estado = resultadosConsultaEventos.getString("estado");
                String ciudad = resultadosConsultaEventos.getString("ciudad");
                //Armar un objeto artista donde se empaquetarán los datos
                Evento evento = new Evento(codigo, nombre, recinto, descripcion, fecha, estado, ciudad);
                //Agregar artista a la lista
                listarEventos.add(evento);
            }
            System.out.println(listarEventos);
        } catch(SQLException ex){
            System.out.println("Error al despelgar los eventos: " + ex.getMessage());
        }
        return listarEventos; //Retornar la lista, se puede hacer después del catch 
    }
    
}