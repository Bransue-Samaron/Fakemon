
package com.mycompany.fakemon;
import java.util.Scanner;

public class Fakemon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("BIENVENIDO A FAKEMON");
            System.out.println("MENU DE INICIO");
            System.out.println("1. Nuevo Juego");
            System.out.println("2. Instrucciónes");
            System.out.println("3. Opciones");
            System.out.println("4. Creditos");
            System.out.println("5. Salir");
            System.out.print("Elige una Opción");


            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Código para   la opción 1
                    System.out.println("HAS SELECCIONADO NUEVO JUEGO");
                    break;
                case 2:
                    // Código para la opción 2
                    System.out.println("HAS SELECCIONADO INSTRUCCIONES");
                    break;
                case 3:
                    System.out.println("HAS SELECCIONADO EL MENU DE OPCIONES");
                    break;
                case 4:
                    System.out.println("HAS SELECCIONADO CREDITOS");
                    break;
                 case 5:
                    System.out.println("HAS SELECCIONADO SALIR");
                 default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }
}
