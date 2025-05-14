package Practico8.EjerciciosExcepciones;

import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        boolean edadValida = false;

        while (!edadValida) {
            System.out.println("Ingrese su edad:");
            try {
                edad = scanner.nextInt();
                validarEdad(edad); // Llamamos al método para validar la edad
                edadValida = true; // Si no se lanza la excepción, la edad es válida
                System.out.println("Edad ingresada: " + edad);
            } catch (EdadInvalidaException e) {
                System.out.println("Error, edad inválida: " + e.getMessage());
                System.out.println("Por favor, ingrese una edad entre 0 y 120.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error, la entrada no es un número entero válido.");
                System.out.println("Por favor, intente de nuevo.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        scanner.close();
        System.out.println("Programa finalizado.");
    }

    // Método para validar la edad y lanzar la excepción si es necesario
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
        }
    }
}
