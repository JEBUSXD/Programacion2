public class C01HerenciaVehiculo {//esto es una jerarquia de clases o herencia
    //creamos las variables
    protected String marcas;// un atributo protegido se puede acceder desde las clases
    protected int npuertas;//derivadas y desde otras clases dentro del mismo paquete
    //inicializamos las variables 
    public C01HerenciaVehiculo(){
        this.marcas="";
        this.npuertas=0;
    }
    //creamos el constructor (este esta conectado directamente con el main)
    public C01HerenciaVehiculo(String a,int b){
        this.marcas=a;
        this.npuertas=b;
    }
    @Override//El toString es para retornar solo texto y funsiona junto al (override)
    public String toString() {
        return "La marca es "+marcas+" cantidad de puertas "+npuertas;
    }
}