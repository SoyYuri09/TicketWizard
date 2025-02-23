

package itson.ticketwizard.dtos;


public class CompraReservaUsuarioTransaccionDTO {
    private Integer codigoUsuario;
    private Integer codigoTransaccion;

    public CompraReservaUsuarioTransaccionDTO(Integer codigoUsuario, Integer codigoTransaccion) {
        this.codigoUsuario = codigoUsuario;
        this.codigoTransaccion = codigoTransaccion;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public Integer getCodigoTransaccion() {
        return codigoTransaccion;
    }
    
    
}
