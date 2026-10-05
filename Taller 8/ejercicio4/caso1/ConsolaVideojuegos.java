package ejercicio4.caso1;


/*
 * ERROR DE COMPILACIÓN ESPERADO si se hace:
 * public class ConsolaVideojuegos extends Procesador, TarjetaGrafica {
 */
public class ConsolaVideojuegos extends Procesador {

    /*
     * DISCUSIÓN SOBRE LA JERARQUÍA EN JAVA (Caso 1):
     *
     * ¿Por qué ocurre este error de compilación?
     * Java no admite herencia múltiple directa entre clases para mantener la simplicidad y evitar
     * ambigüedades de comportamiento (Problema del Diamante). Una consola de videojuegos no puede ser
     * un procesador y una tarjeta gráfica al mismo tiempo mediante 'extends'. Para solucionar esto,
     * se debe recurrir al principio de composición (tener instancias dentro) o implementar Interfaces.
     */
}
