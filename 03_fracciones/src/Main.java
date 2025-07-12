public class Main {
    public static void main(String[] args) {
        CFraccion F = new CFraccion(-68,-400);
        CFraccion F1 = new CFraccion(-4,100);
        CFraccion F2 = new CFraccion(100,-1000);
        
        System.out.println("Fraccion simplificada(F)"+F);
        System.out.println("Segunda fraccion (F1)"+F1);
        System.out.println("Tercera fraccion(f2)"+F2);
        System.out.println("La Fraccion F es: "+F.getNum()+"/"+F.getDen());
    }
}