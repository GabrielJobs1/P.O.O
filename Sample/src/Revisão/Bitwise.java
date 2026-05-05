import java.util.Scanner;
void main() {
    Scanner ler = new Scanner(System.in);
    int mask = 0b1000000;
    System.out.println("Insira o primeiro numero:");
    int n1 = ler.nextInt();
    System.out.println("Insira o segundo numero:");
    int n2 = ler.nextInt();
    if(((n1 & mask) ^ (n2 & mask)) != 0 ){
        if((n1 & mask) != 0) {
            System.out.println("O setimo bit de " + n1 + " é verdadeiro e o setimo bit de " + n2 + " é falso.");
        }else{
            System.out.println("O setimo bit de " + n1 + " é falso e o setimo bit de " + n2 + " é verdadeiro.");
        }
    }else{
        System.out.println("O setimo bit de ambos são verdadeiros ou falsos!");
    }
    ler.close();
}