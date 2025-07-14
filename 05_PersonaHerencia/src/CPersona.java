public class CPersona {
   protected String nombre, apellido;
   protected int carnet;
   public CPersona(){//constructor sin parametros o inicializado
       this.apellido="";
       this.nombre="";
       this.carnet=0;
   }
   public CPersona(String nom,String ape,int car){//constructor con parametros 
       this.nombre=nom;
       this.apellido=ape;
       this.carnet=car;
   }
   //----
   @Override
   public String toString(){
       return "Los datos introducidos son Nombre:"+nombre +" Apellido:"+apellido+" Carnet:"+carnet;
   }
}