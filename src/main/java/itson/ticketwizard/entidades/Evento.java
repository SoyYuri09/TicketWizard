package itson.ticketwizard.entidades;
/**
 * @author Usuario
 */
public class Evento {
    
    private int codigo;
    private String nombre;
    private String recinto;
    private String descripcion;
    private String fecha;
    private String estado;
    private String ciudad;

    public Evento(int codigo, String nombre, String recinto, String descripcion, String fecha, String estado, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.recinto = recinto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
        this.ciudad = ciudad;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", nombre=" + nombre + ", recinto=" + recinto + ", descripcion=" + descripcion + ", fecha=" + fecha + ", estado=" + estado + ", ciudad=" + ciudad + '}';
    }

    
}
