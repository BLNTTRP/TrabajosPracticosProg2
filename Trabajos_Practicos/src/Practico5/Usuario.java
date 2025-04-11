package Practico5;

public class Usuario {
    private int id;
    private String nombre;
    private String email;

    // Constructor
    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    // Método para mostrar detalles del usuario
    public String mostrarDetalle() {
        return String.format("ID Usuario: %d%nNombre: %s%nEmail: %s%n", id, nombre, email);
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}
