package Practico2;

// Crea un método calcularPrecioFinal(double precioBase, double
// impuesto, double descuento) que calcule el precio final de un producto en un
// e-commerce. La fórmula es:
// PrecioFinal=PrecioBase+(PrecioBase×Impuesto)−(PrecioBase×Descuento)

// Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje
// de descuento, llama al método y muestra el precio final.

import java.util.Scanner;

public class CalcularPrecioFinalProd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble();
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return precioFinal;
    }
}
