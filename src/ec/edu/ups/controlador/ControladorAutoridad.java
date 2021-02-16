/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Autoridad;

/**
 *
 * @author ariel
 */
public class ControladorAutoridad extends ControladorGenerico<Autoridad>{
    
    private static ControladorAutoridad controladorJuez;
    private Autoridad juezLogeado;

    private ControladorAutoridad() {
    }

    public Autoridad getJuezLogeado() {
        return juezLogeado;
    }
    
    public static ControladorAutoridad getInstancia() {
        if (controladorJuez == null) {
            controladorJuez = new ControladorAutoridad();
        }
        return controladorJuez;
    }
    
    public boolean validar(String usuario, String contraseña) {
        for (Autoridad juez : getListado()) {
            if (juez.getUsuario().equals(usuario) && juez.getContraseña().equals(contraseña)) {
                juezLogeado = juez;
                return true;
            }
        }
        return false;
    }
    
}
