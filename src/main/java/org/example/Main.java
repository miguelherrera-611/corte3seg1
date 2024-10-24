package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Menu.mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearConcierto(scanner);
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void crearConcierto(Scanner scanner) {
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
        System.out.print("¿Cuántos instrumentos desea agregar? ");
        int cantidadInstrumentos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadInstrumentos; i++) {
            System.out.print("Ingrese el nombre del instrumento: ");
            String instrumento = scanner.nextLine();
            equipo.agregarInstrumento(instrumento);
        }

        Concierto concierto = new Concierto(artista, lugar, equipo);
        concierto.mostrarDetalles();
        concierto.guardarEnBaseDeDatos();

        HiloPreparacion h1 = new HiloPreparacion("Montar escenario");
        HiloPreparacion h2 = new HiloPreparacion("Probar sonido");
        h1.start();
        h2.start();
    }
}
