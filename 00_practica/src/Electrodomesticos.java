public class Electrodomesticos extends Producto{//#02
    private int tipo;
    public Electrodomesticos( String nombre, double precio,int tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }
    @Override
    public double calcularPrecio() {
        return getPrecio()*tipo;
    }
}