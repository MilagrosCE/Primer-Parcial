public class Cuenta {
    
    private String titular;
    private double saldo;
    
    public Cuenta(String titular, double saldo) {
        this.titular = titular;

        if(saldo < 0) {
            this.saldo = 0.0;
        } else {
            this.saldo = saldo;
        }
    }
    
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double monto) {
        if(monto > 0) {
            saldo += monto;
        }
        return saldo;
    }

    public double retirar(double monto) {
        if(monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("No se puede retirar esa cantidad. Saldo insuficiente.");
        }
        return saldo;
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
