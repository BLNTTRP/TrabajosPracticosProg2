package Practico6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear el inventario
        Inventario inventario = new Inventario();

        // Agregar 5 productos con diferentes categorías
        System.out.println("Agregando productos al inventario...");
        inventario.agregarProducto(new Producto("HP123", "Laptop HP", 1500.0, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("PAN001", "Pan Integral", 2.5, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("CAM456", "Camisa Algodón", 25.0, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("TV789", "Smart TV 4K", 2500.0, 5, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("SOF001", "Sofá 3 plazas", 1200.0, 8, CategoriaProducto.HOGAR));

        // Listar todos los productos
        System.out.println("\nInventario completo:");
        inventario.listarProductos();

        // Mostrar el total de stock disponible
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock() + " unidades");

        // Obtener el producto con mayor stock
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("\nProducto con mayor stock:");
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // Filtrar productos con precios entre $1000 y $3000
        System.out.println("\nProductos entre $1000 y $3000:");
        List<Producto> productosFiltrados = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : productosFiltrados) {
            p.mostrarInfo();
        }

        // Mostrar las categorías disponibles con sus descripciones
        inventario.mostrarCategoriasDisponibles();
    }
}
