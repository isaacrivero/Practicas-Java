package com.ejemplos.hilos;

public class Hilos2 implements Runnable {
    public static int numero=0;
    public synchronized void inc(){
        numero++;
    }
    public void run() {
        for (int i = 0; i < 10000 ; i++){
        	//try {
				//Thread.sleep(200);
                inc();
			/*} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        System.out.println("Termina thread " + Thread.currentThread().getName());
        System.out.println("Valor de numero: " + this.numero);
    }
    public static void main (String [] args) {
        new Thread ( new Hilos2() , "Pepe").start();
        new Thread ( new Hilos2() , "Juan").start();
        new Thread ( new Hilos2() , "Pedro").start();
        new Thread ( new Hilos2() , "Pablo").start();
        new Thread ( new Hilos2() , "Albert").start();
        new Thread ( new Hilos2() , "Mariano").start();
        new Thread ( new Hilos2() , "Rosa").start();
        new Thread ( new Hilos2() , "Alberto").start();
        new Thread ( new Hilos2() , "Françecs").start();
        System.out.println("Termina thread main");

    }
}
