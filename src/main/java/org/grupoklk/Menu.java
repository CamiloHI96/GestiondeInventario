package org.grupoklk;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<User> usuariosGenerados;
    private static List<Product> productosGenerados;

    public static void espanol() {
        boolean opcion = true;

        while (opcion) {
            try {
                System.out.println("Bienvenido al programa de la tienda electrónica");
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
                        adminEsp();
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
                        System.out.println("Saliendo del menú en español...");
                        opcion = false;
                        break;

                    default:
                        System.out.println("Error: Opción no válida. Por favor, intente nuevamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Ha ocurrido un problema con la entrada. Por favor, intente nuevamente.");
            }
        }
    }

    public static void adminEsp() {
        boolean opcion = true;

        while (opcion) {
            try {
                System.out.println("Menú Administrador");
                System.out.println("1. Generar Usuarios");
                System.out.println("2. Mostrar Usuarios");
                System.out.println("3. Generar Productos");
                System.out.println("4. Mostrar Productos");
                System.out.println("5. Salir");
                System.out.print("Elija una opción: ");

                String input = scanner.nextLine().toLowerCase();

                switch (input) {
                    case "1":
                    case "generar usuarios":
                        generarUsuarios();
                        break;

                    case "2":
                    case "mostrar usuarios":
                        mostrarUsuarios();
                        break;

                    case "3":
                    case "generar productos":
                        generarProductos();
                        break;

                    case "4":
                    case "mostrar productos":
                        mostrarProductos();
                        break;

                    case "5":
                    case "salir":
                        System.out.println("Saliendo del menú administrador...");
                        opcion = false;
                        break;

                    default:
                        System.out.println("Error: Opción no válida. Por favor, intente nuevamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Ha ocurrido un problema con la entrada. Por favor, intente nuevamente.");
            }
        }
    }

    public static void english() {
        boolean opcion = true;

        while (opcion) {
            try {
                System.out.println("Welcome to the e-store program");
                System.out.println("Select an option:");
                System.out.println("1. Administrator");
                System.out.println("2. Manager");
                System.out.println("3. Seller");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                String input = scanner.nextLine().toLowerCase();

                switch (input) {
                    case "1":
                    case "administrator":
                        System.out.println("You have selected Administrator.");
                        adminEng();
                        break;

                    case "2":
                    case "manager":
                        System.out.println("You have selected Manager.");
                        break;

                    case "3":
                    case "seller":
                        System.out.println("You have selected Seller.");
                        break;

                    case "4":
                    case "exit":
                        System.out.println("Exiting English menu...");
                        opcion = false;
                        break;

                    default:
                        System.out.println("Error: Invalid option. Please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: A problem has occurred with the input. Please try again.");
            }
        }
    }

    public static void adminEng() {
        boolean opcion = true;

        while (opcion) {
            try {
                System.out.println("Administrator Menu");
                System.out.println("1. Generate Users");
                System.out.println("2. Show Users");
                System.out.println("3. Generate Products");
                System.out.println("4. Show Products");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                String input = scanner.nextLine().toLowerCase();

                switch (input) {
                    case "1":
                    case "generate users":
                        generateUsers();
                        break;

                    case "2":
                    case "show users":
                        showUsers();
                        break;

                    case "3":
                    case "generate products":
                        generateProducts();
                        break;

                    case "4":
                    case "show products":
                        showProducts();
                        break;

                    case "5":
                    case "exit":
                        System.out.println("Exiting administrator menu...");
                        opcion = false;
                        break;

                    default:
                        System.out.println("Error: Invalid option. Please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: A problem has occurred with the input. Please try again.");
            }
        }
    }

    private static void generarUsuarios() {
        System.out.print("¿Cuántos usuarios desea generar? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        if (usuariosGenerados == null) {
            usuariosGenerados = Generator.generarUsuarios(cantidad);
        } else {
            usuariosGenerados.addAll(Generator.generarUsuarios(cantidad));
        }

        System.out.println(cantidad + " usuarios generados exitosamente.");
    }

    private static void mostrarUsuarios() {
        if (usuariosGenerados == null || usuariosGenerados.isEmpty()) {
            System.out.println("No hay usuarios generados para mostrar.");
        } else {
            System.out.println("\nUsuarios generados:");
            for (User usuario : usuariosGenerados) {
                System.out.println(usuario);
            }
        }
    }

    private static void generateUsers() {
        System.out.print("How many users would you like to generate? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        if (usuariosGenerados == null) {
            usuariosGenerados = Generator.generarUsuarios(cantidad);
        } else {
            usuariosGenerados.addAll(Generator.generarUsuarios(cantidad));
        }

        System.out.println(cantidad + " users generated successfully.");
    }

    private static void showUsers() {
        if (usuariosGenerados == null || usuariosGenerados.isEmpty()) {
            System.out.println("No users have been generated to show.");
        } else {
            System.out.println("\nGenerated users:");
            for (User user : usuariosGenerados) {
                System.out.println(user);
            }
        }
    }

    private static void generarProductos() {
        System.out.print("¿Cuántos productos desea generar? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        if (productosGenerados == null) {
            productosGenerados = Generator.generarProductos(cantidad);
        } else {
            productosGenerados.addAll(Generator.generarProductos(cantidad));
        }

        System.out.println(cantidad + " productos generados exitosamente.");
    }

    private static void mostrarProductos() {
        if (productosGenerados == null || productosGenerados.isEmpty()) {
            System.out.println("No hay productos generados para mostrar.");
        } else {
            System.out.println("\nProductos generados:");
            for (Product producto : productosGenerados) {
                System.out.println(producto);
            }
        }
    }

    private static void generateProducts() {
        System.out.print("How many products would you like to generate? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        if (productosGenerados == null) {
            productosGenerados = Generator.generarProductos(cantidad);
        } else {
            productosGenerados.addAll(Generator.generarProductos(cantidad));
        }

        System.out.println(cantidad + " products generated successfully.");
    }

    private static void showProducts() {
        if (productosGenerados == null || productosGenerados.isEmpty()) {
            System.out.println("No products have been generated to show.");
        } else {
            System.out.println("\nGenerated products:");
            for (Product product : productosGenerados) {
                System.out.println(product);
            }
        }
    }

}