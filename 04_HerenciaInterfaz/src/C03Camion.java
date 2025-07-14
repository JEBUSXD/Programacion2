public class C03Camion extends C01HerenciaVehiculo{
    private int capMaxima;
    private int nllantas;
    public C03Camion(){
        super("",0);
        this.capMaxima=0;
        this.nllantas=0;
    }
    public C03Camion(String marcas, int npuertas,int capMaxima, int nllantas) {
        super(marcas, npuertas);
        this.capMaxima = capMaxima;
        this.nllantas = nllantas;
    }
    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }
    public void setNllantas(int nllantas) {
        this.nllantas = nllantas;
    }
    public int getCapMaxima() {
        return capMaxima;
    }
    public int getNllantas() {
        return nllantas;
    }
    @Override
    public String toString(){
        return "La marca es "+marcas+", cantidad de puertas "+npuertas+", capasidad maxima "+capMaxima+"TOM, cantidad de llandas"+nllantas;
    } 
}