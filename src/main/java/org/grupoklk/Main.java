package org.grupoklk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean opcion = true;

        while (opcion) {
            try {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Español");
                System.out.println("2. English");
                System.out.println("3. Salir / Exit");
                System.out.print("Elija una opción: ");

                String input = scanner.nextLine().toLowerCase();

                switch (input) {
                    case "1":
                    case "español":
                        System.out.println("Ha seleccionado Programa En Español.");
                        Menu.espanol();
                        break;

                    case "2":
                    case "english":
                        System.out.println("You have selected Program In English.");
                        System.out.println("Later is still early.");
                        break;

                    case "3":
                    case "salir":
                    case "exit":
                        System.out.println("Saliendo del programa...");
                        opcion = false;
                        break;

                    default:
                        System.out.println("Error: Opción no válida. Por favor, intente nuevamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Ha ocurrido un problema con la entrada. Por favor, intente nuevamente.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
