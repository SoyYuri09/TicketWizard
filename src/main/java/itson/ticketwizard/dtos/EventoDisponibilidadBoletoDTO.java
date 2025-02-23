
package itson.ticketwizard.dtos;


public class EventoDisponibilidadBoletoDTO {
    private Integer codigo;
    private String nombre;
    private String recinto;
    private String fecha;
    private String estado;
    private String ciudad;
    private String direccionBanner;

    public EventoDisponibilidadBoletoDTO(Integer codigo, String nombre, String recinto, String fecha, String estado, String ciudad, String direccionBanner) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.recinto = recinto;
        this.fecha = fecha;
        this.estado = estado;
        this.ciudad = ciudad;
        this.direccionBanner = direccionBanner;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRecinto() {
        return recinto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccionBanner() {
        return direccionBanner;
    }  
}
