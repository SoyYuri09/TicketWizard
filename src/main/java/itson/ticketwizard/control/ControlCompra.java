package itson.ticketwizard.control;
import itson.ticketwizard.dtos.DatosEventoDTO;
import itson.ticketwizard.entidades.Boleto;
import itson.ticketwizard.entidades.Evento;
import itson.ticketwizard.persistencia.BoletosDAO;
import itson.ticketwizard.persistencia.EventosDAO;
import itson.ticketwizard.presentacion.DisponibilidadDeBoletos;
import itson.ticketwizard.presentacion.EventosDisponibles;
import java.util.List;
import javax.swing.JFrame;
/**
 * @author Usuario
 */
public class ControlCompra {
    
    private EventosDisponibles eventosDisponibles;
    private EventosDAO eventosDAO;
    private BoletosDAO boletosDAO;
    private DisponibilidadDeBoletos disponibilidadDeBoletos;
    

    public ControlCompra(EventosDAO eventosDAO, BoletosDAO boletosDAO) { 
        this.eventosDAO = eventosDAO;
        this.boletosDAO = boletosDAO;
    }
    
    public void iniciarCompra(JFrame frameAnterior){
        eventosDisponibles = new EventosDisponibles(this);
        frameAnterior.dispose();
        eventosDisponibles.setVisible(true);
        eventosDisponibles.setResizable(false); //Quitar
    }
    
    public List<Evento> consultarListaEventos(){
        return this.eventosDAO.listarEventos();
    }
    
    public List<Boleto> obtenerBoletos(Integer codigoEvento){
        return boletosDAO.listarBoletos(codigoEvento);
    }
    
    public void mostrarListaBoletos(JFrame frameAnterior, Integer codigoEvento){
        disponibilidadDeBoletos = new DisponibilidadDeBoletos(this);
        frameAnterior.dispose();
        disponibilidadDeBoletos.llenarTablaBoletos(codigoEvento);
        disponibilidadDeBoletos.setVisible(true);
        disponibilidadDeBoletos.setResizable(false);
    }
    
}
