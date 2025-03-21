package Practico3.GestionLibros;

import java.time.Year; // Para obtener el año actual

public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // Usamos el setter para validar el año
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Método setter para anioPublicacion con validación
    public void setAnioPublicacion(int nuevoAnio) {
        int anioActual = Year.now().getValue(); // Obtiene el año actual
        if (nuevoAnio >= 1900 && nuevoAnio <= anioActual) {
            this.anioPublicacion = nuevoAnio;
        } else {
            System.out.println("Error: El año de publicación debe estar entre 1900 y " + anioActual + ".");
        }
    }

    // Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println();
        System.out.println("Informacion del libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}
