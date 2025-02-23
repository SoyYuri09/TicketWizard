
package itson.ticketwizard.dtos;


public class UsuarioSaldoDTO {
    private Integer codigo;
    private Double saldo;

    public UsuarioSaldoDTO(Integer codigo, Double saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    
}
