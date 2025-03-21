package Practico3.GestionLibros;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Libro
        Libro miLibro = new Libro("Cien años de soledad.", "Gabriel Garcia Marquéz", 1967);

        // Mostrar la información inicial del libro
        miLibro.mostrarInfo();

        // Intentar modificar el año de publicación con un valor inválido
        System.out.println("\nIntentando cambiar el año de publicacion a 1800...");
        miLibro.setAnioPublicacion(1800);

        // Intentar modificar el año de publicación con un valor válido
        System.out.println("\nIntentando cambiar el año de publicacion a 2020...");
        miLibro.setAnioPublicacion(2020);

        // Mostrar la información actualizada del libro
        System.out.println("\nInformacion actualizada del libro:");
        miLibro.mostrarInfo();
    }
}
