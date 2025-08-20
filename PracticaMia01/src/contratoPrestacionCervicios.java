public class contratoPrestacionCervicios extends empleado{
    public contratoPrestacionCervicios(int carnet, String nombre, String apellipo, double fechaIngreso, int sueldoMensual, int promCumplimProyectos, int numProyParticipa) {
        super(carnet, nombre, apellipo, fechaIngreso, sueldoMensual, promCumplimProyectos, numProyParticipa);
    }
    //#03 contrato presatacion de servicios
    @Override
    public double calcularSueldomensual(){
        double a = 0;
        if(getPromCumplimProyectos()>90){
            a=getSueldoMensual()*1.02;
        }
        return a;
    }
    @Override
    public String toString() {
        return "Carnet:"+getCarnet()+" Nombre:"+getNombre()+" Apelllido:"+getApellipo()+" Fecha de ingreso:"+getFechaIngreso()+" Sueldo mensual:"+getSueldoMensual()+" Promedio de cumplimiento de proyecto:"+getPromCumplimProyectos()+" Numero de proyectos en lo que participa:"+getNumProyParticipa();
    }
}