package Practico8;

public class PayPal implements PagoConDescuento {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con PayPal asociado al email " + email);
        System.out.println();
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        // Calcula el monto del descuento
        double descuento = (porcentaje / 100) * monto;
        // Aplica el descuento al monto original
        monto -= descuento;
        System.out.println("Se aplicó un descuento del " + porcentaje + "%. Monto después del descuento: $" + monto);
        return monto;
    }

    // Variable local para almacenar el monto actual para el descuento
    private double monto;

    // Setter para el monto antes de aplicar el descuento
    public void setMonto(double monto) {
        this.monto = monto;
    }
}
