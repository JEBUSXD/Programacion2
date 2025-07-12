public class Libro extends Producto {
    private int numeroPaginas;
    public Libro(String nombre, double precio, int numeroPaginas) {
        super(nombre, precio);
        this.numeroPaginas = numeroPaginas;
    }
    @Override
    public double calcularPrecio() {
        return getPrecio() + (5 * numeroPaginas);
    }
    @Override
    public String toString() {
        return "Libro: " + getNombre();
    }
}