/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronavirus;

/**
 *
 * @author abarrime
 */
public class Coronavirus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (estaVivoCoronavirus()) {
            if (!salir()) {
                quedarseEnCasa();
            } else if (estasInfectadoCoronavirus()) {
                System.out.println("Estás mamao HP, por no hacer caso...!!! XD");
            } else {
                System.out.println("Que te quedes en casa, haz caso HP Guevón Gonorrea...!!! XD");
            }

        }
    }

    public static boolean estasInfectadoCoronavirus() {
        return true;
    }

    public static boolean estaVivoCoronavirus() {
        return true;
    }

    public static void quedarseEnCasa() {
        trabajar();
        comer();
        dormir();
    }

    public static boolean salir() {
        return true;
    }

    public static void trabajar() {

    }

    public static void comer() {

    }

    public static void dormir() {

    }

    public static void duchar() {

    }

}
