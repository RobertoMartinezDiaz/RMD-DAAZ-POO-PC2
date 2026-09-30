package ejercicio2;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldoCuenta;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldoCuenta, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void mostrarInfo(){
        System.out.println(
                "INFORMACIÓN DE LA CUENTA BANCARIA \n"+
                "Número de Cuenta: "+ numeroCuenta +"\n"+
                "Saldo: "+ saldoCuenta +"\n"+
                "Tipo de Cuenta: "+ tipoCuenta +"\n"
        );
    }
}
