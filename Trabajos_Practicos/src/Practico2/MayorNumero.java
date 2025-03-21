package Practico2;

// Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el
// mayor.

import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema!");
        int[] numeros = pedirNumeros(sc);
        int mayor = calcularMayor(numeros);
        System.out.println("El mayor es: " + mayor);
    }

    public static int[] pedirNumeros(Scanner sc) {
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el numero N°" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        return numeros;
    }

    public static int calcularMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }
}
