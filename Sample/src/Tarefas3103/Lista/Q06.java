package Tarefas3103.Lista;

import java.util.Scanner;
import java.util.Locale;
public class Q06
{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("Insira um numero:");
        n = ler.nextInt();

        System.out.println("Os divisores de " + n +"são:");

        for(int i = 1; i <= n; i++){
            if( n % i == 0){
                System.out.println(i);
            }
        }
        ler.close();
    }
}

