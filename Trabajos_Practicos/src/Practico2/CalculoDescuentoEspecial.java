package Practico2;

import java.util.Scanner;

// Declara una variable global DESCUENTO_ESPECIAL = 0.10. Luego, crea un método
// calcularDescuentoEspecial(double precio) que use la variable global para
// calcular el descuento especial del 10%.
// Dentro del método, declara una variable local descuentoAplicado, almacena el valor del
// descuento y muestra el precio final con descuento.

public class CalculoDescuentoEspecial {

    public static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        calcularDescuentoEspecial(precio);
    }

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;

        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}