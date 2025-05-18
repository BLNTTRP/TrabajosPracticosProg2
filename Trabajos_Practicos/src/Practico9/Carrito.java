package Practico9;

import java.util.ArrayList;
import java.util.List;

public class Carrito<T extends Producto<?>> {
    private List<T> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        if (producto != null) {
            this.productos.add(producto);
            System.out.println("'" + producto.getNombre() + "' agregado al carrito.");
        } else {
            System.out.println("No se puede agregar un producto nulo al carrito.");
        }
    }

    // La eliminación se basa en la igualdad de objetos (método equals()).
    public boolean eliminarProducto(T producto) {
        if (producto != null) {
            boolean eliminado = this.productos.remove(producto);
            if (eliminado) {
                System.out.println("'" + producto.getNombre() + "' eliminado del carrito.");
            } else {
                System.out.println("'" + producto.getNombre() + "' no se encontró en el carrito para eliminar.");
            }
            return eliminado;
        }
        System.out.println("No se puede eliminar un producto nulo del carrito.");
        return false;
    }

    public double obtenerTotal() {
        double total = 0.0;
        for (T producto : this.productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        if (this.productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }
        System.out.println("\n----- Contenido del Carrito -----");
        for (T producto : this.productos) {
            System.out.println(producto.toString());
        }
        System.out.println("-------------------------------");
    }

    public List<T> getProductos() {
        return new ArrayList<>(this.productos); // Devuelve una copia para proteger la lista interna
    }
}
