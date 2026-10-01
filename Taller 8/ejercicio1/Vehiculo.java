package ejercicio1;

public class Vehiculo {

    String marca;
    double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInfo(){
        System.out.println(
                "INFORMACIÓN DEL VEHICULO \n"+
                "Marca: "+ marca +"\n"+
                "Velocidad Máxima: "+ velocidadMaxima +"\n"
        );
    }
}
