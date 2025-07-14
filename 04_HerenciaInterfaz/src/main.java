public class main {
    public static void main(String[] args) {
        C01HerenciaVehiculo o1=new C01HerenciaVehiculo("toyota", 4);
        System.out.println(o1);
        
        C02Auto o2=new C02Auto("suzuki", 4 ,"morado",500);
        System.out.println(o2);
        
        C03Camion o3=new C03Camion("volvo",2, 14,16);
        System.out.println(o3);
        
        C04Vagoneta o4=new C04Vagoneta("chevrolet",4,30);
        System.out.println(o4);
    }
}