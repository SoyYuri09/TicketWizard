package itson.ticketwizard.control;
import itson.ticketwizard.dtos.DatosEventoDTO;
import itson.ticketwizard.entidades.Evento;
import itson.ticketwizard.persistencia.EventosDAO;
import itson.ticketwizard.presentacion.OpcionesDeUsuario;
import java.util.List;
import javax.swing.JFrame;

/**
 * @author Usuario
 */
public class ControlCompra {
    
    private OpcionesDeUsuario formOpcionesDeUsuario;
    private DatosEventoDTO datosEventoDTO;
    private EventosDAO eventosDAO;

    public ControlCompra(EventosDAO eventosDAO) { 
        this.eventosDAO = eventosDAO;
    }
    
    public void iniciarCompra(JFrame frameAnterior){
        formOpcionesDeUsuario = new OpcionesDeUsuario(this);
        frameAnterior.dispose();
        formOpcionesDeUsuario.setVisible(true);
        formOpcionesDeUsuario.setResizable(false);
    }
    
    public void obtenerEventos(DatosEventoDTO datosEventoDTO){
        
    }
    
    public List<Evento> consultarListaEventos(){
        return this.eventosDAO.listarEventos();
    }
    
}
