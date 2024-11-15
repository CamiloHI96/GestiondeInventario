package org.grupoklk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<User> usuariosGenerados;
    private static List<Cliente> clientesGenerados;
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
                        vendedorEsp();
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

    public static void vendedorEsp() {
        boolean opcion = true;

        while (opcion) {
            try {
                System.out.println("\nMenú Vendedor (Español)");
                System.out.println("1. Ver Productos Disponibles");
                System.out.println("2. Ver Clientes");
                System.out.println("3. Realizar Venta");
                System.out.println("4. Salir");
                System.out.print("Elija una opción: ");

                String input = scanner.nextLine().toLowerCase();

                switch (input) {
                    case "1":
                    case "ver productos disponibles":
                        mostrarProductos();
                        break;

                    case "2":
                    case "ver clientes":
                        mostrarClientes();
                        break;

                    case "3":
                    case "realizar venta":
                        realizarVenta();
                        break;

                    case "4":
                    case "salir":
                        System.out.println("Saliendo del menú de vendedor...");
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

    public static void mostrarProductos() {
        System.out.println("Productos disponibles para la venta:");
        boolean productosDisponibles = false;

        for (Product producto : productosGenerados) {
            if (producto.getStock() > 0) {
                System.out.println(producto); // Muestra la información del producto
                productosDisponibles = true;
            }
        }

        if (!productosDisponibles) {
            System.out.println("No hay productos con stock disponible.");
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

    public static void realizarVenta() {
        List<User> vendedores = new ArrayList<>();
        for (User user : usuariosGenerados) {
            if (user.getRol().equalsIgnoreCase("vendedor")) {
                vendedores.add(user);
            }
        }

        if (vendedores.isEmpty()) {
            System.out.println("No hay vendedores disponibles.");
            return;
        }

        System.out.println("Seleccione un vendedor de la siguiente lista:");
        for (int i = 0; i < vendedores.size(); i++) {
            System.out.println((i + 1) + ". " + vendedores.get(i).getUsername());
        }

        int seleccionVendedor = -1;
        while (seleccionVendedor < 0 || seleccionVendedor >= vendedores.size()) {
            System.out.print("Ingrese el número del vendedor: ");
            try {
                seleccionVendedor = Integer.parseInt(scanner.nextLine()) - 1;
                if (seleccionVendedor < 0 || seleccionVendedor >= vendedores.size()) {
                    System.out.println("Selección inválida. Por favor, elija un número de la lista.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
            }
        }

        User vendedorSeleccionado = vendedores.get(seleccionVendedor);
        
        System.out.println("\nClientes disponibles:");
        for (Cliente cliente : clientesGenerados) {
            System.out.println(cliente);
        }

        System.out.print("Ingrese el ID del cliente para realizar la venta: ");
        String idCliente = scanner.nextLine();
        Cliente cliente = buscarClientePorCedula(idCliente);

        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        List<Venta> ventasCliente = new ArrayList<>();
        double totalCompra = 0;

        while (true) {
            System.out.println("\nProductos disponibles para la venta:");
            boolean productosDisponibles = false;
            for (Product producto : productosGenerados) {
                if (producto.getStock() > 0) {
                    System.out.println(producto);
                    productosDisponibles = true;
                }
            }

            if (!productosDisponibles) {
                System.out.println("No hay productos con stock disponible para la venta.");
                break;
            }

            System.out.print("\nIngrese el ID del producto que desea vender (o 'salir' para terminar): ");
            String idProducto = scanner.nextLine();

            if (idProducto.equalsIgnoreCase("salir")) {
                break;
            }

            Product productoSeleccionado = buscarProductoPorId(idProducto);

            if (productoSeleccionado == null || productoSeleccionado.getStock() <= 0) {
                System.out.println("Producto no disponible o sin stock.");
                continue;
            }

            System.out.print("Ingrese la cantidad a vender: ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            if (cantidad > productoSeleccionado.getStock()) {
                System.out.println("No hay suficiente stock para la cantidad solicitada.");
                continue;
            }

            double totalProducto = productoSeleccionado.getPrice() * cantidad;
            totalCompra += totalProducto;

            Venta nuevaVenta = new Venta(vendedorSeleccionado, cliente, productoSeleccionado, cantidad);
            ventasCliente.add(nuevaVenta);

            productoSeleccionado.actualizarStock(productoSeleccionado.getStock() - cantidad);

            System.out.print("¿Desea vender otro producto? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }

        if (!ventasCliente.isEmpty()) {
            System.out.println("\nCompra finalizada.");
            System.out.println("Total de la compra: " + totalCompra);
            System.out.println("Productos comprados:");
            for (Venta venta : ventasCliente) {
                System.out.println(venta);
            }
            System.out.println("¡Gracias por su compra!");
        } else {
            System.out.println("No se realizó ninguna venta.");
        }
    }

}