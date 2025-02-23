
package itson.ticketwizard.dtos;


public class NombreCorreoUsuarioDTO {
    String nombres;
    String apellidoPaterno;
    String apellidoMaterno;
    String correoElectronico;

    public NombreCorreoUsuarioDTO(String nombres, String apellidoPaterno, String apellidoMaterno, String correoElectronico) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoElectronico = correoElectronico;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    
    
    
}
