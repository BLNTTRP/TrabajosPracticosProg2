package Practico9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // --- Crear algunos Productos ---
        Producto<String> laptop = new Producto<>("SKU-001", "Laptop Gamer Pro", 1500.99);
        Producto<String> teclado = new Producto<>("SKU-002", "Teclado Mecánico RGB", 120.50);
        Producto<Integer> mouse = new Producto<>(101, "Mouse Inalámbrico", 25.75);
        Producto<Integer> monitor = new Producto<>(102, "Monitor Curvo 27\"", 350.00);
        Producto<String> silla = new Producto<>("SKU-003", "Silla Ergonómica", 220.00);

        // --- Crear Pedidos ---
        // Usamos la fecha actual con LocalDate.now() y restamos días para variar.
        Pedido pedido1 = new Pedido(1, LocalDate.now().minusDays(5));
        pedido1.agregarProducto(laptop); // Total: 1500.99
        pedido1.agregarProducto(mouse);  // Total: 1500.99 + 25.75 = 1526.74

        Pedido pedido2 = new Pedido(2, LocalDate.now());
        pedido2.agregarProducto(teclado); // Total: 120.50
        pedido2.agregarProducto(monitor); // Total: 120.50 + 350.00 = 470.50
        pedido2.agregarProducto(silla);   // Total: 470.50 + 220.00 = 690.50

        Pedido pedido3 = new Pedido(3, LocalDate.now().minusDays(10));
        pedido3.agregarProducto(monitor); // Total: 350.00
        pedido3.agregarProducto(silla);   // Total: 350.00 + 220.00 = 570.00

        Pedido pedido4 = new Pedido(4, LocalDate.now().minusDays(2));
        pedido4.agregarProducto(laptop);   // Total: 1500.99
        pedido4.agregarProducto(teclado);  // Total: 1500.99 + 120.50 = 1621.49
        pedido4.agregarProducto(mouse);    // Total: 1621.49 + 25.75 = 1647.24
        pedido4.agregarProducto(monitor);  // Total: 1647.24 + 350.00 = 1997.24

        // --- Almacenar Pedidos en una Lista ---
        List<Pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);
        listaPedidos.add(pedido4);

        System.out.println("--- Lista de Pedidos (Original) ---");
        imprimirPedidos(listaPedidos);

        // --- Ordenar por Total (usando Comparable de Pedido) ---
        Collections.sort(listaPedidos);
        System.out.println("\n--- Lista de Pedidos (Ordenada por Total Ascendente) ---");
        imprimirPedidos(listaPedidos);

        // --- Ordenar por Fecha (usando ComparadorPedidosPorFecha) ---
        listaPedidos.sort(new ComparadorPedidosPorFecha());
        System.out.println("\n--- Lista de Pedidos (Ordenada por Fecha Ascendente) ---");
        imprimirPedidos(listaPedidos);

        // Ejemplo de orden descendente por fecha
        listaPedidos.sort(new ComparadorPedidosPorFecha().reversed());
        System.out.println("\n--- Lista de Pedidos (Ordenada por Fecha Descendente) ---");
        imprimirPedidos(listaPedidos);
        System.out.println();

        // Crear carrito y agregar productos
        Carrito<Producto<String>> carrito = new Carrito<>();
        carrito.agregarProducto(laptop);
        carrito.agregarProducto(teclado);
        carrito.mostrarProductos();

        // Calcular el total del carrito
        System.out.println("\n----- Total del Carrito -----");
        System.out.printf("Total: $%.2f%n", carrito.obtenerTotal());
        System.out.println("------------------------------");

        // Buscar un pedido por su ID usando la clase Buscador
        System.out.println("\n----- Búsqueda de Pedido -----");
        Buscador<Pedido, Integer> buscador = new Buscador<>();
        int idBuscado = 2;
        Pedido pedidoEncontrado = buscador.buscar(listaPedidos, idBuscado);

        if (pedidoEncontrado != null) {
            System.out.println("Pedido encontrado: " + pedidoEncontrado);
        } else {
            System.out.println("No se encontró un pedido con ID: " + idBuscado);
        }

        // Caso adicional: Buscar un pedido que no exista
        int idNoExistente = 5;
        Pedido pedidoNoEncontrado = buscador.buscar(listaPedidos, idNoExistente);
        if (pedidoNoEncontrado != null) {
            System.out.println("Pedido encontrado: " + pedidoNoEncontrado);
        } else {
            System.out.println("No se encontró un pedido con ID: " + idNoExistente);
        }
        System.out.println("-------------------------------");
    }

    public static void imprimirPedidos(List<Pedido> pedidos) {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
