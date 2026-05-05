package Tarefas3103.Lista;

import java.util.Scanner;
import java.util.Locale;
public class Q05
{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        int N;
        long r = 1;
        System.out.println("Insira um valor:");
        N = ler.nextInt();

        for(int i = 1; i <= N;i++){
            r *= i;
        }
        System.out.printf(" %d\n", r);
        ler.close();

    }


}


