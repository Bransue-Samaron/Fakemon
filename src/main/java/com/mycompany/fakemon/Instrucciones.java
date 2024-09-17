package com.mycompany.fakemon;

import java.io.File; // Esta libreria es para leer archivos
import java.util.Scanner; // Esta libreria es para leer entradas en teclado

public class Instrucciones {

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menu de Instrucciones ---");
            System.out.println("1. Reglas basicas del juego");
            System.out.println("2. Tipos de Fakemon y sus efectividades");
            System.out.println("3. Captura de Fakemon");
            System.out.println("4. Combates Fakemon");
            System.out.println("5. Evolución de Fakemon");
            System.out.println("6. Objetos y su uso");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarReglasBasicas();
                    break;
                case 2:
                    mostrarTiposYEfectividades();
                    break;
                case 3:
                    //mostrarCapturas();
                    break;
                case 4:
                    //mostratCombates();
                    break;
                case 5:
                    //mostrarEvoluciones();
                    break;
                case 6:
                    //mostrarObjetos();
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion inválida. Intenta de nuevo.");
            }
        } while (opcion != 7);
    }

//Aqui se muestan las Reglas basicas del juego
    
    private void mostrarTiposYEfectividades() {
        try {
            
            File archivo = new File("resources/Tabla de tipos.txt");
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

    // ... y así sucesivamente para cada método que muestra información específica

    public static void main(String[] args) {
        Instrucciones instrucciones = new Instrucciones();
        instrucciones.mostrarMenu();
    }
    
     private void mostrarReglasBasicas() {
        try {
            
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