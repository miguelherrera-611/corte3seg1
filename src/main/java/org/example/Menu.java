package org.example;

import java.util.Scanner;

public class Menu {
    public static void mostrarMenu() {
        System.out.println("=== Menú Principal ===");
        System.out.println("1. Crear Concierto");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void manejarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del artista: ");
                String nombreArtista = scanner.nextLine();
                System.out.print("Ingrese el género del artista (ROCK_LATINO, POP, JAZZ, CLASICA, HIP_HOP): ");
                Genero generoArtista = Genero.valueOf(scanner.nextLine().toUpperCase());
                Artista artista = new Artista(nombreArtista, generoArtista);

                System.out.print("Ingrese el nombre del lugar: ");
                String nombreLugar = scanner.nextLine();
                System.out.print("Ingrese la dirección del lugar: ");
                String direccionLugar = scanner.nextLine();
                Lugar lugar = new Lugar(nombreLugar, direccionLugar);

                Equipo equipo = new Equipo();
                equipo.agregarInstrumento("Guitarra");
                equipo.agregarInstrumento("Batería");
                equipo.agregarInstrumento("Teclado");

                Concierto concierto = new Concierto(artista, lugar, equipo);
                concierto.mostrarDetalles();
                concierto.guardarEnBaseDeDatos();

                HiloPreparacion h1 = new HiloPreparacion("Montar escenario");
                HiloPreparacion h2 = new HiloPreparacion("Probar sonido");
                h1.start();
                h2.start();
                break;

            case 2:
                System.out.println("Saliendo del programa...");
                System.exit(0);
                break;

            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }
}
