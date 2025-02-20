package itson.ticketwizard.control;
import itson.ticketwizard.presentacion.OpcionesDeUsuario;
import javax.swing.JFrame;

/**
 * @author Usuario
 */
public class ControlCompra {
    
    private OpcionesDeUsuario formOpcionesDeUsuario;

    public ControlCompra() { 

    }
    
    public void iniciarCompra(JFrame frameAnterior){
        formOpcionesDeUsuario = new OpcionesDeUsuario(this);
        frameAnterior.dispose();
        formOpcionesDeUsuario.setVisible(true);
        formOpcionesDeUsuario.setResizable(false);
    }
}
