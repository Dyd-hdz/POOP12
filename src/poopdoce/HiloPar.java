/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poopdoce;

/**
 * Clase HiloPar por medio de interfaz, imprime los numeros pares del 0 al 500
 * @author Luis Hernández
 */
public class HiloPar implements Runnable {

    /**
     * Metodo sobreescrito run, imprime los numeros pares del 0-500
     */
    @Override
    public void run() {
        for (int i = 0; i <= 500; i++) {
            if (i%2==0) {
                System.out.print(i+"-");
            }
        }
    }
    
}
