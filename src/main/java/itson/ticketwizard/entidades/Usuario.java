/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.ticketwizard.entidades;

/**
 *
 * @author romom
 */
public class Usuario {
    private Integer codigo;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoElectronico;
    private String fechaNacimiento;
    private String contrasenia;
    private Integer saldo;
    private Integer codigoDireccion;

    public Usuario(Integer codigo, String nombres, String apellidoPaterno, String apellidoMaterno, String correoElectronico, String fechaNacimiento, String contrasenia, Integer saldo, Integer codigoDireccion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasenia = contrasenia;
        this.saldo = saldo;
        this.codigoDireccion = codigoDireccion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getCodigoDireccion() {
        return codigoDireccion;
    }

    public void setCodigoDireccion(Integer codigoDireccion) {
        this.codigoDireccion = codigoDireccion;
    }

    
    
    
    
    
    
}
