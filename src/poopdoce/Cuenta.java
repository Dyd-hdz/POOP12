/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poopdoce;

/**
 * Clase Cuenta, cotniene los metodos y atributos de una cuenta
 * @author Luis Hernandez
 */
public class Cuenta extends Thread {
    
    private static long saldo=0;

    /**
     * Metodo constructor lleno
     * @param name name de la super clase Thread
     */
    public Cuenta(String name) {
        super(name);
    }
    
    /**
     * Metodo sobreescrito run, deposita o retira
     */
    @Override
    public void run(){
        if(getName().equals("Deposito 1") || getName().equals("Deposito 2")){
            this.depositarDinero(100);
        }else{
            this.extraerDinero(50);
        }
        System.out.println("Termina el "+getName());
    }
    
    /**
     * Metodo objetivo, deposita 100 al saldo
     * @param cantidad es el monto que se le agregara al saldo, es un valor fijo (100)
     */
    public synchronized void depositarDinero(int cantidad){
        System.out.println("El saldo actual es: "+saldo+" de "+getName());
        saldo+= cantidad;
        System.out.println("Se depositaron "+cantidad+" pesos");
        notifyAll();
    }
    
    /**
     * Metodo objetivo, retira 50 del saldo
     * @param cantidad es el monto que se le retirara al saldo, es un valor fijo (500)
     */
    public synchronized void extraerDinero(int cantidad){
        try{
            if(saldo<=0){
                System.out.println(getName()+" espera deposito"+"\nSaldo= "+saldo);
                sleep(5000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        System.out.println("El saldo actual es: "+saldo+" de "+getName());
        saldo-= cantidad;
        System.out.println(getName()+" extrajo "+cantidad+ "pesos.\nSaldo restante= "+saldo);
        notifyAll();  
    }
}
