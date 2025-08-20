public class fracciones extends calcular{
    private double c;
    private double d;

    public fracciones( int a, int b, double c, double d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }
    
    public double sumaFraccion(){
        double S=((a*d)+(d*c))/(d*b);
        return S;
    }
    public double restaFraccion(){
        double R=((a*d)-(d*c))/(d*b);
        return R;
    }
    public double multiplicacionFraccion(){
        double M=(a*c)/(b*d);
        return M;
    }
    public double divicionFraccion(){
        double D=(a*d)/(b*c);
        return D;
    }
    public double cocienteFracciones(){//a^b=q    c^d=r  
        int i =1;
        double cociente=0,p=a ,P=1;
        while(i<b){
            p =p*a;
            P =p;
            i++;
        }
        double h=c, H=1;
        while(i<d){
            h =h*c;
            H =h;
            i++;
        }
        cociente=P/H;
        return cociente;
    }
}