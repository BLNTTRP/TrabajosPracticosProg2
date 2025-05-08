package Practico7;

import java.time.LocalDate;

public class EmpleadoAComision extends Empleado {
    private double salarioMinimo;
    private int cantClientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(String DNI, String nombre, String apellido, LocalDate anioIngreso,
                             double salarioMinimo, int cantClientesCaptados, double montoPorCliente) {
        super(DNI, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantClientesCaptados = cantClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public int getCantClientesCaptados() {
        return cantClientesCaptados;
    }

    public double getMontoPorCliente() {
        return montoPorCliente;
    }

    @Override
    public double getSalario() {
        double salarioPorComision = cantClientesCaptados * montoPorCliente;
        return Math.max(salarioPorComision, salarioMinimo);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: A Comisión, Salario Minimo: " + salarioMinimo +
                ", Clientes Captados: " + cantClientesCaptados + ", Monto por Cliente: " + montoPorCliente +
                ", Salario Total: " + getSalario();
    }
}
