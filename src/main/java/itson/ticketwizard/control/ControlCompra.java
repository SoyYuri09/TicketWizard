package itson.ticketwizard.control;
import itson.ticketwizard.dtos.DatosEventoDTO;
import itson.ticketwizard.entidades.Boleto;
import itson.ticketwizard.entidades.Evento;
import itson.ticketwizard.persistencia.BoletosDAO;
import itson.ticketwizard.persistencia.EventosDAO;
import itson.ticketwizard.presentacion.ConfirmacionCompra;
import itson.ticketwizard.presentacion.DisponibilidadBoletos;
import itson.ticketwizard.presentacion.EventosDisponibles;
import java.util.List;
import javax.swing.JFrame;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class ControlCompra {
    
    private EventosDisponibles eventosDisponibles;
    private DisponibilidadBoletos disponibilidadDeBoletos;
    private ConfirmacionCompra confirmacionCompra;
    
    private EventosDAO eventosDAO;
    private BoletosDAO boletosDAO;
    

    public ControlCompra(EventosDAO eventosDAO, BoletosDAO boletosDAO) { 
        this.eventosDAO = eventosDAO;
        this.boletosDAO = boletosDAO;
    }
    
    public void iniciarCompra(JFrame frameAnterior){
        eventosDisponibles = new EventosDisponibles(this);
        frameAnterior.dispose();
        eventosDisponibles.setVisible(true);
    }
    
    public List<Evento> consultarListaEventos(){
        return this.eventosDAO.listarEventos();
    }
    
    public List<Boleto> obtenerBoletos(Integer codigoEvento){
        return boletosDAO.listarBoletos(codigoEvento);
    }
    
    public List<Boleto> obtenerBoletosReventa(Integer codigoEvento){
        return boletosDAO.listarBoletosReventa(codigoEvento);
    }
    
    public List<Boleto> obtenerBoletosBoletera(Integer codigoEvento){
        return boletosDAO.listarBoletosBoletera(codigoEvento);
    }
    
    public void mostrarListaBoletos(JFrame frameAnterior, Integer codigoEvento){
        disponibilidadDeBoletos = new DisponibilidadBoletos(this, codigoEvento);
        frameAnterior.dispose();
        disponibilidadDeBoletos.llenarTablaBoletos(codigoEvento);
        disponibilidadDeBoletos.setVisible(true);
        disponibilidadDeBoletos.setResizable(false);
    }
    
    public void mostrarConfirmacionCompra(JFrame frameAnterior){
        //Pendiente finalizar método que invoca a confirmacionCompra.
        //confirmacionCompra = new ConfirmacionCompra();
        frameAnterior.dispose();
    }
    public void volverEventosDisponibles(JFrame frameAnterior){
        this.iniciarCompra(frameAnterior);
        
    }
    
}
