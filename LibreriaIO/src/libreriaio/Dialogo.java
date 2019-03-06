/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaio;

/**
 *
 * @author User
 */
public abstract class Dialogo implements Metodos {
     @Override
    public abstract void mostrar(String msg);

    
    enum Opcion {
        consola, ventana
    };
//con este metodo creamos un nuevo cuadro de dialogo
    public static Dialogo crearDialogo(Opcion opcion) {

        Dialogo dialogoCreado;
        switch (opcion) {
            // creamos un dialogo de consola
            case consola:
                dialogoCreado = new ConsolaDialogo();
                break;
            // creamos un dialogo de ventana
            case ventana:
                dialogoCreado = new VentanaDialogo();
                break;
            default:
                dialogoCreado = null;
        }

        return dialogoCreado;

    }
}

