package Ejercicio2;

public class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println(
                "INFORMACIÓN DE LA PERSONA \n"+
                "Nombre: "+ nombre +"\n"+
                "Edad: "+ edad +"\n"
        );
    }
}
