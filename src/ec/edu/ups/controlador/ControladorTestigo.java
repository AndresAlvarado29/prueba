/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Testigo;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Andres
 */
public class ControladorTestigo implements iMatrimonio<Testigo> {
    /**
     * Tamaño del archivo:
     * 
     * cedula 10 caracteres
     * nombre 25 caracteres
     * apellido 25 caracteres
     * 50 caracteres direccion
     * genero 9 caracteres
     * fecha 8 caracteres
     */
private RandomAccessFile archivo;
private int tamañoRegistro;

    public ControladorTestigo() {
        
         tamañoRegistro = 128;
        try {
            archivo = new RandomAccessFile("Datos/Testigos.dat", "rw");
            tamañoRegistro = 128;
            
        } catch (IOException e) {
            System.out.println("Error de  lectura y escritura");
            e.printStackTrace();

        }
    }


    @Override
    public void create(Testigo objeto) {
       try {
            archivo.seek(archivo.length());
            archivo.writeUTF(objeto.getCedula());
            archivo.writeUTF(objeto.getNombre());
            archivo.writeUTF(objeto.getApellido());
            archivo.writeUTF(objeto.getDireccion());
            archivo.writeUTF(objeto.getGenero());
            archivo.writeUTF(objeto.getFechaDeNacimiento());

        } catch (IOException e) {
            System.out.println("Error de  lectura y escritura(create:UsuarioDao)");
            e.printStackTrace();

        }

    }

    @Override
    public Testigo read(String cedula) {
       try {
            int salto = 0;
            
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String cedulaArchivo = archivo.readUTF();
                
                if (cedula.equals(cedulaArchivo)) {
                    return new Testigo(cedula, archivo.readUTF().trim(), archivo.readUTF().trim(), archivo.readUTF().trim(), archivo.readUTF(),archivo.readUTF() );
                    
                }
                salto += 128;

            }

        } catch (IOException e) {
            System.out.println("Error de lectura (read: UsuarioDAO)");
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public void update(Testigo objeto) {
        try {
            int salto = 0;
            
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String cedulaArchivo = archivo.readUTF();
                
                if (objeto.getCedula().equals(cedulaArchivo)) {
                    archivo.writeUTF(objeto.getCedula());
            archivo.writeUTF(objeto.getNombre());
            archivo.writeUTF(objeto.getApellido());
            archivo.writeUTF(objeto.getDireccion());
            archivo.writeUTF(objeto.getGenero());
            archivo.writeUTF(objeto.getFechaDeNacimiento());          
                    break;
                    
                }
                salto += 128;

            }

        } catch (IOException e) {
            System.out.println("Error de lectura (update: UsuarioDAO)");
            e.printStackTrace();

        }
    }

    @Override
    public void delete(Testigo objeto) {
       try {
            String cedula = objeto.getCedula();
            int salto = 0;
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String cedulaArchivo = archivo.readUTF();
                if (cedula.trim().equals(cedulaArchivo.trim())) {
                    archivo.writeUTF(llenarEspacios(10));
                    archivo.writeUTF(llenarEspacios(25));
                    archivo.writeUTF(llenarEspacios(25));
                    archivo.writeUTF(llenarEspacios(50));
                    archivo.writeUTF(llenarEspacios(8));
                    break;
                }
                salto += tamañoRegistro;
            }

        } catch (IOException ex) {
            System.out.println("Error delete usuario");
        }
    }

    @Override
    public Testigo login(String cedula, String contraseña) {
         try {
            int salto = 66;
            
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String correoArchivo = archivo.readUTF();
                String contraseñaArchivo = archivo.readUTF();
                
                if (correoArchivo.trim().equals(cedula) && contraseñaArchivo.equals(contraseña)) {
                    archivo.seek(salto - 66);
                    return new Testigo(archivo.readUTF(), archivo.readUTF().trim(), archivo.readUTF().trim(), cedula, contraseña, archivo.readUTF().trim());
                    
                }
                salto += 128;

            }

        } catch (IOException e) {
            System.out.println("Error de lectura (login: UsuarioDAO)");
            e.printStackTrace();

        }
        return null;
    }
    public String llenarEspacios(int espacios) {
        String aux = "";
        return String.format("%-" + espacios + "s", aux);
    }
    
}
