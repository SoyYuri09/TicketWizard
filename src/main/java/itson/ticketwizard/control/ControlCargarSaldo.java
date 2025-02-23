package itson.ticketwizard.control;

import itson.ticketwizard.dtos.NombreCorreoUsuarioDTO;
import itson.ticketwizard.dtos.UsuarioSaldoDTO;
import itson.ticketwizard.entidades.Usuario;
import itson.ticketwizard.persistencia.UsuariosDAO;
import itson.ticketwizard.presentacion.CargarSaldo;
import itson.ticketwizard.presentacion.CompraBoletosCargaSaldo;
import javax.swing.JFrame;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */
public class ControlCargarSaldo {
    
    private final UsuariosDAO usuariosDAO;
    private final NombreCorreoUsuarioDTO nombreCorreoUsuarioDTO;
    private CompraBoletosCargaSaldo compraBoletosCargaSaldo;
    private CargarSaldo cargarSaldo;

    public ControlCargarSaldo(NombreCorreoUsuarioDTO nombreCorreoUsuarioDTO, UsuariosDAO usuariosDAO) {
        this.usuariosDAO = usuariosDAO;
        this.nombreCorreoUsuarioDTO = nombreCorreoUsuarioDTO;
    }
    
    public NombreCorreoUsuarioDTO obtenerNombreCorreoUsuarioDTO(){
        return this.nombreCorreoUsuarioDTO;
    }
    
    public void iniciarCargaSaldo(JFrame frameAnterior){
        cargarSaldo = new CargarSaldo(this);
        frameAnterior.dispose();
        cargarSaldo.setVisible(true);
    }
       
    public UsuarioSaldoDTO obtenerUsuarioSaldoDTO(String correoElectronico){
        Usuario usuario = usuariosDAO.obtenerUsuario(correoElectronico);
        return new UsuarioSaldoDTO(usuario.getCodigo(), usuario.getSaldo()); 
    }
    
    public void mostrarComprasRealizadas(JFrame frameAnterior){
        compraBoletosCargaSaldo = new CompraBoletosCargaSaldo(this);
        frameAnterior.dispose();
        compraBoletosCargaSaldo.setVisible(true);
    }
    
}
