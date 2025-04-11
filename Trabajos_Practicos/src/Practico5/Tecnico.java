package Practico5;

public class Tecnico {
    private int id;
    private String nombre;
    private String especialidad;

    // Constructor
    public Tecnico(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Método toString para mostrar la información del técnico
    @Override
    public String toString() {
        return String.format("ID Técnico: %d%nNombre: %s%nEspecialidad: %s%n", id, nombre, especialidad);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
