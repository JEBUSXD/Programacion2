public class RelojCucu {
// Clase base Reloj
public class Reloj {
    public class Reloj24  extends Reloj{
	public Reloj24(){
		super();
	}
	public void setHora(int hora, int minuto){
		if(hora > 12){
			super.setHora(hora-12, minuto, false);
		}else{
			super.setHora(hora, minuto, true);
		}
	}
	@Override
	public String getHora() {
		int hora=0;
		if(am){
			hora = super.hora;
		}else{
			hora = super.hora + 12;
		}
		return hora+":"+super.minuto;
	}
}

    /*private int hora;
    private int minutos;
    private boolean am;
    
    public Reloj() {
        hora = 12;
        minutos = 0;
        am = true;
    }
    public void setHora(int hora, int minuto, boolean am) {
        // Implementa la lógica para establecer la hora
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
// Clase derivada RelojCucu
public class RelojCucu extends Reloj {
    public boolean estaCantando() {
        // Implementa la lógica para verificar si está cantando
        return getMinutos() == 0;
    }
}
// Clase derivada Reloj24
public class Reloj24 extends Reloj {
    @Override
    public int getHora() {
        // Implementa la lógica para obtener la hora en formato de 24 horas
        if (!am && getHora() != 12) {
            return getHora() + 12;
        }
        return getHora();
    }*/
}
}