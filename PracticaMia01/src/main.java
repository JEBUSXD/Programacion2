public class main {
    public static void main(String[] args) {
        //contrato fijo
        ContratoFijo o1 =new ContratoFijo(9838017,"juan","cordero",2015,1300,92,98);
        System.out.println(o1);
        System.out.println(" El aumento de sueldo sera de un 10%="+o1.calcularSueldomensual());
        
        //contrato indefinido
        ContratoFijo o2 =new ContratoFijo(5463245,"Julio","cesar",2003,7000,95,99);
        System.out.println(o2);
        System.out.println(" El aumento de sueldo sera de un 8%="+o2.calcularSueldomensual());

        //contrato por presentacion de servicios
        ContratoFijo o3 =new ContratoFijo(74325,"Carlos","flores",2011,5000,92,98);
        System.out.println(o3);
        System.out.println(" El aumento de sueldo sera de un 2%="+o3.calcularSueldomensual());
    }
}