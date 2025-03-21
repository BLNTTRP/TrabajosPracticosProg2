package Practico3.RegistroMascotas;

public class Mascota {
    // Atributos
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Mostrar la información de la mascota
    public void mostrarInfo() {
        System.out.println();
        System.out.println("Informacion de la mascota:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Incrementar la edad en 1 año
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido 1 año más. Ahora tiene " + edad + " años!");
    }
}
