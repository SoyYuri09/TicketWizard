/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.ticketwizard.dtos;

/**
 *
 * @author romom
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
