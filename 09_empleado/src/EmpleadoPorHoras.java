public class EmpleadoPorHoras implements Empleado{
    private double salarioPorHora;
    private int horasTrabajadas;
    public EmpleadoPorHoras(double salarioxH, int cantHoras){
        salarioPorHora=salarioxH;
        horasTrabajadas = cantHoras;
    }
    @Override
    public double calcularSalario(){
        return salarioPorHora * horasTrabajadas;
    }
}