/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ariel
 */
public class Autoridad extends Contrayente implements Serializable{
    
    private String usuario;
    private String contraseña;
    private String fecha;

    public Autoridad(String usuario, String contraseña, String fecha, String cedula) {
        super(cedula);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecha = fecha;
    }

    public Autoridad() {
    }

    public Autoridad(String usuario, String contraseña, String fecha, int codigo, String nombre, String apellido, String cedula) {
        super(codigo, nombre, apellido, cedula);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecha = fecha;
    }

    
    

    public Autoridad(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Autoridad(String usuario, String contraseña, int codigo, String nombre, String apellido, String cedula, String direccion, String Genero, LocalDate fechaDeNacimineto, String estadoCivil) {
        super(codigo, nombre, apellido, cedula, direccion, Genero, fechaDeNacimineto, estadoCivil);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

     
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
