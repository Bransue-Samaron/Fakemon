package com.mycompany.fakemon;

import java.io.File;
import java.util.Scanner;

public class Instrucciones {

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menu de Instrucciones ---");
            System.out.println("1. Reglas básicas del juego");
            System.out.println("2. Tipos de Pokémon y sus efectividades");
            System.out.println("3. Captura de Pokémon");
            System.out.println("4. Combates Pokémon");
            System.out.println("5. Evolución de Pokémon");
            System.out.println("6. Objetos y su uso");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarReglasBasicas();
                    break;
                case 2:
                    mostrarTiposYEfectividades();
                    break;
                // ... y así sucesivamente para cada opción
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 7);
    }


    private void mostrarTiposYEfectividades() {
        System.out.println("\n--- Tipos de Pokémon y Efectividades ---");
        // Aquí puedes agregar una tabla o lista con los tipos y sus relaciones
        System.out.println("Fuego es fuerte contra Planta, pero débil contra Agua...");
    }

    // ... y así sucesivamente para cada método que muestra información específica

    public static void main(String[] args) {
        Instrucciones instrucciones = new Instrucciones();
        instrucciones.mostrarMenu();
    }
    
     private void mostrarReglasBasicas() {
        try {
            // Reemplaza "reglas.txt" con la ruta completa de tu archivo
            File archivo = new File("resources/reglas.txt");
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo de reglas: " + e.getMessage());
        }
    }
     
}