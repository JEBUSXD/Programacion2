package pkg06_polimorfismo;
public class Main {
    public static void main(String[] args) {
        //#01 rectangulo
        Rectangulo o1 = new Rectangulo(2, 2, "Rectangulo", 10, 5);
        double a=o1.calcularArea();
        double b=o1.calcularPerimetro();
        System.out.println(o1+", Area"+a+", Perimetro"+b);
        
        //#02 cuadrado
        Cuadrado o2=new Cuadrado(5, 7, "cuadrado", 6, 6);
        System.out.println(o2+", Area:"+o2.calcularArea()+", perimetro:"+o2.calcularPerimetro());
        
        //#03 circulo
        Circulo o3=new Circulo(20,34,"Circulo",30);
        System.out.println(o3+", Area:"+o3.calcularArea()+", perimetro:"+o3.calcularPerimetro());
        
        //#04 elipse
        Elipse o4=new Elipse(1, 3, "Elipse", 12, 15);
        System.out.println(o4+", Area:"+o4.calcularArea()+", perimetro:"+o4.calcularPerimetro());
    }
}