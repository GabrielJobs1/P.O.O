package Lista1;

import java.util.Scanner;
public class Q6Lista {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float valor;
        System.out.println("Insira o valor:");
        valor = ler.nextFloat();
        if(valor >= 0 && valor <= 25){
            System.out.println("Intervalo [0,25]");
        }else if(valor > 25 && valor <= 50){
            System.out.println("Intervalo (25, 50]");
        }else if(valor > 50 && valor <= 75){
            System.out.println("Intervalo (50, 75]");
        }else if(valor > 75 && valor <= 100){
            System.out.println("Intervalo (75, 100]");
        }else{
            System.out.println("Fora de Intervalo");
        }
        ler.close();
    }
}
