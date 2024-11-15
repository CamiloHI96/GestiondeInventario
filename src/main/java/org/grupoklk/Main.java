package org.grupoklk;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Main.class);
        Scanner scanner = new Scanner(System.in);
        boolean opcion = true;

        while (opcion) {
            try {
                logger.info("Seleccione una opción:");
                System.out.println("1. Español");
                System.out.println("2. English");
                System.out.println("3. Salir / Exit");
                System.out.print("Elija una opción: ");

                String input = scanner.nextLine().toLowerCase();

                switch (input) {
                    case "1":
                    case "español":
                        logger.info("Ha seleccionado Programa En Español.");
                        Menu.espanol();
                        break;

                    case "2":
                    case "english":
                        logger.info("You have selected Program In English.");
                        System.out.println("Later is still early.");
                        break;

                    case "3":
                    case "salir":
                    case "exit":
                        logger.info("Saliendo del programa...");
                        opcion = false;
                        break;

                    default:
                        logger.info("Error: Opción no válida. Por favor, intente nuevamente.");
                        break;
                }
            } catch (Exception e) {
                logger.info("Error: Ha ocurrido un problema con la entrada. Por favor, intente nuevamente.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
