package AtividadesAula2;

import java.util.Scanner;
public class Q7Lista {
    public static void main(String[] args) {
        float x;
        float y;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a posição de X:");
        x = ler.nextFloat();
        System.out.println("Insira a posição de Y:");
        y = ler.nextFloat();
        if( x == 0 && y == 0){
            System.out.println("Origem");
        }else if(y == 0 && x != 0){
            System.out.println("Eixo X");
        }else if(x == 0 && y != 0){
            System.out.println("Eixo Y");
        }else if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }else if(x > 0 && y < 0){
            System.out.println("Q4");
        }
        ler.close();
    }
}
