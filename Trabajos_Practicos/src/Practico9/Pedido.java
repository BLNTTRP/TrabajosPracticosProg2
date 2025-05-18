package Practico9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Comparable<Pedido>, Identificable<Integer> {
    private int id;
    private List<Producto<?>> productos;
    private LocalDate fecha;

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto<?> producto) {
        if (producto != null) {
            this.productos.add(producto);
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto<?> producto : this.productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        return this.id == id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public List<Producto<?>> getProductos() {
        return new ArrayList<>(productos); // Devuelve una copia
    }

    @Override
    public int compareTo(Pedido otro) {
        // Compara basado en el total del pedido
        return Double.compare(this.calcularTotal(), otro.calcularTotal());
    }

    @Override
    public String toString() {
        return "Pedido { " +
                "id=" + id +
                ", fecha=" + fecha.format(DATE_FORMATTER) +
                ", númeroDeProductos=" + productos.size() +
                ", total=$" + String.format("%.2f", calcularTotal()) +
                " }";
    }
}
