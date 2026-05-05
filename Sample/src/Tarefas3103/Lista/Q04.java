package Tarefas3103.Lista;

import java.util.Scanner;
import java.util.Locale;
public class Q04
{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        int N;
        int num, den;
        float r;
        System.out.println("Quantos pares serão lidos?");
        N = ler.nextInt();
        while( N != 0){
            System.out.println("Digite o numero 1:");
            num = ler.nextInt();

            System.out.println("Digite o numero 2:");
            den = ler.nextInt();

            if(den == 0){
                System.out.println("Divisão Impossivel");
            }else{
                r = (float) num/den;
                System.out.printf("%.1f\n", r);
            }

            N--;
        }
        ler.close();
    }
}
