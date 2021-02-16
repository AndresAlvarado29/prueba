/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author ariel
 */
public class Contrayente implements Serializable{
    
    private int codigo;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String Genero;
    private LocalDate fechaDeNacimineto;
    private String estadoCivil;

    public Contrayente() {
    }

    public Contrayente(int codigo, String nombre, String apellido, String cedula, String direccion, String Genero, String estadoCivil) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.Genero = Genero;
        this.estadoCivil = estadoCivil;
    }

    public Contrayente(String cedula) {
        this.cedula = cedula;
    }

    public Contrayente(int codigo, String nombre, String apellido, String cedula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
    

    public Contrayente(int codigo, String nombre, String apellido, String cedula, String direccion, String Genero, LocalDate fechaDeNacimineto, String estadoCivil) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.Genero = Genero;
        this.fechaDeNacimineto = fechaDeNacimineto;
        this.estadoCivil = estadoCivil;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public LocalDate getFechaDeNacimineto() {
        return fechaDeNacimineto;
    }

    public void setFechaDeNacimineto(LocalDate fechaDeNacimineto) {
        this.fechaDeNacimineto = fechaDeNacimineto;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.cedula);
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
        final Contrayente other = (Contrayente) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", direccion=" + direccion + ", Genero=" + Genero + ", fechaDeNacimineto=" + fechaDeNacimineto + ", estadoCivil=" + estadoCivil + '}';
    }
    
}
