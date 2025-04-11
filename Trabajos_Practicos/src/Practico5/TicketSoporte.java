package Practico5;

import java.time.LocalDate;

public class TicketSoporte {
    private static int contadorTickets = 0; // Contador estático para cantidad de tickets creados
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario; // Relación con 'Usuario'
    private Tecnico tecnicoAsignado; // Relación con 'Tecnico'

    // Constructor con usuario
    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
        this.usuario = usuario;
        contadorTickets++;
    }

    // Constructor sin usuario
    public TicketSoporte(int id, String descripcion) {
        this(id, descripcion, null);
    }

    // Método para asignar un técnico al ticket
    public void asignarTecnico(Tecnico tecnico) {
        this.tecnicoAsignado = tecnico;
    }

    // Método para cerrar el ticket
    public void cerrarTicket() {
        this.estado = "Cerrado";
    }

    // Método toString para mostrar detalles del ticket
    @Override
    public String toString() {
        String usuarioInfo = (usuario != null) ? usuario.mostrarDetalle() : "Sin usuario asignado";
        String tecnicoInfo = (tecnicoAsignado != null) ? tecnicoAsignado.toString() : "\nTécnico no asignado";
        return String.format(
                "ID Ticket: %d%nDescripción: %s%nEstado: %s%nFecha de Creación: %s%n%s%s",
                id, descripcion, estado, fechaCreacion, usuarioInfo, tecnicoInfo);
    }

    // Método estático para obtener el número de tickets totales
    public static int getContadorTickets() {
        return contadorTickets;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }
}
