package pkg06_polimorfismo;
public class Cuadrado extends Rectangulo{
    public Cuadrado(int x,int y,String nombre, int base,int altura){//recalcar que altura no es necesario
        super(x,y,nombre,base,base);
    }
    @Override
    public double calcularArea(){
        return getBase()*getBase();
    }
    @Override
    public double calcularPerimetro(){
        return getBase()*4;
    }
    @Override
    public String toString(){
        return "El cuadrado esta situado en el punto X="+getX()+", Y="+getY()+", nombre:"+getNombre();
    }
    //volumen 4/3 pi r^3 triagulo base por altura
    /*solo poner un metodo para calcular area*/
}