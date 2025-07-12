public class Ropa extends Producto{//#03
    public double talla;

    public Ropa(String nombre, double precio, double talla) {
        super(nombre, precio);
        this.talla = talla;
    }

    @Override
    public double calcularPrecio() {
        return getPrecio() +talla;
    }
}