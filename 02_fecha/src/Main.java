public class Main {
    public static void main(String[] args) {
        CFecha o1=new CFecha();
        //FECHA 
        byte dia=23, mes=9;
        short aaa=2023;
        o1.SetFecha(dia, mes, aaa);
        o1.GetFecha();
        //HORA 
        byte HORA=9, MINUTOS=55, SEGUNDOS=23;
        o1.SetHoras(HORA, MINUTOS, SEGUNDOS);
        o1.GetHora();
    }
}