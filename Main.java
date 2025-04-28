package unasp;

public class Main {
    public static void main(String[] args) {
        // Instanciando uma conta
        ContaCorrente conta = new ContaCorrente(2804, "123.456.789-00", "Layla Silva", 700.0);

        // Testando métodos
        System.out.println("Saldo inicial: R$" + conta.getSaldo());

        conta.depositar(300.0);
        System.out.println("Saldo após depósito: R$" + conta.getSaldo());

        conta.sacar(570.0);
        System.out.println("Saldo após saque: R$" + conta.getSaldo());

        conta.sacar(500.0); // Tentativa de saque acima do saldo
    }
}

