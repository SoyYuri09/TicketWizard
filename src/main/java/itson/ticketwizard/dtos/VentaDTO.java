package itson.ticketwizard.dtos;

public class VentaDTO {
    private String evento;
    private String usuario;
    private String boleto;
    private String cantidad;
    private String total;

    public VentaDTO(String evento, String usuario, String boleto, String cantidad, String total) {
        this.evento = evento;
        this.usuario = usuario;
        this.boleto = boleto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getEvento() {
        return evento;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getBoleto() {
        return boleto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getTotal() {
        return total;
    }
}
