/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poopdoce;

/**
 * Clase HiloSaltoLinea por medio de interfaz, imprime 1000 veces un salto de linea 
 * @author Luis Hernandez
 */
public class HiloSaltoLinea implements Runnable{

    /**
     * Metodo sobreescrito run, imprime un salto de linea 1000 veces
     */
    @Override
    public void run() {
        
        for (int i = 0; i < 1000; i++) {
            System.out.println("");
        }
    
    }
    
}
