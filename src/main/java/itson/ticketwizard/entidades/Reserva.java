
package itson.ticketwizard.entidades;



public class Reserva {
    private Integer codigo;
    private String fechaHoraLimite;
    private Integer codigoTransaccion;
    private Integer codigoUsuario;

    public Reserva(Integer codigo, String fechaHoraLimite, Integer codigoTransaccion, Integer codigoUsuario) {
        this.codigo = codigo;
        this.fechaHoraLimite = fechaHoraLimite;
        this.codigoTransaccion = codigoTransaccion;
        this.codigoUsuario = codigoUsuario;
    }

    
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getFechaHoraLimite() {
        return fechaHoraLimite;
    }

    public void setFechaHoraLimite(String fechaHoraLimite) {
        this.fechaHoraLimite = fechaHoraLimite;
    }

    public Integer getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(Integer codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    
    
    
}
