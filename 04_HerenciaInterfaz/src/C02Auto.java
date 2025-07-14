public class C02Auto extends C01HerenciaVehiculo{
    private String color;
    private int motor;
    public C02Auto(){
        super ("",0);
        String color="";
        int motor=0;
    }
    public C02Auto(String marca,int npuerta,String color,int motor){
        super(marca, npuerta);
        this.color=color;
        this.motor=motor;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getMotor() {
        return motor;
    }
    public void setMotor(int motor) {
        this.motor = motor;
    }
    @Override
    public String toString() {
        return "La marca es "+marcas+", cantidad de puertas "+npuertas+", el color es "+color+" y el poder del motor es de "+motor+" caballos de fuerza." ;
    }
}