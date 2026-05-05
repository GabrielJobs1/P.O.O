package Lista1;

import java.util.Scanner;

public class Q2Lista {
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
