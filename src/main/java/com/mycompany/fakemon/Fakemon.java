
package com.mycompany.fakemon;
import java.util.Scanner;

public class Fakemon {

    public static void main(String[] args) {
        
        // Crear una instancia de la clase Instrucciones
        Instrucciones Instrucciones = new Instrucciones();
        
        // Para que se lea la instruccion de escaner
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            
            System.out.println("----------------------------");
            System.out.println("BIENVENIDO A FAKEMON");
            System.out.println("MENU DE INICIO\n");
            System.out.println("1. Nuevo Juego");
            System.out.println("2. Instrucciones");
            System.out.println("3. Opciones");
            System.out.println("4. Creditos");
            System.out.println("5. Salir");
            System.out.print("Elige una Opcion: ");


            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                  System.out.println("----------------------------\n");
                  System.out.println("HAS SELECCIONADO NUEVO JUEGO\n\n");
                    break;
                case 2:
                  System.out.println("----------------------------\n");
                    System.out.println("HAS SELECCIONADO INSTRUCCIONES\n\n");
                            // Mostrar el menú de instrucciones
                    Instrucciones.mostrarMenu();
                    break;
                case 3:
                  System.out.println("----------------------------\n");
                    System.out.println("HAS SELECCIONADO EL MENU DE OPCIONES\n\n");
                    break;
                case 4:
                  System.out.println("----------------------------\n");
                    System.out.println("HAS SELECCIONADO CREDITOS\n\n");
                    break;
                 case 5:
                  System.out.println("----------------------------\n");
                    System.out.println("HAS SELECCIONADO SALIR\n\n");
                     break;
                 default:
                  System.out.println("----------------------------\n");
                    System.out.println("Opción inválida\n\n");
            }
        } while (opcion != 5);
    }
}
