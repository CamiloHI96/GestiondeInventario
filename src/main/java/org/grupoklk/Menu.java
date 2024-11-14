package org.grupoklk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<User> usuariosGenerados;
    private static List<Product> productosGenerados;
    private static List<Cliente> clientesGenerados;

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

    public static void adminEsp() {
        boolean opcion = true;

        while (opcion) {
            try {
                System.out.println("\nMenú Administrador (Español)");
                System.out.println("1. Generar Usuarios");
                System.out.println("2. Mostrar Usuarios");
                System.out.println("3. Generar Productos");
                System.out.println("4. Mostrar Productos");
                System.out.println("5. Agregar Stock a Producto");
                System.out.println("6. Reducir Stock de Producto");
                System.out.println("7. Eliminar Producto");
                System.out.println("8. Crear Cliente");
                System.out.println("9. Mostrar Clientes");
                System.out.println("10. Eliminar Cliente");
                System.out.println("11. Salir");
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
                    case "agregar stock":
                        agregarStock();
                        break;

                    case "6":
                    case "reducir stock":
                        reducirStock();
                        break;

                    case "7":
                    case "eliminar producto":
                        eliminarProducto();
                        break;

                    case "8":
                    case "crear cliente":
                        crearClientes();
                        break;

                    case "9":
                    case "mostrar clientes":
                        mostrarClientes();
                        break;

                    case "10":
                    case "eliminar cliente":
                        eliminarCliente();
                        break;

                    case "11":
                    case "salir":
                        System.out.println("Saliendo del menú de administrador...");
                        opcion = false;
                        break;

                    default:
                        System.out.println("Error: Opción no válida. Intente nuevamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Ocurrió un problema. Intente nuevamente.");
            }
        }
    }

    public static void adminEng() {
        boolean option = true;

        while (option) {
            try {
                System.out.println("\nAdministrator Menu (English)");
                System.out.println("1. Generate Users");
                System.out.println("2. Show Users");
                System.out.println("3. Generate Products");
                System.out.println("4. Show Products");
                System.out.println("5. Add Stock to Product");
                System.out.println("6. Reduce Stock from Product");
                System.out.println("7. Delete Product");
                System.out.println("8. Create Client");
                System.out.println("9. Show Clients");
                System.out.println("10. Delete Client");
                System.out.println("11. Exit");
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
                    case "add stock":
                        addStock();
                        break;

                    case "6":
                    case "reduce stock":
                        reduceStock();
                        break;

                    case "7":
                    case "delete product":
                        deleteProduct();
                        break;

                    case "8":
                    case "create client":
                        createClients();
                        break;

                    case "9":
                    case "show clients":
                        showClients();
                        break;

                    case "10":
                    case "delete client":
                        deleteClient();
                        break;

                    case "11":
                    case "exit":
                        System.out.println("Exiting administrator menu...");
                        option = false;
                        break;

                    default:
                        System.out.println("Error: Invalid option. Please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: A problem occurred. Please try again.");
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

    private static void agregarStock() {
        System.out.print("Ingrese el ID del producto al que desea agregar stock: ");
        String id = scanner.nextLine();
        Product producto = buscarProductoPorId(id);

        if (producto != null) {
            System.out.print("Ingrese la cantidad de stock a agregar: ");
            int cantidad = Integer.parseInt(scanner.nextLine());
            producto.actualizarStock(producto.getStock() + cantidad);
            System.out.println("Stock actualizado exitosamente. Nuevo stock: " + producto.getStock());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void reducirStock() {
        System.out.print("Ingrese el ID del producto al que desea reducir stock: ");
        String id = scanner.nextLine();
        Product producto = buscarProductoPorId(id);

        if (producto != null) {
            System.out.print("Ingrese la cantidad de stock a reducir: ");
            int cantidad = Integer.parseInt(scanner.nextLine());
            if (cantidad <= producto.getStock()) {
                producto.actualizarStock(producto.getStock() - cantidad);
                System.out.println("Stock actualizado exitosamente. Nuevo stock: " + producto.getStock());
            } else {
                System.out.println("Error: La cantidad a reducir excede el stock actual.");
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void eliminarProducto() {
        System.out.print("Ingrese el ID del producto que desea eliminar: ");
        String id = scanner.nextLine();
        Product producto = buscarProductoPorId(id);

        if (producto != null) {
            productosGenerados.remove(producto);
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static Product buscarProductoPorId(String id) {
        if (productosGenerados != null) {
            for (Product producto : productosGenerados) {
                if (producto.getId().equals(id)) {
                    return producto;
                }
            }
        }
        return null;
    }

    private static void addStock() {
        System.out.print("Enter the product ID to add stock: ");
        String id = scanner.nextLine();
        Product product = findProductById(id);

        if (product != null) {
            System.out.print("Enter the amount of stock to add: ");
            int amount = Integer.parseInt(scanner.nextLine());
            product.setStock(product.getStock() + amount);
            System.out.println("Stock successfully updated. New stock: " + product.getStock());
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void reduceStock() {
        System.out.print("Enter the product ID to reduce stock: ");
        String id = scanner.nextLine();
        Product product = findProductById(id);

        if (product != null) {
            System.out.print("Enter the amount of stock to reduce: ");
            int amount = Integer.parseInt(scanner.nextLine());
            if (amount <= product.getStock()) {
                product.setStock(product.getStock() - amount);
                System.out.println("Stock successfully updated. New stock: " + product.getStock());
            } else {
                System.out.println("Error: The amount exceeds the current stock.");
            }
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void deleteProduct() {
        System.out.print("Enter the product ID to delete: ");
        String id = scanner.nextLine();
        Product product = findProductById(id);

        if (product != null) {
            productosGenerados.remove(product);
            System.out.println("Product successfully deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private static Product findProductById(String id) {
        if (productosGenerados != null) {
            for (Product product : productosGenerados) {
                if (product.getId().equals(id)) {
                    return product;
                }
            }
        }
        return null;
    }

    private static void crearClientes() {
        if (clientesGenerados == null) {
            clientesGenerados = new ArrayList<>();
        }

        System.out.print("¿Cuántos clientes desea generar? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        clientesGenerados.addAll(Generator.generarClientes(cantidad));

        System.out.println(cantidad + " clientes generados exitosamente.");
    }

    private static void mostrarClientes() {
        if (clientesGenerados == null || clientesGenerados.isEmpty()) {
            System.out.println("No hay clientes generados para mostrar.");
        } else {
            System.out.println("\nClientes generados:");
            for (Cliente cliente : clientesGenerados) {
                System.out.println(cliente);
            }
        }
    }

    private static void eliminarCliente() {
        System.out.print("Ingrese la cédula del cliente que desea eliminar: ");
        String cedula = scanner.nextLine();

        Cliente cliente = buscarClientePorCedula(cedula);
        if (cliente != null) {
            clientesGenerados.remove(cliente);
            System.out.println("Cliente eliminado exitosamente.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static Cliente buscarClientePorCedula(String cedula) {
        for (Cliente cliente : clientesGenerados) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }

    private static void createClients() {
        if (clientesGenerados == null) {
            clientesGenerados = new ArrayList<>();
        }

        System.out.print("How many clients would you like to generate? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        clientesGenerados.addAll(Generator.generarClientes(cantidad));

        System.out.println(cantidad + " clients generated successfully.");
    }

    private static void showClients() {
        if (clientesGenerados == null || clientesGenerados.isEmpty()) {
            System.out.println("No clients have been generated to show.");
        } else {
            System.out.println("\nGenerated clients:");
            for (Cliente client : clientesGenerados) {
                System.out.println(client);
            }
        }
    }

    private static void deleteClient() {
        System.out.print("Enter the ID number of the client you want to delete: ");
        String id = scanner.nextLine();

        Cliente client = findClientById(id);
        if (client != null) {
            clientesGenerados.remove(client);
            System.out.println("Client successfully deleted.");
        } else {
            System.out.println("Client not found.");
        }
    }

    private static Cliente findClientById(String cedula) {
        for (Cliente cliente : clientesGenerados) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }
}