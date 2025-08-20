import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        while(true){
            System.out.println("************************CALCULADORA CIENTIFICA*****************************");
            System.out.println("Hola, bienvenido a la calculadora cientifica, ¿Que operacion desea realizar? \n"
            + "Escoja entre las opciones que hay disponibles");
            System.out.println("1)Operaciones Matematicas basicas");
            System.out.println("2)Operaciones con fracciones ");
            System.out.println("3)Conversor de unidades");
            System.out.println("4)Calcular el area de figuras gometricas");
            System.out.print("》》》 ");
            int opt = leer.nextInt();
            switch(opt){
                case 1://CALCULADORA
                    System.out.println("¿Que tipo de operacion desea realizar?");
                    System.out.println("1)Suma, 2)Resta, 3)Multiplicasión, 4)División, 5)Exponente (a^b)");
                    int opc = leer.nextInt();
                    System.out.println("Introdusca dos numeros a y b");
                    int a=leer.nextInt();
                    int b=leer.nextInt();
                    calcular c1=new calcular(a,b);
                    switch(opc){
                        case 1://SUMA
                            System.out.println("La suma es:"+c1.suma());
                        break;
                        case 2://RESTA
                            System.out.println("La resta es:"+c1.resta());
                        break;
                        case 3://MULTIPLICACION
                            System.out.println("La multiplicacion es:"+c1.multiplicacion());
                        break;
                        case 4://DIVICION
                            System.out.println("La divicion es:"+c1.divicion());
                        break;
                        case 5://EXPONENTE 
                            System.out.println("El resultado con el cociente es :"+c1.cociente());
                        break;
                        default: System.out.println("la opción "+opc+", no existe");
                        break;
                    }
                break;
//******************************************************************************
                case 2://CON LAS FRACCONES 
                    System.out.println("1)Suma de fracciones, 2)Resta de fracciones, 3)Multiplicasión de fracciones, 4)División de fracciones, 5)divicion con exponentes a^b/c^d");
                    int opti = leer.nextInt();
                    System.out.println("Introdusca cuatro muneros, introdusca de la siguiente manera(a/b y c/d)");
                    int A=leer.nextInt();
                    int B=leer.nextInt();
                    int C=leer.nextInt();
                    int D=leer.nextInt();
                    fracciones f1=new fracciones(A,B,C,D);
                    switch(opti){
                        case 1://SUMA FRACCION
                            System.out.println("La suma de fraccines es:"+f1.sumaFraccion());
                        break;
                        case 2://RESTA FRACCION
                            System.out.println("La resta de fraccines es:"+f1.restaFraccion());
                        break;
                        case 3://MULTIPLICACION FRACCION
                            System.out.println("La multiplicacion de fraccines es:"+f1.multiplicacionFraccion());
                        break;
                        case 4://DIVISION FRACCION
                            System.out.println("La divicion de fraccines es:"+f1.divicionFraccion());
                        break;
                        case 5://EXPONENTE fracciones 
                            System.out.println("El resultado con la divicion de cociente es:"+f1.cocienteFracciones());
                        break;
                        default: System.out.println("la opción "+opti+", no existe");
                        break;
                    }
                break;
//******************************************************************************
                case 3://CONVERSOR DE UNIDADES 
                    System.out.println("¿Que tipo de convercion desea realizar?");
                    System.out.println("1)conversor de unidades, 2)Conversor de tiempo, 3)Conversor de masa");
                    System.out.print("》》》 ");
                    int optio=leer.nextInt();
                    switch(optio){
                        case 1://CONVERSOR DE UNIDADES--------------------------
                            System.out.println("¿Con que unidad de medida desea trabajar?");
                            System.out.println("0)Centimetros(cm), 1)Pulgadas(in) ,2)Pies(ft), 3)Metros(m), 4)kilometro(km)");
                            int vMedida=leer.nextInt();
                            System.out.println("Ingrese el numero: ");
                            int num=leer.nextInt();
                            System.out.println("A que unidad desea convertir ?");
                            int aConvertir=leer.nextInt();
                            System.out.println("Resultado: "+conversor.convertirUnidades(num, vMedida, aConvertir));
                        break;
                        case 2://CONVERSOR DE TIEMPO----------------------------
                            System.out.println("¿Con que unidad de tiempo desea trabajar?");
                            System.out.println("0)Segundos(seg), 1)Minutos(min), 2)Horas(H), 3)Dia(d)");
                            int vTiempo=leer.nextInt();
                            System.out.println("Ingrese el numero: ");
                            int nume=leer.nextInt();
                            System.out.println("A que unidad desea convertir ?");
                            int vConvertir=leer.nextInt();
                            System.out.println("Resultado: "+conversor.convertirTiempo(nume, vTiempo, vConvertir));
                        break;
                        case 3://CONVERSOR DE MASA------------------------------
                            System.out.println("¿Con que unidad de masa desea trabajar?");
                            System.out.println("0)Gramos(gr), 1)Onza(oz), 2)libra(lb), 3)kilogramo(kg)");
                            int vMasa=leer.nextInt();
                            System.out.println("Ingrese el numero: ");
                            int numer=leer.nextInt();
                            System.out.println("A que unidad desea convertir ?");
                            int convertir=leer.nextInt();
                            System.out.println("Resultado: "+conversor.convertirMasa(numer, vMasa, convertir));
                        break;
                        default: System.out.println("La opcion "+optio+", no existe" );
                        break;
                    }
                break;
//******************************************************************************
                case 4://FIGURAS GEOMETRICAS
                    System.out.println("¿Que tipo de figura geometrica desea saber su area?");
                    System.out.println("1)Cuadrado ,2)Rectangulo, 3)triangulo rectangulo, 4)circulo, 5)Elipse, 6)Circulo hueco, 7)Trapecio, 8)Cubo, 9)Rectangulo 3D, 10)Esfera, 11)Cilindro");
                    int figuras= leer.nextInt();
                    switch(figuras){
                        case 1://cuadrado
                            System.out.println("Introdusca el lado del cuadrado ");
                            int c=leer.nextInt();
                            figurasGeometricas o1=new figurasGeometricas(c);
                            System.out.println("El area del cuadrado es:"+o1.cuadrado());
                        break;
                        case 2://rectangulo
                            System.out.println("Introdusca los lados del rectangulo ");
                            int r=leer.nextInt();
                            int Rr=leer.nextInt();
                            figurasGeometricas o2=new figurasGeometricas(r, Rr);
                            System.out.println("El area del rectangulo es:"+o2.rectangulo());
                        break;
                        case 3://triangulo rectangulo
                            System.out.println("Introdusca los lados del triangulo rectangulo ");
                            int tr=leer.nextInt();
                            int TR=leer.nextInt();
                            figurasGeometricas o3=new figurasGeometricas(tr, TR);
                            System.out.println("El area del triangulo rectangulo es:"+o3.trianguloRectangulo());
                        break;
                        case 4://circulo
                            System.out.println("Introdusca el radio del circulo");
                            int cr=leer.nextInt();
                            figurasGeometricas o4=new figurasGeometricas(cr);
                            System.out.println("El area del circulo es:"+o4.circulo());
                        break;
                        case 5://elipce
                            System.out.println("Introdusca el radio del circulo mayor y del menor");
                            int crm=leer.nextInt();
                            int CRM=leer.nextInt();
                            figurasGeometricas o5=new figurasGeometricas(crm,CRM);
                            System.out.println("El area del triangulo rectangulo es:"+o5.elipse());
                        break;
                        case 6://circulo Hueco
                            System.out.println("Introdusca el radio del circulo mayor y del menor");
                            int crma=leer.nextInt();
                            int CRME=leer.nextInt();
                            figurasGeometricas o6=new figurasGeometricas(crma,CRME);
                            System.out.println("El area del circulo hueco es:"+o6.circuloHueco());
                        break;
                        case 7://trapecio
                            System.out.println("Introdusca la base menor y la mayor y la altura ");
                            int bm=leer.nextInt();
                            int BM=leer.nextInt();
                            int H=leer.nextInt();
                            figurasGeometricas o7=new figurasGeometricas(bm,BM,H);
                            System.out.println("El area del trapecio es:"+o7.trapecio());
                        break;
                        case 8://cubo
                            System.out.println("Introdusca el lado del cubo");
                            int cubo=leer.nextInt();
                            figurasGeometricas o8=new figurasGeometricas(cubo);
                            System.out.println("El area del cubo es:"+o8.cubo());
                        break;
                        case 9://rectangulo tridimencional
                            System.out.println("Introdusca el lado del rectangulo y la altura");
                            int rect=leer.nextInt();
                            int largo=leer.nextInt();
                            int hal=leer.nextInt();
                            figurasGeometricas o9=new figurasGeometricas(rect, largo, hal);
                            System.out.println("El area del rectangulo tri es:"+o9.rectanguloTri());
                        break;
                        case 10://esfera
                            System.out.println("Introdusca el radio de la esfera");
                            int esfera=leer.nextInt();
                            figurasGeometricas o10=new figurasGeometricas(esfera);
                            System.out.println("El area de la esfera es:"+o10.esfera());
                        break;
                        case 11://cilindro
                            System.out.println("Introdusca el radio menor y el mayor y luego la haltura del cilindro");
                            int r1=leer.nextInt();
                            int R2=leer.nextInt();
                            int HALTURA=leer.nextInt();
                            figurasGeometricas o11=new figurasGeometricas(r1, R2, HALTURA);
                            System.out.println("El area del cilindro hueco es:"+o11.cilindro());
                        break;
                        default: System.out.println("la opción "+figuras+", no existe");
                        break;
                    }
                break;
                default: System.out.println("la opción "+opt+", no existe");
                break;
            }
        }
    }
}