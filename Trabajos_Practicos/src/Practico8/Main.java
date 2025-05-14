package Practico8;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Camiseta", 25.99);
        Producto producto2 = new Producto("Pantalón", 49.50);
        Producto producto3 = new Producto("Zapatos", 79.95);

        // Crear un cliente
        Cliente cliente1 = new Cliente("Ana Pérez", "ana.perez@ejemplo.com");

        // Crear un pedido
        Pedido miPedido = new Pedido();

        // Crear un pedido para el cliente
        Pedido pedido1 = new Pedido(cliente1);

        // Agregar productos al pedido
        miPedido.agregarProducto(producto1);
        miPedido.agregarProducto(producto2);
        miPedido.agregarProducto(producto3);

        // Calcular el total del pedido
        double totalPedido = miPedido.calcularTotal();

        // Imprimir el total del pedido
        System.out.println("\nEl total del pedido es: $" + totalPedido);

        // Crear objetos de tipo TarjetaCredito y PayPal
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        PayPal paypal = new PayPal("usuario@ejemplo.com");

        double montoAPagarTarjeta = 100.0;
        double montoAPagarPaypal = 75.50;
        double porcentajeDescuento = 10.0;

        System.out.println("\n--- Pago con Tarjeta de Crédito ---");
        tarjeta.setMonto(montoAPagarTarjeta); // Establecer el monto antes del descuento
        double montoConDescuentoTarjeta = tarjeta.aplicarDescuento(porcentajeDescuento);
        tarjeta.procesarPago(montoConDescuentoTarjeta);

        System.out.println("\n--- Pago con PayPal ---");
        paypal.setMonto(montoAPagarPaypal);
        double montoConDescuentoPaypal = paypal.aplicarDescuento(porcentajeDescuento);
        paypal.procesarPago(montoConDescuentoPaypal);

        // Cambiar el estado del pedido varias veces
        pedido1.cambiarEstado("Enviado");
        pedido1.cambiarEstado("En tránsito");
        pedido1.cambiarEstado("Entregado");
        pedido1.cambiarEstado("Entregado"); // Intentar cambiar al mismo estado
    }
}
