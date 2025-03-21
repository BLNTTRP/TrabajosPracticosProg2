package Practico3.GestionGallinas;

public class Main {
    public static void main(String[] args) {
        // Crear dos gallinas con identificadores únicos
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 3);

        // Hacer que cada gallina ponga al menos un huevo
        System.out.println("\nAcciones de poner huevos:");
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();

        // Hacer que cada gallina envejezca un año
        System.out.println("\nAcciones de envejecer:");
        gallina1.envejecer();
        gallina2.envejecer();

        // Mostrar el estado de cada gallina
        System.out.println("\nEstado final de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
