package Practico4;

public class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático para contar empleados
    private static int totalEmpleados = 0;

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor simplificado
    public Empleado(String nombre, String puesto) {
        this(totalEmpleados + 1, nombre, puesto, 1000.0); // Llama al constructor completo
    }

    // Métodos para actualizar salario
    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100);
    }

    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // Método para obtener el total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Sobrescritura de toString()
    @Override
    public String toString() {
        return String.format("Empleado [ID: %d, Nombre: %s, Puesto: %s, Salario: $%.2f]", id, nombre, puesto, salario);
    }
}
