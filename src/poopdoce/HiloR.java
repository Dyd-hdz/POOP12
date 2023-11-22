/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poopdoce;

/**
 * Clase HiloR por medio de interfaz, imprime una iteracion de 10 veces con el nombre del hilo
 * @author Luis Hernandez
 */
public class HiloR implements Runnable{

    /**
     * Metodo sobreescrito run, impresion de iteracion del 0-10
     */
    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+i+" del "+Thread.currentThread().getName());//para obtener el nombre del hilo que estamos usando
        }
        System.out.println("Termina el "+Thread.currentThread().getName());
        
    }
    
}
