package Practico2;

// Crea un método actualizarStock(int stockActual, int cantidadVendida,
// int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
// de productos:
// NuevoStock=StockActual−CantidadVendida+CantidadRecibidaNuevoStock = StockActual -
// CantidadVendida + CantidadRecibida
// Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y
// muestra el stock actualizado.

import java.util.Scanner;

public class GestionStock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}