public class calcular {
    protected int a ,b;
    public calcular(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    
    public int suma(){
        int S=a+b;
        return S;
    }
    public int resta(){
        int R=a-b;
        return R;
    }
    public int multiplicacion(){
        int M=a*b;
        return M;
    }
    public int divicion(){
        int D=a/b;
        return D;
    }
    public int cociente(){
        int i =1, cociente=0,c=a;
        while(i<b){
            c =c*a;
            cociente =c;
            i++;
        }
        return cociente;
    }
    public int cocienteRecurcivo (int a, int b){
        if(b==1){
            return a;
        }else{
            return a+cocienteRecurcivo(a,b-1);
        }
    }
}