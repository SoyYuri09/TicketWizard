package itson.ticketwizard.dtos;
/**
 * @author Usuario
 */
public class TransaccionApartadaDTO {
    
    private Integer codigoBoleto;
    private Integer codigoTransaccion;
    private String fechaHora;
    private Integer codigoUsuarioRevendedor;
    private Double precioVenta;
    private String nombre;
    private String recinto;
    private String fechaEvento;
    private String estado;
    private String ciudad;
    private String direccionBanner;
    private Integer codigoUsuarioComprador;

    public TransaccionApartadaDTO(Integer codigoBoleto, Integer codigoTransaccion, String fechaHora, Integer codigoUsuarioRevendedor, Double precioVenta, String nombre, String recinto, 
            String fechaEvento, String estado, String ciudad, String direccionBanner, Integer codigoUsuarioComprador) {
        this.codigoBoleto = codigoBoleto;
        this.codigoTransaccion = codigoTransaccion;
        this.fechaHora = fechaHora;
        this.codigoUsuarioRevendedor = codigoUsuarioRevendedor;
        this.precioVenta = precioVenta;
        this.nombre = nombre;
        this.recinto = recinto;
        this.fechaEvento = fechaEvento;
        this.estado = estado;
        this.ciudad = ciudad;
        this.direccionBanner = direccionBanner;
        this.codigoUsuarioComprador = codigoUsuarioComprador;
    }

    public Integer getCodigoBoleto() {
        return codigoBoleto;
    }

    public Integer getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public Integer getCodigoUsuarioRevendedor() {
        return codigoUsuarioRevendedor;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRecinto() {
        return recinto;
    }

    public String getFechaEvento() {
        return fechaEvento;
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

    public Integer getCodigoUsuarioComprador() {
        return codigoUsuarioComprador;
    }

    
    
    
}
