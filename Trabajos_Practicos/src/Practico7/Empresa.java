package Practico7;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public void mostrarSalarios() {
        System.out.println("--- Salarios de los Empleados ---");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.nombreCompleto() + ": $" + empleado.getSalario());
        }
        System.out.println("-------------------------------");
    }

    public EmpleadoAComision empleadoConMasClientes() {
        EmpleadoAComision empleadoMaxClientes = null;
        int maxClientes = -1;

        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoAComision) {
                EmpleadoAComision empleadoComision = (EmpleadoAComision) empleado;
                if (empleadoComision.getCantClientesCaptados() > maxClientes) {
                    maxClientes = empleadoComision.getCantClientesCaptados();
                    empleadoMaxClientes = empleadoComision;
                }
            }
        }
        return empleadoMaxClientes;
    }
}
