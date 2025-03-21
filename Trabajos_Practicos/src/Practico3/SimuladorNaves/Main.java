package Practico3.SimuladorNaves;

public class Main {
    public static void main(String[] args) {
        // Crear una nave espacial con nombre y combustible inicial
        NaveEspacial nave1 = new NaveEspacial("Apollo 11", 50);

        // Mostrar el estado inicial de la nave
        System.out.println("\n--- Estado inicial de la nave ---");
        nave1.mostrarEstado();

        // Intentar avanzar 60 unidades sin recargar
        System.out.println("\n--- Intentando avanzar 60 unidades sin recargar ---");
        nave1.avanzar(60);

        // Recargar 40 unidades de combustible
        System.out.println("\n--- Recargando combustible ---");
        nave1.recargarCombustible(40);

        // Intentar avanzar 60 unidades nuevamente
        System.out.println("\n--- Intentando avanzar 60 unidades después de recargar ---");
        nave1.avanzar(60);

        // Mostrar el estado final de la nave
        System.out.println("\n--- Estado final de la nave ---");
        nave1.mostrarEstado();
    }
}
