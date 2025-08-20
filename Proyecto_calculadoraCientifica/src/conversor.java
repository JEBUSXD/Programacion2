public class conversor {
    //1)para medidas
    static double[] medidas={
        0.01,//centimetro
        0.0254,//pulgadas
        0.3048,//pies
        1,//metros
        1000//kilometro
    };
    static double convertirUnidades(double num, int vector, int a){
        return (num*medidas[vector])/medidas[a];
    }
    //2)PARA MEDIDAS DE TIEMPO 
    static double[] tiempo={
        0.000278,//seg
        0.0167,//min
        1,//hora
        24//dia
    };
    static double convertirTiempo(double valor, int de, int a){
        return (valor*tiempo[de])/tiempo[a];
    }
    //3)para la masa
    static double[] masa={
        0.001,//gramo
        0.02835,//onza
        0.4535,//libra
        1,//kilo
    };
    static double convertirMasa(double valor, int de, int a){
        return (valor*masa[de])/masa[a];
    }
}