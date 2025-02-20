package itson.ticketwizard.dtos;

public class BoletoDTO {
    private String nombre;
    private String precio;
    private String cantidad;
    private String total;

    public BoletoDTO(String nombre, String precio, String cantidad, String total) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getTotal() {
        return total;
    }
}
