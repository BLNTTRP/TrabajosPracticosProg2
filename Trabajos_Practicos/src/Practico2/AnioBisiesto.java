package Practico2;

// Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. Un año es
// bisiesto si es divisible por 4, pero no por 100, salvo que también sea divisible por 400.

import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema!");
        int anio = pedirAnio(sc);
        boolean esBisiesto = calcularBisiesto(anio);
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

    public static int pedirAnio(Scanner sc) {
        System.out.print("Ingrese un año: ");
        return sc.nextInt();
    }

    public static boolean calcularBisiesto(int anio) {
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
