package org.example;

public class Concierto {
    private Artista artista;
    private Lugar lugar;
    private Equipo equipo;

    public Concierto(Artista artista, Lugar lugar, Equipo equipo) {
        this.artista = artista;
        this.lugar = lugar;
        this.equipo = equipo;
    }

    public void mostrarDetalles() {
        System.out.println(artista);
        System.out.println(lugar);
        System.out.println(equipo);
    }

    public void guardarEnBaseDeDatos() {
        // Simulación de persistencia en base de datos
        System.out.println("Guardando el concierto en la base de datos...");
    }
}
