public class estudiante extends Persona{
    private int registro,ppa;
    public estudiante() {
        super("","","",0);
        this.registro = 0;
        this.ppa = 0;
    }
    public estudiante(String nombre, String apellido, String direccion, int telefono    ,int registro, int ppa) {
        super(nombre,apellido,direccion,telefono);
        this.registro = registro;
        this.ppa = ppa;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public void setPpa(int ppa) {
        this.ppa = ppa;
    }
    public int getRegistro() {
        return registro;
    }
    public int getPpa() {
        return ppa;
    }
    @Override
    public String toString(){
       return "Los datos introducidos son Nombre:"+nombre +" Apellido:"+apellido+" direccion:"+direccion +" telefono:"+telefono +" Registro:"+registro+" ppa:"+ppa;
    }
}
