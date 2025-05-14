package Practico8;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Pendiente"; // Estado inicial del pedido
        cliente.notificar("Tu pedido ha sido creado. Estado actual: " + this.estado);
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        if (!this.estado.equals(nuevoEstado)) {
            String mensaje = "El estado de tu pedido ha cambiado de '" + this.estado + "' a '" + nuevoEstado + "'";
            this.estado = nuevoEstado;
            cliente.notificar(mensaje);
        } else {
            System.out.println("El pedido ya se encuentra en el estado: " + nuevoEstado);
        }
    }
}
