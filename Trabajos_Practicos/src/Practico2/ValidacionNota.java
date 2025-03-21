package Practico2;

// Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un
// número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.

import java.util.Scanner;

public class ValidacionNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota = solicitarNota(scanner);

        System.out.println("✅ Nota guardada correctamente.");
    }

    public static int solicitarNota(Scanner scanner) {
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("⚠️ Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }
}
