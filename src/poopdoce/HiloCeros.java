/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poopdoce;

/**
 * Clase HiloCeros por medio de interfaz, imprime 1000 veces ceros
 * @author Luis Hernandez
 */
public class HiloCeros implements Runnable{

    /**
     * Metodo sobreescritorun, imprime un 0 1000 veces
     */
    @Override
    public void run() {
        
        for (int i = 0; i < 1000; i++) {
            System.out.print("0-");
        }
        
    }
    
    
    
}
