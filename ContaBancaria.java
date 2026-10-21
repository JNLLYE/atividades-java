public class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Depósito realizado!");
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo final: R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Kauan";
        conta.saldo = 100.0;

        conta.depositar(50.0);
        conta.sacar(30.0);
        conta.exibirSaldo();
    }
}
