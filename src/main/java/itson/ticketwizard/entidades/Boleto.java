package itson.ticketwizard.entidades;

import java.util.Objects;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class Boleto {
    
    private String codigo;
    private String numeroSerie;
    private String fila;
    private int asiento;
    private int codigoEvento;

    public Boleto(String codigo, String numeroSerie, String fila, int asiento, int codigoEvento) {
        this.codigo = codigo;
        this.numeroSerie = numeroSerie;
        this.fila = fila;
        this.asiento = asiento;
        this.codigoEvento = codigoEvento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.codigo);
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
        final Boleto other = (Boleto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Boleto{" + "codigo=" + codigo + ", numeroSerie=" + numeroSerie + ", fila=" + fila + ", asiento=" + asiento + ", codigoEvento=" + codigoEvento + '}';
    }
    
    
    
}
