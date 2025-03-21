package Practico3.RegistroEstudiantes;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "Matemáticas", 7.5);

        // Mostrar la información del estudiante
        estudiante1.mostrarInfo();

        // Aumentar la calificación
        estudiante1.subirCalificacion(2.0); // Aumenta en 2 puntos
        estudiante1.mostrarInfo();

        // Disminuir la calificación
        estudiante1.bajarCalificacion(1.5); // Disminuye en 1.5 puntos
        estudiante1.mostrarInfo();
    }
}
