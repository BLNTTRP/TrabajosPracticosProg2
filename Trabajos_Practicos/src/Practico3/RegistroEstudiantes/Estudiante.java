package Practico3.RegistroEstudiantes;

public class Estudiante {
    // Atributos
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Método para mostrar la informacion del estudiante
    public void mostrarInfo() {
        System.out.println();
        System.out.println("Informacion del estudiante:");
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }

    // Método para subir la calificación
    public void subirCalificacion(double puntos) {
        if (calificacion + puntos <= 10) {
            calificacion += puntos;
            System.out.println();
            System.out.println("Calificación aumentada a: " + calificacion);
        } else {
            calificacion = 10;
            System.out.println("La calificacion no puede superar 10. Se ha establecido a 10.");
        }
    }

    // Método para bajar la calificación
    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos >= 0) {
            calificacion -= puntos;
            System.out.println();
            System.out.println("Calificacion disminuida a: " + calificacion);
        } else {
            calificacion = 0;
            System.out.println("La calificación no puede ser menor que 0. Se ha establecido a 0.");
        }
    }
}
