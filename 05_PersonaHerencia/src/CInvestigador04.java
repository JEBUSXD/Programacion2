public class CInvestigador04 extends CDocente03{
    private String area;
    private int horas;
    public CInvestigador04(){
        super("","",0,"",0);
        this.area="";
        this.horas=0;
    }
    public CInvestigador04(String nom,String ape, int car, String pro, int cod,String area,int horas){
        super(nom,ape,car,pro,cod);
        this.area=area;
        this.horas=horas;
    }
    //----
    @Override
    public String toString(){
       return "Los datos del investigador/ Nombre: "+nombre +" Apellido: "+apellido+" Carnet: "+carnet+" profesion: "+getProfesion()+" codigo: "+getCodigo()+" Area: "+area+" Horas: "+horas;
    }
}