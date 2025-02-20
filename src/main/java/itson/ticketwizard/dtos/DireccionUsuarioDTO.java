package itson.ticketwizard.dtos;

public class DireccionUsuarioDTO {
    private String estado;
    private String ciudad;
    private String colonia;
    private String calle;
    private Integer numero;

    public DireccionUsuarioDTO(String estado, String ciudad, String colonia, String calle, Integer numero) {
        this.estado = estado;
        this.ciudad = ciudad;
        this.colonia = colonia;
        this.calle = calle;
        this.numero = numero;
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