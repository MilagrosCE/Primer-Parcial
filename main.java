public class main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Juan", 1000.0);
        System.out.println("Datos de la cuenta:");
        cuenta1.mostrarDatos();

        cuenta1.depositar(1000.0);
        cuenta1.retirar(500.0);
        System.out.println("Datos de la cuenta despues de las operaciones:");
        cuenta1.mostrarDatos();
    }
}
