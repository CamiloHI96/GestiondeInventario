package org.grupoklk;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static List<User> generarUsuarios(int cantidad) {
        Faker faker = new Faker();
        List<User> usuarios = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            String rol;
            int rand = faker.number().numberBetween(1, 10);
            if (rand <= 7) {
                rol = "Vendedor";
            } else if (rand <= 9) {
                rol = "Administrador";
            } else {
                rol = "Gerente";
            }

            usuarios.add(new User(
                    faker.name().username(),
                    faker.internet().password(),
                    rol
            ));
        }
        return usuarios;
    }

    public static List<Product> generarProductos(int cantidad) {
        Faker faker = new Faker();
        List<Product> productos = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            productos.add(new Product(
                    faker.idNumber().valid(),
                    faker.commerce().productName(),
                    faker.commerce().material(),
                    faker.number().randomDouble(2, 10, 1000),
                    faker.number().numberBetween(1, 100)
            ));
        }
        return productos;
    }
}
