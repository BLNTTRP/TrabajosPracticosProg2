package Practico7;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
    private String DNI;
    private String nombre;
    private String apellido;
    private LocalDate anioIngreso;

    public Empleado(String DNI, String nombre, String apellido, LocalDate anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getAnioIngreso() {
        return anioIngreso;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public int antiguedadEnAnios() {
        LocalDate ahora = LocalDate.now();
        return Period.between(anioIngreso, ahora).getYears();
    }

    // Método abstracto que las subclases implementarán para calcular el salario
    public abstract double getSalario();

    @Override
    public String toString() {
        return "DNI: " + DNI + ", Nombre: " + nombreCompleto() + ", Año de Ingreso: " + anioIngreso;
    }
}
