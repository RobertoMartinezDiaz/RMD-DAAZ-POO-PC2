import ejercicio2.CuentaBancaria;

void main() {

    CuentaBancaria cuenta1 = new CuentaBancaria("0123-4567-8910", 50000, "Cuenta de ahorros");

    cuenta1.mostrarInfo();

    cuenta1.setSaldoCuenta(100000);

    System.out.print("NUEVO SALDO DE CUENTA: ");
    cuenta1.mostrarInfo();

    /*
    // Como el atributo numeroCuenta es privado, me marca error
    System.out.println(cuenta1.numeroCuenta); // 'numeroCuenta' has private access in 'ejercicio2.CuentaBancaria'
     */

    // Con el atributo de tioCuenta no marca error porque este si es de acceso público
    System.out.println(cuenta1.tipoCuenta);
}