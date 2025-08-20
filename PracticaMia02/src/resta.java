public class resta implements operacionesMatematicas{
    private String nombre;
    private double resultado;
    @Override
    public void realizarOperaciones(double num1, double num2){
        this.nombre="resta";
        this.resultado=num1-num2;
    }
    @Override
    public String obtenerNombre(){
        return this.nombre;
    }
    @Override
    public double obtenerResultado(){
        return this.resultado;
    }
}