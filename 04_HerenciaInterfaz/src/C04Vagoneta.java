public class C04Vagoneta extends C01HerenciaVehiculo{
    private int traccion;
    public C04Vagoneta(){
        super("",0);
        this.traccion=0;
    }
    public C04Vagoneta(String marca,int puertas,int traccion){
        super(marca , puertas);
        this.traccion=traccion;
    }
    public void setTraccion(int traccion) {
        this.traccion = traccion;
    }
    public int getTraccion() {
        return traccion;
    }
    @Override
    public String toString(){
        return "La marca es "+marcas+", cantidad de puertas "+npuertas+" la traccion "+ traccion ;
    }
}