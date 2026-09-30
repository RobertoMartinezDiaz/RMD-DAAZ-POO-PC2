package ejercicio1;

public class Coche extends Vehiculo {

    int numeroDePuertas;

    public Coche(String marca, double velocidadMaxima, int numeroDePuertas){
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInfo(){
        System.out.println(
                "INFORMACIÓN DEL VEHICULO \n"+
                "Marca: "+ marca +"\n"+
                "Velocidad Máxima: "+ velocidadMaxima +"\n"+
                "Número de puertas: "+ numeroDePuertas +"\n"
        );
    }
}
