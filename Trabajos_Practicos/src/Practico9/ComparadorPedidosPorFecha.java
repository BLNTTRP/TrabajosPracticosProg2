package Practico9;

import java.util.Comparator;

public class ComparadorPedidosPorFecha implements Comparator<Pedido> {
    @Override
    public int compare(Pedido p1, Pedido p2) {
        // LocalDate ya implementa Comparable, así que podemos usar su método compareTo directamente.
        return p1.getFecha().compareTo(p2.getFecha());
    }
}
