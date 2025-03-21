package Practico2;

// Crea un programa que:
//1. Declare e inicialice un array con los precios de algunos productos.
//2. Use una función recursiva para mostrar los precios originales.
//3. Modifique el precio de un producto específico.
//4. Use otra función recursiva para mostrar los valores modificados.

public class ListaPreciosRecursividad {

    public static void main(String[] args) {
        // Declarar e inicializar un array con los precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Mostrar los valores originales de los precios usando recursividad
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);

        // Modificar el precio de un producto específico
        int indiceModificar = 2;
        double nuevoPrecio = 129.99;
        precios[indiceModificar] = nuevoPrecio;

        // Mostrar los valores modificados usando recursividad
        System.out.println("Precios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }

    // Función recursiva para mostrar los precios
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        // si el índice es igual al tamaño del array, termina la recursión
        if (indice == precios.length) {
            return;
        }

        // Mostrar el precio actual
        System.out.println("Precio: $" + precios[indice]);

        // Llamada recursiva para mostrar el siguiente precio
        mostrarPreciosRecursivo(precios, indice + 1);
    }
}