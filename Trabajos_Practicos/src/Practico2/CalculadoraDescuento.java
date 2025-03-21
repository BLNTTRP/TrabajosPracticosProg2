package Practico2;

// Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
// Luego, aplique los siguientes descuentos:
// - Categoría A: 10% de descuento
// - Categoría B: 15% de descuento
// - Categoría C: 20% de descuento
// El programa debe mostrar el precio original, el descuento aplicado y el precio final.

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema!");
        double precio = pedirPrecioProd(sc);
        char categoria = pedirCategoriaProd(sc);
        double descuento = calcularDescuento(categoria);
        double precioFinal = aplicarDescuento(precio, descuento);
        System.out.println("Precio final: $" + precioFinal);
    }

    public static double pedirPrecioProd(Scanner sc) {
        System.out.print("Ingrese el precio del producto: $");
        return sc.nextDouble();
    }

    public static char pedirCategoriaProd(Scanner sc) {
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        return sc.next().toUpperCase().charAt(0);
    }

    public static double calcularDescuento(char categoria) {
        double descuento = 0;
        if (categoria == 'A') {
            System.out.println("Descuento aplicado: 10%");
            descuento = 0.1;
        } else if (categoria == 'B') {
            System.out.println("Descuento aplicado: 15%");
            descuento = 0.15;
        } else if (categoria == 'C') {
            System.out.println("Descuento aplicado: 20%");
            descuento = 0.2;
        }
        return descuento;
    }

    public static double aplicarDescuento(double precio, double descuento) {
        double precioFinal = precio * (1 - descuento);
        return precioFinal;
    }
}
