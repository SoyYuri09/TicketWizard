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
    
    public Evento obtenerEvento(Integer codigoEvento){
        String codigoSQL = """
                           SELECT codigo, 
                                nombre, 
                                recinto, 
                                descripcion, 
                                fecha, 
                                estado, 
                                ciudad,
                                direccionBanner
                           FROM Eventos
                           WHERE codigo = ?;
                           """;
        
        Evento evento = null;
        
        try{
            
            Connection conexion = this.manejadorConexiones.crearConexion();
            
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setInt(1, codigoEvento);
            
            ResultSet resultadosConsultaEvento = comando.executeQuery();
            
            while(resultadosConsultaEvento.next()){
                Integer codigo = resultadosConsultaEvento.getInt("codigo");
                String nombre = resultadosConsultaEvento.getString("nombre");
                String recinto = resultadosConsultaEvento.getString("recinto");
                String descripcion = resultadosConsultaEvento.getString("descripcion");
                String fecha = resultadosConsultaEvento.getString("fecha");
                String estado = resultadosConsultaEvento.getString("estado");
                String ciudad = resultadosConsultaEvento.getString("ciudad");
                String direccionBanner = resultadosConsultaEvento.getString("direccionBanner");
                
                evento = new Evento(codigo, nombre, recinto, descripcion, fecha, estado, ciudad, direccionBanner);
  
            }
        } catch(SQLException ex){
            System.out.println("Error al desplegar los eventos: " + ex.getMessage());
        }
        return evento;
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
                                ciudad,
                                direccionBanner                   
                            FROM Eventos;
        """;

        List<Evento> listaEventos = new LinkedList<>();
        try {
            
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            ResultSet resultadosConsultaEventos = comando.executeQuery();while(resultadosConsultaEventos.next()){
                Integer codigo = resultadosConsultaEventos.getInt("codigo");
                String nombre = resultadosConsultaEventos.getString("nombre");
                String recinto = resultadosConsultaEventos.getString("recinto");
                String descripcion = resultadosConsultaEventos.getString("descripcion");
                String fecha = resultadosConsultaEventos.getString("fecha");
                String estado = resultadosConsultaEventos.getString("estado");
                String ciudad = resultadosConsultaEventos.getString("ciudad");
                String direccionBanner = resultadosConsultaEventos.getString("direccionBanner");
                
                Evento evento = new Evento(codigo, nombre, recinto, descripcion, fecha, estado, ciudad,direccionBanner);
                
                listaEventos.add(evento);
            }
            
            
        } catch(SQLException ex){
            System.out.println("Error al desplegar los eventos: " + ex.getMessage());
        }
        return listaEventos;
    }
    
    
        public String obtenerDireccionBannerEvento(Integer codigoEvento){
        String codigoSQL = """
                           SELECT
                                direccionBanner
                           FROM Eventos
                           WHERE codigo = ?;
                           """;
        
        String direccionBanner = null;
        
        try{
            
            Connection conexion = this.manejadorConexiones.crearConexion();
            
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setInt(1, codigoEvento);
            
            ResultSet resultadosConsultaEvento = comando.executeQuery();
            
            while(resultadosConsultaEvento.next()){
                direccionBanner = resultadosConsultaEvento.getString("direccionBanner");
                
            }
        } catch(SQLException ex){
            System.out.println("Error al obtener la dirección del Banner: " + ex.getMessage());
        }
        return direccionBanner;
    }
    
    
}