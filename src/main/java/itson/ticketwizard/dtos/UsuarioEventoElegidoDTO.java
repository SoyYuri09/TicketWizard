
package itson.ticketwizard.dtos;


public class UsuarioEventoElegidoDTO {
    private Integer codigoUsuario;
    private Integer codigoEvento;

    public UsuarioEventoElegidoDTO(Integer codigoUsuario, Integer codigoEvento) {
        this.codigoUsuario = codigoUsuario;
        this.codigoEvento = codigoEvento;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public Integer getCodigoEvento() {
        return codigoEvento;
    }
 

}


