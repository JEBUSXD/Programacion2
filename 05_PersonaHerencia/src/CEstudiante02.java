public class CEstudiante02 extends CPersona{
    private int registro;
    private String carrera;
    public CEstudiante02(){
        super("","",0);
        this.registro=0;
        this.carrera="";
    }
    public CEstudiante02(String nom,String ape,int car,  int reg,String carre ){
        super(nom,ape,car);
        this.registro=reg;
        this.carrera=carre;
    }
    //-------
    @Override
   public String toString(){
       return "Datos del estudiante/ Nombre: "+nombre +" Apellido: "+apellido+" Carnet: "+carnet+" registro: "+registro+" carrera: "+carrera;
   }
}