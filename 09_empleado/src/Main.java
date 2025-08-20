public class Main {
    public static void main(String[] args) {
        //empleado asalariado
        EmpleadoAsalariado E1 = new EmpleadoAsalariado(4500);
        System.out.println(E1.calcularSalario());
        
        //empleado horas
        EmpleadoPorHoras E2 = new EmpleadoPorHoras(80, 20);
        System.out.println(E2.calcularSalario());
    }
}