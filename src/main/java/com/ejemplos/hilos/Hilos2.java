package com.ejemplos.hilos;

public class Hilos2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5 ; i++){
        	try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        System.out.println("Termina thread " + Thread.currentThread().getName());
    }
    public static void main (String [] args) {
        new Thread ( new Hilos2() , "Pepe").start();
        new Thread ( new Hilos2() , "Juan").start();
        System.out.println("Termina thread main");
    }
}
