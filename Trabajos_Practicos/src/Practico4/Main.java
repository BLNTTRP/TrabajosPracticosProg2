package Practico4;

public class Main {
    public static void main(String[] args) {
        // Crear empleados usando diferentes constructores
        Empleado emp1 = new Empleado(1, "Juan Pérez", "Desarrollador", 2500.0);
        Empleado emp2 = new Empleado("María García", "Diseñadora");
        Empleado emp3 = new Empleado(3, "Carlos López", "Gerente", 4000.0);
        Empleado emp4 = new Empleado("Ana Martínez", "Analista");

        // Actualizar salarios
        emp1.actualizarSalario(10.0); // Aumento porcentual (10%)
        emp2.actualizarSalario(500); // Aumento fijo ($500)
        emp3.actualizarSalario(15.0); // Aumento porcentual (15%)

        // Mostrar información de los empleados
        System.out.println("=== Información de Empleados ===");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        // Mostrar total de empleados
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
