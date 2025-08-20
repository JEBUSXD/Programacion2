public class administrativo extends Persona{
    private String codigo, nivel;
    private int salario;
    public administrativo() {
        super("","","",0);
        this.codigo = "";
        this.nivel = "";
        this.salario = 0;
    }
    public administrativo(String nombre, String apellido, String direccion, int telefono,   String codi,String niv,int salario) {
        super(nombre,apellido,direccion,telefono);
        this.codigo = codi;
        this.nivel = niv;
        this.salario = salario;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNivel(String nivel) {
        this.nivel= nivel;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNivel() {
        return nivel;
    }
    public int getSalario() {
        return salario;
    }
    @Override
    public String toString(){
       return "Los datos introducidos son Nombre:"+nombre +" Apellido:"+apellido+" direccion:"+direccion +" telefono:"+telefono +" Codigo:"+codigo+" nivel:"+nivel+" salario:"+salario;
    }
}
