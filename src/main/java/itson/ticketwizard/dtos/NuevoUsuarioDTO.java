package itson.ticketwizard.dtos;

public class NuevoUsuarioDTO {
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoElectronico;
    private String fechaNacimiento;
    private String contrasenia;
    private String estado;
    private String ciudad;
    private String colonia;
    private String calle;
    private Integer numero;

    public NuevoUsuarioDTO(String nombres, String apellidoPaterno, String apellidoMaterno, String correoElectronico, String fechaNacimiento, String contrasenia, String estado, String ciudad, String colonia, String calle, Integer numero) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasenia = contrasenia;
        this.estado = estado;
        this.ciudad = ciudad;
        this.colonia = colonia;
        this.calle = calle;
        this.numero = numero;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getEstado() {
        return estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getColonia() {
        return colonia;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    

    
    
    
    
    
}
