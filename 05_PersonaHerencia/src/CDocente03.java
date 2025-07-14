public class CDocente03 extends CPersona{
    private String profesion;
    private int codigo;
    public CDocente03(){
        super("","",0);
        this.profesion="";
        this.codigo=0;
    }
    public CDocente03(String nom,String ape, int car, String pro, int cod){
        super(nom,ape,car);
        this.profesion=pro;
        this.codigo=cod;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getProfesion() {
        return profesion;
    }
    public int getCodigo() {
        return codigo;
    }
    @Override
    public String toString(){
       return "Los datos del docente/ Nombre: "+nombre +" Apellido: "+apellido+" Carnet: "+carnet+" profesion: "+profesion+" codigo: "+codigo;
    }
}