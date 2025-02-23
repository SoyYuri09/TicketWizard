package itson.ticketwizard.entidades;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class Evento {
    
    private int codigo;
    private String nombre;
    private String recinto;
    private String descripcion;
    private String fecha;
    private String estado;
    private String ciudad;
    private String direccionBanner;

    public Evento(int codigo, String nombre, String recinto, String descripcion, String fecha, String estado, String ciudad, String direccionBanner) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.recinto = recinto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
        this.ciudad = ciudad;
        this.direccionBanner = direccionBanner;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRecinto() {
        return recinto;
    }

    public void setRecinto(String recinto) {
        this.recinto = recinto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccionBanner() {
        return direccionBanner;
    }

    public void setDireccionBanner(String direccionBanner) {
        this.direccionBanner = direccionBanner;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", nombre=" + nombre + ", recinto=" + recinto + ", descripcion=" + descripcion + ", fecha=" + fecha + ", estado=" + estado + ", ciudad=" + ciudad + ", direccionBanner=" + direccionBanner + '}';
    }

    

    
}
