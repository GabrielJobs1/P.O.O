package Tarefas3103.Lista;

import java.util.Scanner;
import java.util.Locale;
public class Q07
{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        int n, cubo, quadrado;
        System.out.println("Quantidade de linhas:");
        n = ler.nextInt();

        for(int i = 1; i <= n; i++){
            quadrado =(i*i);
            cubo = (i*i*i);
            System.out.println(" "+ i +" "+ quadrado +" "+ cubo +" \n ");
        }
        ler.close();
    }
}
