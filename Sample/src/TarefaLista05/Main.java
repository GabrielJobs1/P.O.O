package TarefaLista05;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        Conta conta;

        System.out.println("Insira o número da conta:");
        int numero = ler.nextInt();

        System.out.println("Insira o nome do Titular:");
        ler.nextLine();
        String titular = ler.nextLine();

        System.out.println("Deseja efetuar um deposito inicial?(y/n)");
        char resposta = ler.next().charAt(0);

        if(resposta == 'y'){
            System.out.println("Qual o valor do deposito inicial?");
            double DepositoInicial = ler.nextDouble();
            conta = new Conta(numero,titular,DepositoInicial);
        }else{
            conta = new Conta(numero,titular);
        }

        System.out.println("\nAccount data:");
        System.out.println(conta);

        System.out.print("\nInsira um novo deposito: ");
        double valorDeposito = ler.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.print("\nInsira um valor de saque: ");
        double valorSaque = ler.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Updated account data:");
        System.out.println(conta);

        ler.close();
    }
}
