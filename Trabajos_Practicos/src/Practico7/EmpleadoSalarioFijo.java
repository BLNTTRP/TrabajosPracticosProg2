package Practico7;

import java.time.LocalDate;

public class EmpleadoSalarioFijo extends Empleado {
    private final double PORC1 = 0.05;
    private final double PORC2 = 0.1;
    private final int ANIO1 = 2;
    private final int ANIO2 = 5;
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String DNI, String nombre, String apellido, LocalDate anioIngreso, double sueldoBasico) {
        super(DNI, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    @Override
    public double getSalario() {
        double salarioConAdicional = sueldoBasico + (sueldoBasico * porcAdicional());
        return salarioConAdicional;
    }

    private double porcAdicional() {
        int antiguedad = antiguedadEnAnios();
        if (antiguedad >= ANIO2) {
            return PORC2;
        } else if (antiguedad >= ANIO1) {
            return PORC1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Salario Fijo, Sueldo Básico: " + sueldoBasico +
                ", Porcentaje Adicional: " + (porcAdicional() * 100) + "%, Salario Total: " + getSalario();
    }
}
