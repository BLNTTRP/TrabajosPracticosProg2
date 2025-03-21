package Practico2;

// Crea un programa que:
//1. Declare e inicialice un array con los precios de algunos productos.
//2. Muestre los valores originales de los precios.
//3. Modifique el precio de un producto específico.
//4. Muestre los valores modificados.

public class ListaPrecios {

    public static void main(String[] args) {
        // Declarar e inicializar un array con los precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Mostrar los valores originales de los precios
        System.out.println("Precios originales:");
        mostrarPrecios(precios);

        // Modificar el precio de un producto específico
        int indiceModificar = 2;
        double nuevoPrecio = 129.99;
        precios[indiceModificar] = nuevoPrecio;

        // Mostrar los valores modificados
        System.out.println("Precios modificados:");
        mostrarPrecios(precios);
    }

    // Método para mostrar los precios
    public static void mostrarPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}