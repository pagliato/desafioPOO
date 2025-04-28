package unasp;

public class ContaCorrente {
    private int codigo;
    private String cpf;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public ContaCorrente(int codigo, String cpf, String nomeCliente, double saldoInicial) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    // Métodos de movimentação
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque não realizado. Verifique o saldo ou o valor informado.");
            return false;
        }
    }

    // Métodos getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

