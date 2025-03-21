package Practico3.SimuladorNaves;

public class NaveEspacial {
    // Atributos
    private String nombre;
    private int combustible;

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    // Método para despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println();
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no puede despegar. Combustible insuficiente.");
        }
    }

    // Método para avanzar
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no puede avanzar " + distancia + " unidades. Combustible insuficiente.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= 100) {
            combustible += cantidad;
            System.out.println(nombre + " ha recargado " + cantidad + " unidades de combustible. Combustible actual: " + combustible);
        } else {
            System.out.println(nombre + " no puede recargar " + cantidad + " unidades. Límite de combustible excedido.");
        }
    }

    // Método para mostrar el estado de la nave
    public void mostrarEstado() {
        System.out.println("Estado de la nave " + nombre + ":");
        System.out.println("Combustible actual: " + combustible);
    }
}
