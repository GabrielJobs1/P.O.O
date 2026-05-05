import java.util.Scanner;
import java.util.Locale;
void main() {
    int gasolina, diesel, alcool;
    int op;
    Scanner ler = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    do{
        System.out.println("Escolha:\n 1-Gasolina\n 2-Diesel\n 3-Alcool\n 4-Sair\n");
        op = ler.nextInt();
        switch(op){
            case 1:
                System.out.println("Gasolina: 2");
                break;
            case 2:
                System.out.println("Diesel: 0");
                break;
            case 3:
                System.out.println("Alcool: 1");
                break;
            case 4:
                break;
            default:
                System.out.println("MUITO OBRIGADO.");
                break;
        }
    }while(op != 4);

}