package itson.ticketwizard.dtos;

public class EventoDTO {
    private String nombre;
    private String fecha;
    private String hora;
    private String lugar;
    private String descripcion;
    private String imagen;
    private String categoria;
    private String organizador;
    private String boletos;
    private String asistentes;
    
    public EventoDTO(String nombre, String fecha, String hora, String lugar, String descripcion, String imagen, String categoria, String organizador, String boletos, String asistentes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.categoria = categoria;
        this.organizador = organizador;
        this.boletos = boletos;
        this.asistentes = asistentes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getOrganizador() {
        return organizador;
    }

    public String getBoletos() {
        return boletos;
    }

    public String getAsistentes() {
        return asistentes;
    }

}