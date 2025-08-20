public class figurasGeometricas {
    private double a;
    private double b;
    private double c;
    public figurasGeometricas(double a) {
        this.a = a;
    }
    public figurasGeometricas(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public figurasGeometricas(double a, double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    
    public double cuadrado(){
        return a*a;
    }
    public double rectangulo(){
        return a*b;
    }
    public double trianguloRectangulo(){
        return (a*b)/2;
    }
    public double circulo(){
        return Math.PI*(a*a);
    }
    public double elipse(){
        return Math.PI*a*b;
    }
    public double circuloHueco(){
        return Math.PI*((a*a)-(b*b));
    }
    public double trapecio(){
        return ((a*b)/2)*c;
    }
    public double cubo(){
        return a*a*6;
    }
    public double rectanguloTri(){
        return 2*((a*b)+(a*c)+(c*b));
    }
    public double esfera(){
        return 4*Math.PI*a;
    }
    public double cilindro(){
        return 2*Math.PI*((a*a)-(b*b))+2*Math.PI*c*(a+b);
    }
}