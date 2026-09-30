package Ejercicio2;

public class Estudiante extends Persona {

    String matricula;

    public Estudiante(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarInfo(){
        System.out.println(
                "INFORMACIÓN DEL ESTUDIANTE \n"+
                "Nombre: "+ nombre +"\n"+
                "Edad: "+ edad +"\n"+
                "Matricula: "+ matricula +"\n"
        );
    }
}
