package ejercicio1;

public class Prueba1 {
    public static void main(String[] args) {
        // Instancia del objeto
        Empleado emp = new Empleado("Alejandro Pérez", 1800.0);

        // Acceso directo a la propiedad pública
        System.out.println("Empleado: " + emp.nombre);

        // Uso del método set público para modificar y validar (Estilo del taller)
        emp.setSalario(-350.0); // Mostrará el mensaje de error
        emp.setSalario(2200.0); // Modificación exitosa
    }
}
