public class Persona {
    protected String nombre, apellido,direccion;
    protected int  telefono;
    public Persona() {
        this.nombre ="";
        this.apellido ="";
        this.direccion = "";
        this.telefono = 0;
    }
    public Persona(String nombre, String apellido, String direcion, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direcion;
        this.telefono = telefono;
    }
    @Override
   public String toString(){
       return "Los datos introducidos son Nombre:"+nombre +" Apellido:"+apellido+" direccion:"+direccion +" telefono:"+telefono;
   }
}