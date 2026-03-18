import java.util.Scanner;
public class Q3Lista {
    public static void main(String[] args){
        int A,B;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        A = ler.nextInt();
        System.out.println("Digite o valor de B:");
        B = ler.nextInt();
        if(A < B){
            int temp;
            temp = A;
            A = B;
            B = temp;
        }
        if(A % B == 0 ){
            System.out.println("Sao multiplos!");
        }else{
            System.out.println("Nao sao multiplos!");
        }
        ler.close();
    }
}
