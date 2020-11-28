/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Andres
 */
public class Contrayente {

    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String genero;
    private String fechaDeNacimiento;
    private String lugar;
    private List<Contrayente> parejas;
    private List<Testigo> testigos;

    public Contrayente() {
    }

    public Contrayente(String nombre, String apellido, String cedula, String direccion, String genero, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.genero = genero;
        this.fechaDeNacimiento = fechaDeNacimiento;
        parejas=new ArrayList<>();
        testigos=new ArrayList<>();
        
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
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public void agregarPareja(Contrayente contrayente){
    parejas.add(contrayente);
    }
    public void agregarTestigo(Testigo testigo){
    testigos.add(testigo);
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.cedula);
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
    
    
}
