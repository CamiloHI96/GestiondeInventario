package org.grupoklk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean opcion = true;

        while (opcion) {
            try {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Administrador");
                System.out.println("2. Gerente");
                System.out.println("3. Vendedor");
                System.out.println("4. Salir");
                System.out.print("Elija una opción: ");

                String input = scanner.nextLine().toLowerCase();

                switch (input) {
                    case "1":
                    case "administrador":
                        System.out.println("Ha seleccionado Administrador.");
                        break;

                    case "2":
                    case "gerente":
                        System.out.println("Ha seleccionado Gerente.");
                        break;

                    case "3":
                    case "vendedor":
                        System.out.println("Ha seleccionado Vendedor.");
                        break;

                    case "4":
                    case "salir":
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
            scanner.close();
        }
    }
}