package Practico7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la empresa
        Empresa miEmpresa = new Empresa();

        // Crear empleados con salario fijo
        EmpleadoSalarioFijo empleadoFijo1 = new EmpleadoSalarioFijo(
                "12345678",
                "Juan",
                "Pérez",
                LocalDate.of(2023, 1, 15),
                2500.0
        );

        EmpleadoSalarioFijo empleadoFijo2 = new EmpleadoSalarioFijo(
                "98765432",
                "María",
                "Gómez",
                LocalDate.of(2018, 5, 20),
                3000.0
        );

        // Crear empleados a comisión
        EmpleadoAComision empleadoComision1 = new EmpleadoAComision(
                "11223344",
                "Carlos",
                "López",
                LocalDate.of(2024, 3, 10),
                1000.0,
                50,
                20.0
        );

        EmpleadoAComision empleadoComision2 = new EmpleadoAComision(
                "55667788",
                "Ana",
                "Martínez",
                LocalDate.of(2020, 9, 1),
                1200.0,
                80,
                15.0
        );

        // Agregar empleados a la empresa
        miEmpresa.agregarEmpleado(empleadoFijo1);
        miEmpresa.agregarEmpleado(empleadoFijo2);
        miEmpresa.agregarEmpleado(empleadoComision1);
        miEmpresa.agregarEmpleado(empleadoComision2);

        // Mostrar los salarios de todos los empleados
        miEmpresa.mostrarSalarios();

        // Encontrar al empleado con más clientes
        EmpleadoAComision empleadoConMasClientes = miEmpresa.empleadoConMasClientes();

        if (empleadoConMasClientes != null) {
            System.out.println("\nEmpleado con más clientes captados: " +
                                empleadoConMasClientes.nombreCompleto() +
                                " (" + empleadoConMasClientes.getCantClientesCaptados() + " clientes)");
        } else {
            System.out.println("\nNo hay empleados a comisión en la empresa.");
        }
    }
}
