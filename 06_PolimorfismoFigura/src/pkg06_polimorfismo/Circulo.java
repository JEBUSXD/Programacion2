package pkg06_polimorfismo;
public class Circulo extends Figuras{
    private int radio;
    public Circulo(int x, int y,String nombre , int radio) {
        super(x,y,nombre);
        this.radio = radio;
    }    
    @Override
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    @Override
    public String toString() {
        return "El circulo esta situado en el punto X="+getX()+", Y="+getY()+", nombre:"+getNombre()+", Radio"+radio;
    }
}