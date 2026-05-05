package Tarefas3103.Lista;

import java.util.Scanner;
import java.util.Locale;
public class Q01
{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("Insira um numero inteiro:");
        n = ler.nextInt();
        if(n < 1 || n > 1000){
            System.out.println("Numero invalido");
        }else{
            for(int i = 0; i <= n; i++){
                if(!(i % 2 == 0)){
                    System.out.printf("%d\n", i);
                }
            }
        }
        ler.close();
    }
}
