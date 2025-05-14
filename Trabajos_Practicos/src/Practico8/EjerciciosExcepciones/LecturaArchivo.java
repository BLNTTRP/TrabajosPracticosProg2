package Practico8.EjerciciosExcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt"; // Nombre del archivo a leer
        Scanner scanner = null; // Inicializamos el Scanner a null

        try {
            File archivo = new File(nombreArchivo);
            scanner = new Scanner(archivo); // Intentamos abrir el archivo

            System.out.println("Contenido del archivo " + nombreArchivo + ":");
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error, el archivo '" + nombreArchivo + "' no se encontró.");
            System.out.println("Por favor, asegúrese de que el archivo exista en la ubicación correcta.");
        } finally {
            if (scanner != null) {
                scanner.close(); // Cerramos el Scanner si se abrió correctamente
            }
        }

        System.out.println("El programa ha finalizado.");
    }
}
