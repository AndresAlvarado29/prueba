/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

/**
 *
 * @author Andres
 */
public class ConexionIMatrimonio {

    public iMatrimonio getConexion(String objeto) {
        if (objeto.equalsIgnoreCase("Autoridad")) {

            return new ControladorAutoridad();
        }
        if (objeto.equals("Contrayente")) {
            return new ControladorContrayente();
        }
        if (objeto.equalsIgnoreCase("Testigo")) {
            return new ControladorTestigo();
        }
        return null;
    }
}
