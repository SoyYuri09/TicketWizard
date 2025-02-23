

package itson.ticketwizard.entidades;


public class Transaccion {
    
    private Integer codigo;
    private String fechaLimite;
    private String fechaHora;
    private String numeroSerieBoleto;
    private Integer codigoBoleto;
    private Integer codigoUsuarioRevendedor;
    private Integer codigoUsuarioComprador;
    private Double precioVenta;

    public Transaccion(Integer codigo, String fechaLimite, String fechaHora, String numeroSerieBoleto, Integer codigoBoleto, Integer codigoUsuarioRevendedor, Integer codigoUsuarioComprador, Double precioVenta) {
        this.codigo = codigo;
        this.fechaLimite = fechaLimite;
        this.fechaHora = fechaHora;
        this.numeroSerieBoleto = numeroSerieBoleto;
        this.codigoBoleto = codigoBoleto;
        this.codigoUsuarioRevendedor = codigoUsuarioRevendedor;
        this.codigoUsuarioComprador = codigoUsuarioComprador;
        this.precioVenta = precioVenta;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getNumeroSerieBoleto() {
        return numeroSerieBoleto;
    }

    public void setNumeroSerieBoleto(String numeroSerieBoleto) {
        this.numeroSerieBoleto = numeroSerieBoleto;
    }

    public Integer getCodigoBoleto() {
        return codigoBoleto;
    }

    public void setCodigoBoleto(Integer codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    public Integer getCodigoUsuarioRevendedor() {
        return codigoUsuarioRevendedor;
    }

    public void setCodigoUsuarioRevendedor(Integer codigoUsuarioRevendedor) {
        this.codigoUsuarioRevendedor = codigoUsuarioRevendedor;
    }

    public Integer getCodigoUsuarioComprador() {
        return codigoUsuarioComprador;
    }

    public void setCodigoUsuarioComprador(Integer codigoUsuarioComprador) {
        this.codigoUsuarioComprador = codigoUsuarioComprador;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

}
