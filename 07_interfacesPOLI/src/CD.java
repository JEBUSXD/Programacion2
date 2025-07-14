public class CD extends Articulo implements Vendible{//#03
    public CD(String nombre, double precio) {
        super (nombre,precio);        
    }
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }
    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio);
    }
    @Override
    public double calcularPrecio(){
        return getPrecio();
    }
    @Override
    public String getNombre(){
        return super.getNombre();
    }
}