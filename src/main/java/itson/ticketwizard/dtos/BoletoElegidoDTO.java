
package itson.ticketwizard.dtos;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class BoletoElegidoDTO {
    private String numeroSerie;
    private String fila;
    private Integer asiento;
    private Double precio;
    private String nombreEvento;
    private String recinto;
    private String fecha;
    private String ciudad;
    private String estado;

    public BoletoElegidoDTO(String numeroSerie, String fila, Integer asiento, Double precio, String nombreEvento, String recinto, String fecha, String ciudad, String estado) {
        this.numeroSerie = numeroSerie;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
        this.nombreEvento = nombreEvento;
        this.recinto = recinto;
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getFila() {
        return fila;
    }

    public Integer getAsiento() {
        return asiento;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getRecinto() {
        return recinto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    
    


    
}
