package Practico2;

// Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según
// la siguiente tabla:
// - Menor de 12 años: "Niño"
// - Entre 12 y 17 años: "Adolescente"
// - Entre 18 y 59 años: "Adulto"
// - 60 años o más: "Adulto mayor"

import java.util.Scanner;

public class ClasificacionEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema!");
        int edad = pedirEdad(sc);
        etapaDeVida(edad);
    }

    public static int pedirEdad(Scanner sc) {
        System.out.print("Ingrese su edad: ");
        return sc.nextInt();
    }

    public static void etapaDeVida(int edad) {
        if (edad < 12) {
            System.out.println("Eres un niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un adulto.");
        } else if (edad >= 60) {
            System.out.println("Eres un adulto mayor.");
        }
    }
}
