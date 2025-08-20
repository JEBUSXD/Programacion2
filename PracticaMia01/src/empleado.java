public abstract class empleado {
    private int carnet;
    private String nombre;
    private String apellipo;
    private double fechaIngreso;
    private int sueldoMensual;
    private int promCumplimProyectos;
    private int numProyParticipa;
    public empleado(int carnet, String nombre, String apellipo, double fechaIngreso, int sueldoMensual, int promCumplimProyectos, int numProyParticipa) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellipo = apellipo;
        this.fechaIngreso = fechaIngreso;
        this.sueldoMensual = sueldoMensual;
        this.promCumplimProyectos = promCumplimProyectos;
        this.numProyParticipa = numProyParticipa;
    }
    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellipo(String apellipo) {
        this.apellipo = apellipo;
    }
    public void setFechaIngreso(double fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public void setSueldoMensual(int sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    public void setPromCumplimProyectos(int promCumplimProyectos) {
        this.promCumplimProyectos = promCumplimProyectos;
    }
    public void setNumProyParticipa(int numProyParticipa) {
        this.numProyParticipa = numProyParticipa;
    }
    public int getCarnet() {
        return carnet;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellipo() {
        return apellipo;
    }
    public double getFechaIngreso() {
        return fechaIngreso;
    }
    public int getSueldoMensual() {
        return sueldoMensual;
    }
    public int getPromCumplimProyectos() {
        return promCumplimProyectos;
    }
    public int getNumProyParticipa() {
        return numProyParticipa;
    }
    public abstract double calcularSueldomensual();
}