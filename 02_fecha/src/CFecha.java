public class CFecha {
    //fechas
    private byte DD, MM;
    private short AA;
    //Horas
    private byte HH, MI, SS;
    public CFecha(){
        this.DD=1;
        this.MM=1;
        this.AA=1900;
        //Hora
        this.HH=0;
        this.MI=0;
        this.SS=0;
    }
    public void SetFecha(byte dd, byte mm, short aa){
        DD=dd;
        MM=mm;
        AA=aa;
    }
    public void GetFecha(){
        System.out.println("Este codigo fue creado el dia "+DD+" del mes de "+MM+ " y del año "+AA);
    }
    //Hora
    public void SetHoras(byte hh, byte mi, byte ss){
        HH=hh;
        MI=mi;
        SS=ss;
    }
    public void GetHora(){
        System.out.println("A las horas "+HH+" y los minutos "+MI+" y los segundos "+SS);
    }
}