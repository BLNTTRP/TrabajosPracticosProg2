package Practico8.EjerciciosExcepciones;

import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entradaUsuario;
        int numeroEntero;

        System.out.println("Ingrese una cadena de texto que represente un número entero:");
        entradaUsuario = scanner.nextLine();

        try {
            numeroEntero = Integer.parseInt(entradaUsuario);
            System.out.println("La cadena ingresada convertida a entero es: " + numeroEntero);
        } catch (NumberFormatException e) {
            System.out.println("Error, la cadena ingresada no es un formato válido para un número entero. Por favor, intente de nuevo ingresando solo números.");
        } finally {
            scanner.close();
        }

        System.out.println("El programa ha finalizado.");
    }
}
