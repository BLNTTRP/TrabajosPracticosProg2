package Practico3.RegistroMascotas;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Mascota
        Mascota miMascota = new Mascota("Max", "Perro", 3);

        // Mostrar la información inicial de la mascota
        miMascota.mostrarInfo();

        // Incrementar la edad de la mascota
        miMascota.cumplirAnios();

        // Mostrar la información actualizada de la mascota
        miMascota.mostrarInfo();
    }
}
