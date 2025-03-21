package Practico2;

//Crea los siguientes métodos:
//1. calcularCostoEnvio(double peso, String zona): Calcula el costo de
// envío basado en la zona de envío (Nacional o Internacional) y el peso del
// paquete.
// - Nacional: $5 por kg
// - Internacional: $10 por kg
//2. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
// el costo de envío.
// Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego,
// muestra el total a pagar.

import java.util.Scanner;

public class CalculoEnvio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);

        double totalPagar = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalPagar);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            System.out.println("⚠️ Zona no válida. Se asumirá envío Nacional.");
            costoPorKg = 5.0;
        }

        return peso * costoPorKg;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
