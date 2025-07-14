//#2 CLASE heredada de FIGURAS
package pkg06_polimorfismo;
public class Rectangulo extends Figuras{
    private int base, altura;
    public Rectangulo(){
        super(0,0,"");
        this.base=0;
        this.altura=0;
    }
    public Rectangulo(int x, int y, String nom, int base, int altura){
        super(x,y,nom);
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double calcularPerimetro(){
        return 2*(base+altura);
    }    
    @Override
    public double calcularArea(){
        return base*altura;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public int getAltura() {
        return altura;
    }
    @Override
    public String toString (){
        return "El rectangulo esta situado en el punto X="+getX()+", Y="+getY()+", nombre:"+getNombre();
    }
}