package Practico8.EjerciciosExcepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoConResources {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo " + nombreArchivo + ":");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error de lectura del archivo '" + nombreArchivo + "'");
            System.err.println("Detalles del error: " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    }
}
