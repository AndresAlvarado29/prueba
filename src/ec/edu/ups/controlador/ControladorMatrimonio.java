/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Matrimonio;

/**
 *
 * @author ariel
 */
public class ControladorMatrimonio extends ControladorGenerico<Matrimonio>{
    
    private static ControladorMatrimonio controladorMatrimonio;

    private ControladorMatrimonio() {
    }
    
    public static ControladorMatrimonio getInstancia() {
        if (controladorMatrimonio == null) {
            controladorMatrimonio = new ControladorMatrimonio();
        }
        return controladorMatrimonio;
    }
}
