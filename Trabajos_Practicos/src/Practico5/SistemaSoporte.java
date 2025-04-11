package Practico5;

import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets;

    // Constructor
    public SistemaSoporte() {
        this.tickets = new ArrayList<>();
    }

    // Método para agregar un nuevo ticket
    public TicketSoporte crearTicket(String descripcion, Usuario usuario) {
        TicketSoporte ticket = new TicketSoporte(TicketSoporte.getContadorTickets() + 1, descripcion, usuario);
        tickets.add(ticket);
        return ticket;
    }

    // Método para asignar un técnico a un ticket por ID
    public boolean asignarTecnicoATicket(int ticketId, Tecnico tecnico) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == ticketId) {
                ticket.asignarTecnico(tecnico);
                return true;
            }
        }
        return false;
    }

    // Método para listar tickets abiertos
    public List<TicketSoporte> listarTicketsAbiertos() {
        List<TicketSoporte> ticketsAbiertos = new ArrayList<>();
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado().equalsIgnoreCase("Abierto")) {
                ticketsAbiertos.add(ticket);
            }
        }
        return ticketsAbiertos;
    }

    // Método para listar tickets cerrados
    public List<TicketSoporte> listarTicketsCerrados() {
        List<TicketSoporte> ticketsCerrados = new ArrayList<>();
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado().equalsIgnoreCase("Cerrado")) {
                ticketsCerrados.add(ticket);
            }
        }
        return ticketsCerrados;
    }

    // Método toString para mostrar la lista de tickets
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Estado del Sistema de Soporte:\n");
        for (TicketSoporte ticket : tickets) {
            sb.append(ticket).append("\n");
        }
        return sb.toString();
    }
}
