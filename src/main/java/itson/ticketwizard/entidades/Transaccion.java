

package itson.ticketwizard.entidades;


public class Transaccion {
    
    private Integer codigo;
    private String fechaLimite;
    private String fechaHora;
    private String numeroSerieBoleto;
    private Integer codigoBoleto;
    private Integer codigoUsuarioRevendedor;
    private Integer codigoUsuarioComprador;

    public Transaccion(Integer codigo, String fechaLimite, String fechaHora, String numeroSerieBoleto, Integer codigoBoleto, Integer codigoUsuarioRevendedor, Integer codigoUsuarioComprador) {
        this.codigo = codigo;
        this.fechaLimite = fechaLimite;
        this.fechaHora = fechaHora;
        this.numeroSerieBoleto = numeroSerieBoleto;
        this.codigoBoleto = codigoBoleto;
        this.codigoUsuarioRevendedor = codigoUsuarioRevendedor;
        this.codigoUsuarioComprador = codigoUsuarioComprador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getNumeroSerieBoleto() {
        return numeroSerieBoleto;
    }

    public Integer getCodigoBoleto() {
        return codigoBoleto;
    }

    public Integer getCodigoUsuarioRevendedor() {
        return codigoUsuarioRevendedor;
    }

    public Integer getCodigoUsuarioComprador() {
        return codigoUsuarioComprador;
    }
    
    
}
