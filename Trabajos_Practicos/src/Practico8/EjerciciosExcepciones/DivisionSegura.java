package Practico8.EjerciciosExcepciones;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerador;
        int denominador;
        double resultado;

        System.out.println("Ingrese el primer número entero (numerador):");
        numerador = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero (denominador):");
        denominador = scanner.nextInt();

        try {
            resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error, no se puede dividir por cero. Por favor, intente de nuevo con un denominador diferente.");
        } finally {
            scanner.close();
        }

        System.out.println("El programa ha finalizado.");
    }
}
