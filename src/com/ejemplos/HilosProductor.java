package com.ejemplos;



public class HilosProductor extends Thread {
    private HilosContenedor contenedor;

    public HilosProductor (HilosContenedor c) {
        contenedor = c;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            contenedor.put(new Integer (i));
            System.out.println("Productor. put: " + i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}
