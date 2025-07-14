public class main {
    public static void main(String[] args) {
        CPersona o1=new CPersona("Juan","Cordero", 9838017);
        System.out.println(o1);
        
        CEstudiante02 o2=new CEstudiante02("Juan","Cordero", 9838017,222103477, "INFORMATICA");
        System.out.println(o2);
        
        CDocente03 o3=new CDocente03("Julio","Cesar", 9838017,"INGcalculo", 4515);
        System.out.println(o3);
        
        CInvestigador04 o4=new CInvestigador04("Jorge","Osinaga", 9838017,"ADM", 4515256,"Ciencias",98);
        System.out.println(o4);
    }
}