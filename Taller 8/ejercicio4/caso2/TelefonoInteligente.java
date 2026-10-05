package ejercicio4.caso2;

public class TelefonoInteligente extends Bateria {
    private String modelo;

    public TelefonoInteligente(String tecnologia, String modelo) {
        super(tecnologia);
        this.modelo = modelo;
    }

    public void verificarEstadoBateria() {
        /*
         * DISCUSIÓN SOBRE RESTRICCIÓN DE MIEMBROS PRIVADOS (Caso 2):
         *
         * ¿Por qué ocurre este error de compilación?
         * El modificador 'private' ofrece el aislamiento más fuerte en Java. Aunque 'TelefonoInteligente'
         * sea una subclase directa de 'Bateria', no se le concede acceso de lectura o escritura a
         * 'miliamperiosHora'. La herencia no rompe el encapsulamiento; si la subclase necesita conocer
         * o alterar este valor, la clase base debe exponerlo mediante métodos protegidos o públicos.
         */

        // ERROR DE COMPILACIÓN: 'miliamperiosHora' has private access in 'taller_herencia.ejercicio4.caso2'
        // System.out.println("Capacidad: " + super.miliamperiosHora + " mAh");
    }
}
