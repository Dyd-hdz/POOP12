/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poopdoce;

/**
 * Archivo principal, manipulacion de los hilos
 * @author Luis Hernandez
 */
public class POOPdoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //primera parte, iteracion de tres hilos para su comparacion, hilot, hilor y hilo del main
        /*HiloT hilo1=new HiloT("Primer Hilo");//inflar hilo
        hilo1.start();//empezar funcionalidad del primer hilo
        
        //inicializacion del segundo hilo
        new HiloT("Segundo Hilo").start();//con los hilos no es necesario guardar la referencia en otra variable
        
        new Thread(new HiloR(), "Tercer hilo").start();//creacion del tercer hiloR, interfaz
        
        //estan copitiendo los hilos al igual con el main
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+i+" del Main");
        }
        System.out.println("Termina el Main");*/
        //hasta aqui no se a dicho cual de las tareas tiene mayor prioridad por lo que la ejecucion de las tareas es aletoria
        
        //segunda parte, hilos unos, ceros y salto de lineas
        /*new Thread(new HiloCeros(),"HilosCeros").start();//inicializacion del hiloceros
        new Thread(new HiloUnos(),"HiloUnos").start();//inicializacion del hilounos
        new Thread(new HiloSaltoLinea(),"HiloSaltoLinea").start();//inicializacion del hilosaltolinea*/
        
        //tercera parte, clase cuenta
        new Cuenta("Retiro 1").start();
        new Cuenta("Retiro 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        System.out.println("Termina el hilo principal");
        
        //Actividad extra, creacion de dos hilos donde el primero imprima los numeros pares y el segundos los numeros impares, del 0-500
        /*new Thread(new HiloPar(),"HiloPar").start();
        new Thread(new HiloImpar(),"HiloImpar").start();*/
    }
    
}
