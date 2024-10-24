package org.example;

public class Lugar {
    private String nombre;
    private String direccion;

    public Lugar(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Lugar: " + nombre + ", Dirección: " + direccion;
    }
}

