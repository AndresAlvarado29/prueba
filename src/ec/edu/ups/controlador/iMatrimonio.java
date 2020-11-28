/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

/**
 *
 * @author Andres
 * @param <T>
 */
public interface iMatrimonio<T> {
   public void create(T objeto);
   public T read(String cedula);
   public void update(T objeto);
   public void delete(T objeto);
   public T login(String cedula, String contraseña); 
}
