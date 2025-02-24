
package itson.ticketwizard.control;
import itson.ticketwizard.dtos.NombreCorreoUsuarioDTO;
import itson.ticketwizard.presentacion.ConsultaBoletos;
import javax.swing.JFrame;

public class ControlConsultarBoletos {
    
    
    private ConsultaBoletos consultaBoletos;
    private final NombreCorreoUsuarioDTO nombreCorreoUsuarioDTO;

    public ControlConsultarBoletos(NombreCorreoUsuarioDTO nombreCorreoUsuarioDTO) {
        this.nombreCorreoUsuarioDTO = nombreCorreoUsuarioDTO;
    }
    
    public void inicarMostrarBoletos(JFrame frameAnterior){
//        ConsultaBoletos consultaBoletos = new ConsultaBoletos(this);
 
    }
    
    public NombreCorreoUsuarioDTO obtenerNombreCorreoUsuarioDTO(){
        return this.nombreCorreoUsuarioDTO;
    }
    
//    public 
    
    
    
}
