package org.example;

public class HiloPreparacion extends Thread {
    private String tarea;

    public HiloPreparacion(String tarea) {
        this.tarea = tarea;
    }

    @Override
    public void run() {
        System.out.println("Iniciando tarea: " + tarea);
        try {
            Thread.sleep(2000); // Simula tiempo de preparación
        } catch (InterruptedException e) {
            System.out.println("La tarea fue interrumpida.");
        }
        System.out.println("Tarea completada: " + tarea);
    }
}
