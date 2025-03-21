package Practico2;

// Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son
// positivos, negativos y cuántos son ceros.

import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        solicitarNumeros(scanner, numeros);

        int positivos = contarPositivos(numeros);
        int negativos = contarNegativos(numeros);
        int ceros = contarCeros(numeros);

        mostrarResultados(positivos, negativos, ceros);
    }

    public static void solicitarNumeros(Scanner scanner, int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
    }

    public static int contarPositivos(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero > 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarNegativos(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero < 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarCeros(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(int positivos, int negativos, int ceros) {
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
