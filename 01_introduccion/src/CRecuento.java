public class CRecuento {
    private String Ape, nom;
    private byte AA;
    public CRecuento(){
        Ape ="";
        nom ="";
        AA = 0;
    }
    public void SetDatos(String ap, String no, byte aa){
        Ape =ap;
        nom =no;
        AA = aa;
    }
    public void GetDatos(){
        System.out.println("Hola, mucho guto!"+nom+" "+Ape+" , y mi edad es "+AA);
    }
}