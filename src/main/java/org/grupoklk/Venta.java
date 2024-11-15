package org.grupoklk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venta {
    private static int contadorId = 1; // Contador para garantizar ID único
    private String id;
    private User user;
    private Cliente cliente;
    private Product producto;
    private int cantidad;
    private double total;

    public Venta(User user, Cliente cliente, Product producto, int cantidad) {
        this.id = generateUniqueId() + "-" + contadorId++;
        this.user = user;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = producto.getPrice() * cantidad;
    }

    private String generateUniqueId() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }

    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Product getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        double valorPorProducto = producto.getPrice() * cantidad;
        return "Fecha y Hora: " + generateUniqueId() + "\n" +
                "ID de Compra: " + id + "\n" +
                "Vendedor: " + user.getUsername() + "\n" +
                "Producto: " + producto.getName() + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "Valor Unidad: $" + producto.getPrice() + "\n" +
                "Valor Total del Producto: $" + valorPorProducto + "\n" +
                "Total de la Venta: $" + total + "\n" +
                "ID Cliente: " + cliente.getCedula()+ " - " + cliente.getUsername();
    }
}