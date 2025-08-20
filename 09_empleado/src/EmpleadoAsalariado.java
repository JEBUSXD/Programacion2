public class EmpleadoAsalariado implements Empleado{
    private double salarioMensual;
    public EmpleadoAsalariado(double salario){
        salarioMensual = salario;
    }
    @Override
    public double calcularSalario(){
        return salarioMensual;
    }
}