public class CFraccion {
    //entoces implementamos el constructor.El constructor vasicamente es la inicializacion
    //"num y dem" es el constructor(variable global)
    private int num;// variables de instancia de tipo(this, self)
    private int den;
    public CFraccion(){
        num = 0;
        den = 1;
    }
    public CFraccion(int a, int b){
        //aqui se recivira los datos de afuera
        this.num =a;
        this.den =b;
        //
        simplificar();
    }
    private int mcd(int a, int b){
        //el metodo math.abs nos sirve para devilver el valor absoluto de un dato que sea positivo o neativo
        //ejemplo si el valor introducido es negativo nos devolvera el mismo numero pero sin el signo ejemplo -3 = 3
        //esto es para que el NEGATIVO se vaya al numerador
        a = Math.abs(a);//100
        b = Math.abs(b);//-20
        //esta parte es por si en den es mayor que en num (intercambia la posicion de los dos)
        if(b>a){
            int aux = a;
            a = b;
            b = aux;
        }//20/100
        int res = 0;
        do{
            res = a%b;//   20/100=0
            a = b;
            b = res;
        }while(res!=0);
        return a;
        //Ahora que tenemos la divicion la ocupamos para simplificar la otra parte de a  divicion 
    }
    private void simplificar(){
        //aqui por ejemplo tenemos 2 todo se dividira por dos hasta llagar al resultado 
        int m = mcd(num,den);
        num = (int)num/m;
        den = (int)den/m;
        
        if(num*den>0){
            num = Math.abs(num);
            den = Math.abs(den);                        
        }
        else{
            num = -Math.abs(num);
            den = Math.abs(den);                        
        }
    }
    public int getNum() {
        return num;
    }
    public void setNum(int nu) {
        this.num = nu;
        simplificar();
    }
    public int getDen() {
        return den;
    }
    public void setDen(int de) {        
        this.den = de;   
        simplificar();
    }
    @Override
    public String toString(){
        String cad="";        
        cad = num +"/"+den;
        return cad;
    }
    //suma restde fracciones 
}