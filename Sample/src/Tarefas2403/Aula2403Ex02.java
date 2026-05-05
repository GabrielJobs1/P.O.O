import java.util.Scanner;
import java.util.Locale;
void main() {
    Locale.setDefault(Locale.US);
    Scanner ler = new Scanner(System.in);
    double x, y;
    do{
        System.out.println("Insira a coordenada de x:");
        x = ler.nextDouble();
        System.out.println("Insira a coordenada de y: ");
        y = ler.nextDouble();

        if(x > 0 && y > 0){
            System.out.println("Primeiro");
        }else if(x < 0 && y > 0){
            System.out.println("Segundo");
        }else if( x < 0 && y < 0){
            System.out.println("Terceiro");
        }else if(x > 0 && y < 0){
            System.out.println("Quarto");
        }
    }while(x != 0 && y != 0);
    ler.close();
}