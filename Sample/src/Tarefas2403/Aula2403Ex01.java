import java.util.Locale;
import java.util.Scanner;
void main() {
    Locale.setDefault(Locale.US);
    Scanner ler = new Scanner(System.in);
    int senha;

    do{
        System.out.println("Insira a senha: ");
        senha = ler.nextInt();
        System.out.println("Senha Invalida");
    }while(senha != 2002);
    System.out.println("Acesso permitido");
    ler.close();
}