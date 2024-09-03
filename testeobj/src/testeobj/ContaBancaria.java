
package testeobj;


public class ContaBancaria {
    
    private String titular;
    private double saldo;
    private int numeroConta;

    
    public ContaBancaria(String titular, double saldoInicial, int numeroConta) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numeroConta = numeroConta;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saque inválido. Verifique o valor e o saldo disponível.");
        }
    }

    
    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
    
}
