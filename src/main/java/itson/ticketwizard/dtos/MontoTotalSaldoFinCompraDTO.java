package itson.ticketwizard.dtos;
/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */
public class MontoTotalSaldoFinCompraDTO {
    
    private Double precioVenta;
    private Double saldo;

    public MontoTotalSaldoFinCompraDTO(Double precioVenta, Double saldo) {
        this.precioVenta = precioVenta;
        this.saldo = saldo;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    
}
