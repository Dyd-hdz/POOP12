/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poopdoce;

/**
 * Clase HiloT por medio de herencia, imprime 10 veces una iteracion con el nombre del hilo
 * @author Luis Hernandez
 */
public class HiloT extends Thread{

    /**
     * Constructor lleno
     * @param name name de la clase Thread
     */
    public HiloT(String name) {
        super(name);
    }

    /**
     * Metodo sobreescrito run, imprecion de iteracion del 0-10
     */
    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+i+" de "+getName());
        }
        System.out.println("Termina el hilo "+getName());
    }
    
    
    
}
