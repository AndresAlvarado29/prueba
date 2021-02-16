/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Contrayente;

/**
 *
 * @author ariel
 */
public class ControladorContrayente extends ControladorGenerico<Contrayente>{
    
    private static ControladorContrayente controladorPersona;

    private ControladorContrayente() {
    }
    
    public static ControladorContrayente getInstancia() {
        if (controladorPersona == null) {
            controladorPersona = new ControladorContrayente();
        }
        return controladorPersona;
    }
    
}
