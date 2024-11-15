package org.grupoklk;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static Logger logger = LogManager.getLogger(Menu.class);
    private static final Scanner scanner = new Scanner(System.in);
    private static List<User> usuariosGenerados;
    private static List<Cliente> clientesGenerados;
    private static List<Product> productosGenerados;
    private static List<Venta> ventasCliente = new ArrayList<>();

    public static void espanol() {
        boolean opcion = true;

        while (opcion) {
            try {
                logger.info("Bienvenido al programa de la tienda electrónica");
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
                        logger.info("Ha seleccionado Administrador.");
                        adminEsp();
                        break;

                    case "2":
                    case "gerente":
                        logger.info("Ha seleccionado Gerente.");
                        gerenteEsp();
                        break;

                    case "3":
                    case "vendedor":
                        logger.info("Ha seleccionado Vendedor.");
                        vendedorEsp();
                        break;

                    case "4":
                    case "salir":
                        logger.info("Saliendo del menú en español...");
                        opcion = false;
                        break;

                    default:
                        logger.info("Error: Opción no válida. Por favor, intente nuevamente.");
                        break;
                }
            } catch (Exception e) {
                logger.info("Error: Ha ocurrido un problema con la entrada. Por favor, intente nuevamente.");
            }
        }
    }

    public static void adminEsp() {
        boolean opcion = true;

        while (opcion) {
            try {
                logger.info("\nMenú Administrador (Español)");
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
                        logger.info("Saliendo del menú de administrador...");
                        opcion = false;
                        break;

                    default:
                        logger.info("Error: Opción no válida. Intente nuevamente.");
                        break;
                }
            } catch (Exception e) {
                logger.info("Error: Ocurrió un problema. Intente nuevamente.");
            }
        }
    }

    public static void gerenteEsp() {
        boolean opcion = true;

        while (opcion) {
            try {
                logger.info("\nMenú Gerente (Español)");
                System.out.println("1. Generar Informe de Ventas por Vendedor");
                System.out.println("2. Generar Informe de Inventario");
                System.out.println("3. Salir");
                System.out.print("Elija una opción: ");

                String input = scanner.nextLine().toLowerCase();

                switch (input) {
                    case "1":
                    case "generar informe de ventas por vendedor":
                        generarInformeVentas();
                        break;

                    case "2":
                    case "generar informe de inventario":
                        mostrarProductos();
                        break;

                    case "3":
                    case "salir":
                        logger.info("Saliendo del menú de gerente...");
                        opcion = false;
                        break;

                    default:
                        logger.info("Error: Opción no válida. Intente nuevamente.");
                        break;
                }
            } catch (Exception e) {
                logger.info("Error: Ocurrió un problema. Intente nuevamente.");
            }
        }
    }

    public static void vendedorEsp() {
        boolean opcion = true;

        while (opcion) {
            try {
                logger.info("\nMenú Vendedor (Español)");
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
                        logger.info("Saliendo del menú de vendedor...");
                        opcion = false;
                        break;

                    default:
                        logger.info("Error: Opción no válida. Intente nuevamente.");
                        break;
                }
            } catch (Exception e) {
                logger.info("Error: Ocurrió un problema. Intente nuevamente.");
            }
        }
    }

    private static void generarUsuarios() {
        logger.info("¿Cuántos usuarios desea generar? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        if (usuariosGenerados == null) {
            usuariosGenerados = Generator.generarUsuarios(cantidad);
        } else {
            usuariosGenerados.addAll(Generator.generarUsuarios(cantidad));
        }

        logger.info(cantidad + " usuarios generados exitosamente.");
    }

    private static void mostrarUsuarios() {
        if (usuariosGenerados == null || usuariosGenerados.isEmpty()) {
            logger.info("No hay usuarios generados para mostrar.");
        } else {
            logger.info("\nUsuarios generados:");
            for (User usuario : usuariosGenerados) {
                logger.info(usuario);
            }
        }
    }

    private static void generarProductos() {
        logger.info("¿Cuántos productos desea generar? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        if (productosGenerados == null) {
            productosGenerados = Generator.generarProductos(cantidad);
        } else {
            productosGenerados.addAll(Generator.generarProductos(cantidad));
        }

        logger.info(cantidad + " productos generados exitosamente.");
    }

    public static void mostrarProductos() {
        logger.info("Productos disponibles para la venta:");
        boolean productosDisponibles = false;

        for (Product producto : productosGenerados) {
            if (producto.getStock() > 0) {
                System.out.println(producto);
                productosDisponibles = true;
            }
        }

        if (!productosDisponibles) {
            logger.info("No hay productos con stock disponible.");
        }
    }

    private static void agregarStock() {
        logger.info("Ingrese el ID del producto al que desea agregar stock: ");
        String id = scanner.nextLine();
        Product producto = buscarProductoPorId(id);

        if (producto != null) {
            logger.info("Ingrese la cantidad de stock a agregar: ");
            int cantidad = Integer.parseInt(scanner.nextLine());
            producto.actualizarStock(producto.getStock() + cantidad);
            logger.info("Stock actualizado exitosamente. Nuevo stock: " + producto.getStock());
        } else {
            logger.info("Producto no encontrado.");
        }
    }

    private static void reducirStock() {
        logger.info("Ingrese el ID del producto al que desea reducir stock: ");
        String id = scanner.nextLine();
        Product producto = buscarProductoPorId(id);

        if (producto != null) {
            logger.info("Ingrese la cantidad de stock a reducir: ");
            int cantidad = Integer.parseInt(scanner.nextLine());
            if (cantidad <= producto.getStock()) {
                producto.actualizarStock(producto.getStock() - cantidad);
                logger.info("Stock actualizado exitosamente. Nuevo stock: " + producto.getStock());
            } else {
                logger.info("Error: La cantidad a reducir excede el stock actual.");
            }
        } else {
            logger.info("Producto no encontrado.");
        }
    }

    private static void eliminarProducto() {
        logger.info("Ingrese el ID del producto que desea eliminar: ");
        String id = scanner.nextLine();
        Product producto = buscarProductoPorId(id);

        if (producto != null) {
            productosGenerados.remove(producto);
            logger.info("Producto eliminado exitosamente.");
        } else {
            logger.info("Producto no encontrado.");
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

        logger.info("¿Cuántos clientes desea generar? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        clientesGenerados.addAll(Generator.generarClientes(cantidad));

        logger.info(cantidad + " clientes generados exitosamente.");
    }

    private static void mostrarClientes() {
        if (clientesGenerados == null || clientesGenerados.isEmpty()) {
            logger.info("No hay clientes generados para mostrar.");
        } else {
            logger.info("\nClientes generados:");
            for (Cliente cliente : clientesGenerados) {
                System.out.println(cliente);
            }
        }
    }

    private static void eliminarCliente() {
        logger.info("Ingrese la cédula del cliente que desea eliminar: ");
        String cedula = scanner.nextLine();

        Cliente cliente = buscarClientePorCedula(cedula);
        if (cliente != null) {
            clientesGenerados.remove(cliente);
            logger.info("Cliente eliminado exitosamente.");
        } else {
            logger.info("Cliente no encontrado.");
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
            logger.info("No hay vendedores disponibles.");
            return;
        }

        logger.info("Seleccione un vendedor de la siguiente lista:");
        for (int i = 0; i < vendedores.size(); i++) {
            System.out.println((i + 1) + ". " + vendedores.get(i).getUsername());
        }

        int seleccionVendedor = -1;
        while (seleccionVendedor < 0 || seleccionVendedor >= vendedores.size()) {
            logger.info("Ingrese el número del vendedor: ");
            try {
                seleccionVendedor = Integer.parseInt(scanner.nextLine()) - 1;
                if (seleccionVendedor < 0 || seleccionVendedor >= vendedores.size()) {
                    logger.info("Selección inválida. Por favor, elija un número de la lista.");
                }
            } catch (NumberFormatException e) {
                logger.info("Error: Debe ingresar un número válido.");
            }
        }

        User vendedorSeleccionado = vendedores.get(seleccionVendedor);

        logger.info("\nClientes disponibles:");
        for (Cliente cliente : clientesGenerados) {
            logger.info(cliente);
        }

        logger.info("Ingrese el ID del cliente para realizar la venta: ");
        String idCliente = scanner.nextLine();
        Cliente cliente = buscarClientePorCedula(idCliente);

        if (cliente == null) {
            logger.info("Cliente no encontrado.");
            return;
        }

        double totalCompra = 0;

        while (true) {
            logger.info("\nProductos disponibles para la venta:");
            boolean productosDisponibles = false;
            for (Product producto : productosGenerados) {
                if (producto.getStock() > 0) {
                    logger.info(producto);
                    productosDisponibles = true;
                }
            }

            if (!productosDisponibles) {
                logger.info("No hay productos con stock disponible para la venta.");
                break;
            }

            logger.info("\nIngrese el ID del producto que desea vender (o 'salir' para terminar): ");
            String idProducto = scanner.nextLine();

            if (idProducto.equalsIgnoreCase("salir")) {
                break;
            }

            Product productoSeleccionado = buscarProductoPorId(idProducto);

            if (productoSeleccionado == null || productoSeleccionado.getStock() <= 0) {
                logger.info("Producto no disponible o sin stock.");
                continue;
            }

            logger.info("Ingrese la cantidad a vender: ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            if (cantidad > productoSeleccionado.getStock()) {
                logger.info("No hay suficiente stock para la cantidad solicitada.");
                continue;
            }

            double totalProducto = productoSeleccionado.getPrice() * cantidad;
            totalCompra += totalProducto;

            Venta nuevaVenta = new Venta(vendedorSeleccionado, cliente, productoSeleccionado, cantidad);
            ventasCliente.add(nuevaVenta);

            productoSeleccionado.actualizarStock(productoSeleccionado.getStock() - cantidad);

            logger.info("¿Desea vender otro producto? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }

        if (!ventasCliente.isEmpty()) {
            logger.info("\nCompra finalizada.");
            System.out.println("Total de la compra: " + totalCompra);
            System.out.println("Productos comprados:");
            for (Venta venta : ventasCliente) {
                System.out.println(venta);
            }
            logger.info("¡Gracias por su compra!");
        } else {
            logger.info("No se realizó ninguna venta.");
        }
    }
    
    public static void generarInformeVentas() {
        List<User> vendedores = new ArrayList<>();
        for (User user : usuariosGenerados) {
            if (user.getRol().equalsIgnoreCase("vendedor")) {
                vendedores.add(user);
            }
        }

        if (vendedores.isEmpty()) {
            logger.info("No hay vendedores disponibles.");
            return;
        }

        logger.info("Seleccione un vendedor de la siguiente lista:");
        for (int i = 0; i < vendedores.size(); i++) {
            logger.info((i + 1) + ". " + vendedores.get(i).getUsername());
        }

        int seleccionVendedor = -1;
        while (seleccionVendedor < 0 || seleccionVendedor >= vendedores.size()) {
            logger.info("Ingrese el número del vendedor: ");
            try {
                seleccionVendedor = Integer.parseInt(scanner.nextLine()) - 1;
                if (seleccionVendedor < 0 || seleccionVendedor >= vendedores.size()) {
                    logger.info("Selección inválida. Por favor, elija un número de la lista.");
                }
            } catch (NumberFormatException e) {
                logger.info("Error: Debe ingresar un número válido.");
            }
        }

        User vendedorSeleccionado = vendedores.get(seleccionVendedor);
        logger.info("Informe de ventas del vendedor: " + vendedorSeleccionado.getUsername());

        double totalVentas = 0;
        boolean ventasEncontradas = false;
        for (Venta venta : ventasCliente) {
            if (venta.getUser().equals(vendedorSeleccionado)) {
                System.out.println(venta);
                totalVentas += venta.getTotal();
                ventasEncontradas = true;
            }
        }

        if (!ventasEncontradas) {
            logger.info("No se encontraron ventas realizadas por este vendedor.");
        } else {
            logger.info("Total de ventas realizadas: $" + totalVentas);
        }
    }
}