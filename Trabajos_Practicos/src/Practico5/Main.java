package Practico5;

public class Main {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario(1, "Juan Pérez", "juan.perez@example.com");
        Usuario usuario2 = new Usuario(2, "Ana Gómez", "ana.gomez@example.com");

        // Crear técnicos
        Tecnico tecnico1 = new Tecnico(1, "Carlos García", "Redes");
        Tecnico tecnico2 = new Tecnico(2, "Laura Martínez", "Bases de Datos");

        // Crear el sistema de soporte
        SistemaSoporte sistema = new SistemaSoporte();

        // Crear tickets
        TicketSoporte ticket1 = sistema.crearTicket("Problema de conexión a internet.", usuario1);
        TicketSoporte ticket2 = sistema.crearTicket("Error en la base de datos.", usuario2);
        TicketSoporte ticket3 = sistema.crearTicket("Pantalla azul al iniciar.", null);

        // Asignar técnicos a los tickets
        sistema.asignarTecnicoATicket(ticket1.getId(), tecnico1);
        sistema.asignarTecnicoATicket(ticket2.getId(), tecnico2);

        // Cerrar el primer ticket
        ticket1.cerrarTicket();

        // Mostrar estado general del sistema
        System.out.println(sistema);

        // Listar tickets abiertos
        System.out.println("Tickets Abiertos:");
        for (TicketSoporte abierto : sistema.listarTicketsAbiertos()) {
            System.out.println(abierto);
        }

        // Listar tickets cerrados
        System.out.println("\nTickets Cerrados:");
        for (TicketSoporte cerrado : sistema.listarTicketsCerrados()) {
            System.out.println(cerrado);
        }
    }
}
