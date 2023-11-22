/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poopdoce;

/**
 * Clase HiloUnos por medio de interfaz, imprime 1000 veces unos
 * @author Luis Hernandez
 */
public class HiloUnos implements Runnable {

    /**
     * Metodo sobreescrito run, imprime un 1 1000 veces
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("1-");
        }
    }
    
    
    
}
