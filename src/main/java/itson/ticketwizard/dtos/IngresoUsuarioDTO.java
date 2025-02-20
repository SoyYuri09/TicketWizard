
package itson.ticketwizard.dtos;


public class IngresoUsuarioDTO {
    private String correoElectronico;
    private String contrasenia;

    public IngresoUsuarioDTO(String correoElectronico, String contrasenia) {
        this.correoElectronico = correoElectronico;
        this.contrasenia = contrasenia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    
    
}
