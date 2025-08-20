/**
* Reloj
*/
public class Reloj {
	int hora, minuto;
	boolean am;
	public Reloj(){
		hora = 12;
		minuto = 0;
		am=true;
	}
	public String toString(){
		return hora + ":" + minuto + " " + (am ? "AM" : "PM" );
	}
	/**
	 * pre: 0 <= minuto < 60
	 * pre: 0 <= hora < 12
	 */
	public void setHora(int hora, int minuto, boolean am){ 
		this.hora = hora;
		this.minuto = minuto;
		this.am = am;
	}
	public String getHora() {
		return this.toString();
	}
	public void avanzar(int min){
		minuto += min;
		if(minuto >= 60) {
			minuto -= 60;
			hora++;
			if(hora >= 12) {
				hora -= 12;
				am = !am;
			}
		}
		if(hora >= 12) {
			hora -= 12;
			am = !am;
		}
	}
	public boolean esAM(){
		return am;
	}
	public boolean masTemprano(Reloj r1, Reloj r2){	
		if(r1.hora == r2.hora) {
			return r1.minuto < r2.minuto;
		}
		return r1.hora < r2.hora;
		
	}

}
