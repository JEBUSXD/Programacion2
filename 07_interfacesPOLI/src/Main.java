public class Main {
    public static void main(String[] args) {
        Libro L1 = new Libro("Odisea",70.5);
        Libro L2 = new Libro("Mobidic",100.0);
        CD Disco1 = new CD("Rolling Stones",60.2);
        CD Disco2 = new CD("Guns and Roses",90.8);
        //para ahorrarnos mas lineas de codigo lo que hace aqui el ing es transformarlo a vector y poner un ciclo repetitivo
        Vendible[] productos = {L1,L2,Disco1,Disco2};
        for(Vendible prod : productos){
            System.out.println("El precio de: "+prod.getNombre()+" es: "+prod.calcularPrecio());
        }
    }
}