package Tarefa0505;

public class Conta {
    private String Titular;
    private int NumeroConta;
    private double saldo;

    public Conta(int numero, String Titular, double DepositoInicial){
        this.NumeroConta = numero;
        this.Titular = Titular;
        depositar(DepositoInicial);
    }

    public Conta(int numero, String Titular){
        this.NumeroConta = numero;
        this.Titular = Titular;
    }

    public int getNumeroConta(){
        return NumeroConta;
    }

    public void setTitular(String titular){
        this.Titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return Titular;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor + 5.00;
    }

    public String toString() {
        return "Account "
                + NumeroConta
                + ", Holder: "
                + Titular
                + ", Balance: $ "
                + String.format("%.2f", saldo);
    }
}
