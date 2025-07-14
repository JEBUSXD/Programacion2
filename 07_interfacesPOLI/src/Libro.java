public class Libro  extends Articulo implements Vendible{//#02
    public Libro(String titulo, double precio) {
        super(titulo,precio);
    }
    public String getTitulo() {//variable  
        return getNombre();//la pafrte del vendible 
    }
    public void setTitulo(String titulo) {
        setNombre(titulo);
    }
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