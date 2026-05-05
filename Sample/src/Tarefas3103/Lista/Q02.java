package Tarefas3103.Lista;

import java.util.Scanner;

public class Q02
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int num = ler.nextInt();
        if(num % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("ÍMPAR");
        }
        ler.close();
    }
}