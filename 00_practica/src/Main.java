import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Libro o1 = new Libro("Principito", 20.0, 100);
        Electrodomesticos o2 = new Electrodomesticos("Lavadora", 300.0, 45);
        Ropa o3 = new Ropa("Camiseta", 15.0, 35.4);

        // Lista de productos
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(o1);
        productos.add(o2);
        productos.add(o3);

        // Calcular el precio total de la compra
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.calcularPrecio(); // se acumula
        }

        // Mostrar el precio total de la compra
        System.out.println("Precio total de la compra: $" + precioTotal);
    }
}