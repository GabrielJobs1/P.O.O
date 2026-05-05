package Lista1;

import  java.util.Scanner;
public class Q1Lista {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int num = ler.nextInt();
        if( num < 0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NAO NEGATIVO");
        }
        ler.close();
    }
}
