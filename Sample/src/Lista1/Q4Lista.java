package Lista1;

import java.util.Scanner;

public class Q4Lista {
    public static void main(String[] args) {
        int HoraI;
        int HoraF;
        int duracao;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a Hora inicial:");
        HoraI = ler.nextInt();
        System.out.println("Insira a Hora Final:");
        HoraF = ler.nextInt();
        if(HoraF <= HoraI){
            duracao = (24 - HoraI) + HoraF;
        }else{
            duracao =  HoraF - HoraI;
        }
        System.out.printf("O JOGO DUROU %d HORA(S).", duracao);
        ler.close();
    }
}
