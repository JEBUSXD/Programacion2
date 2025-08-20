public class main {
    public static void main(String[] args) {
        Reloj r = new Reloj();
	r.setHora(12, 30, true);
	System.out.println(r.getHora());
	Reloj24 r2 = new Reloj24();
	r2.setHora(14, 30);
	System.out.println(r2.getHora());
    }	
}