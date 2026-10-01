package ejercicio3;

public class Prueba3 {
    public static void main(String[] args) {
        System.out.println("=== INSTANCIA DE LA CLASE EMPLEADO ===");
        Empleado emp = new Empleado("Andrés Torres", 1500.0);
        emp.mostrarDetalles();

        System.out.println("\n=== INSTANCIA DE LA CLASE GERENTE ===");
        Gerente ger = new Gerente("John Carlos", 4500.0, "Sistemas e Informática");
        ger.mostrarDetalles();
    }
}
