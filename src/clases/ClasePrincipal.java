/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author dayan.fernandez
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo3 = new Proceso1();
        Thread hilo2 = new Thread(new Proceso2());

        hilo1.start();
        hilo3.start();
        hilo2.start();
    }

}
