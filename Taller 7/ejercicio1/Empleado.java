package ejercicio1;

public class Empleado {
    public String nombre;
    private double salario;


    public Empleado (String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario){
        if (salario >= 0){
            this.salario = salario;
        }else {
            System.out.println("Error: El salario no puede ser un valor negativo.");
        }

    }



}
