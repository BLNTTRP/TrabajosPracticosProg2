package Practico3.GestionGallinas;

public class Gallina {
    // Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    // Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo!");
    }

    // Método para envejecer un año
    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " ha envejecido un año.");
    }

    // Método para mostrar el estado de la gallina
    public void mostrarEstado() {
        System.out.println("\nEstado de la gallina " + idGallina + ":");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
