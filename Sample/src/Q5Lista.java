import java.util.Scanner;
public class Q5Lista {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op;
        int qtd;
        double valor = 0;
        System.out.println("\n===MENU===\n");
        System.out.println("(1) - Cachorro quente\n(2) - X-salada\n(3) - X-Bacon\n(4) - Torrada simples\n(5) - Refrigerante\n");
        op = ler.nextInt();
        System.out.println("Qual a quantidade desejada?");
        qtd = ler.nextInt();
        switch(op){
            case 1:
                valor = qtd * 4.0;
                break;
            case 2:
                valor = qtd * 4.50;
                break;
            case 3:
                valor = qtd * 5.0;
                break;
            case 4:
                valor = qtd * 2.0;
                break;
            case 5:
                valor = qtd * 1.50;
                break;
            default:
                System.out.println("Opçao inexistente!");
                break;
        }
        System.out.printf("Total: R$ %.2f", valor);
        ler.close();
    }
}
