package Practico2;

// Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo
// debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar
// la suma total de los pares ingresados.

import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaPares = 0;
        int numero;

        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                sumaPares += numero;
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
