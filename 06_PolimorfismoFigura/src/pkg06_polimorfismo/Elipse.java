package pkg06_polimorfismo;
public class Elipse extends Circulo{
    private int radio2;
    public Elipse (int x, int y,String nombre, int radio, int radio2){
        super(x,y,nombre,radio);
        this.radio2=radio2;
    }
    @Override
    public double calcularArea(){
        return Math.PI*(getRadio()*radio2);
    }
    @Override
    public double calcularPerimetro(){
        return Math.PI*(getRadio()+radio2);
    }
    @Override
    public String toString(){
        return "El circulo esta situado en el punto X="+getX()+", Y="+getY()+", nombre:"+getNombre()+", Radio eliptica:"+radio2;
    }
}