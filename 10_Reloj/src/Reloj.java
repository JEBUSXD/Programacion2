public class Reloj {//9:48 am
    private int hora;
    private int minutos;
    private boolean am;
    //constructor sin parametro 
    public Reloj(){
        this.hora=12;
        this.minutos=00;
        this.am=true;
    }
    //constructor con parametro
    public Reloj(int hora, int minuto, boolean am) {
        this.hora = hora;
        this.minutos = minuto;
        this.am=am;
    }
    
    
    public void avanzar(int minutos) {
        // Implementa la lógica para avanzar la hora
    }
    public int getHora() {
        // Implementa la lógica para obtener la hora actual
        return hora;
    }
    public int getMinutos() {
        // Implementa la lógica para obtener los minutos actuales
        return minutos;
    }
    public boolean esManiana() {
        // Implementa la lógica para verificar si es mañana
        return am;
    }
    public static boolean masTemprano(Reloj c1, Reloj c2) {
        // Implementa la lógica para comparar las horas de dos relojes
        return false;
    }
}