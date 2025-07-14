//POLIMORFISMO #01
package pkg06_polimorfismo;//conbertimos la clase a abstracto
public abstract class Figuras {//variable a usar, x, y, nombre
    private int x;//creamos las variables 
    private int y;
    private String nombre;//hacemos lo mismo que en herencia
    //creamos al construtor sin parametros (inicializamos las variables )
    public Figuras(){
        this.x = 0;
        this.y = 0;
        this.nombre = "";
    }
    //creamos al construtor con parametros (que pueda  recivir datos de afuera)
    public Figuras(int x,int y, String nom){
        this.x = x;
        this.y = y;
        this.nombre = nom;
    }
    //weas a usar
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public String getNombre() {
        return nombre;
    }// parte importante de la clase abstracta 
    //estas son las importantes (implementar primero estas clases para que no te de error en los otros archivos)
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}