package ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Utilidades calc = new Utilidades();

        System.out.println("Suma (15.5 + 4.5) = " + calc.sumar(15.5, 4.5));
        System.out.println("Resta (20.0 - 8.5) = " + calc.restar(20.0, 8.5));
        System.out.println("Multiplicación (6.0 * 7.0) = " + calc.multiplicar(6.0, 7.0));
        System.out.println("División (50.0 / 4.0) = " + calc.dividir(50.0, 4.0));

        System.out.println("\n--- Ejecutando Prueba de Control de Errores ---");
        calc.dividir(10.0, 0);
    }
}
