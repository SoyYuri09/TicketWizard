
package itson.ticketwizard.dtos;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class NuevaDireccionUsuarioDTO {
    private String estado;
    private String ciudad;
    private String colonia;
    private String calle;
    private Integer numero;

    public NuevaDireccionUsuarioDTO(String estado, String ciudad, String colonia, String calle, Integer numero) {
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
