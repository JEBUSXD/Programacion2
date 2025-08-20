public class Main {
    public static void main(String[] args) {
        Persona p1=new Persona("JUAN","CORDERO","Calle pando",72630302);
        System.out.println(p1);
        
        estudiante e1=new estudiante("jose","pozo","Calle tarija",726347,222103477,68);
        System.out.println(e1);
        
        administrativo a1=new administrativo("pedro","Cabrera","Calle sucre",7263452,"java","junior",0);
        System.out.println(a1);
    }
}