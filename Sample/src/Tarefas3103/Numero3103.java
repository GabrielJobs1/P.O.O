import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira 3 numeros:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int maior = maior( a, b, c);
    int menor = menor(a, b, c);

    igual( a, b, c);
    MostrarMaior(maior);
    MostrarMenor(menor) ;

    sc.close();
}
public static int maior(int a,int b,int c){
    if (a > b && a > c) {
        return a;
    } else if(b > c) {
        return b;
    } else {
        return c;
    }
}
public static int menor(int a, int b, int c){
    if(a < b && a < c){
        return a;
    }else if (b < c){
        return b;
    }else{
        return c;
    }
}
public static void igual(int a, int b, int c){
    if( a == b && b == c){
        System.out.println("Os três são iguais!\n");
    }else if(a == b){
        System.out.println("Os valores "+ a +" e "+ b +" são iguais!\n");
    }else if(b == c){
        System.out.println("Os valores "+ b +" e "+ c +" são iguais!\n");
    }else if(c == a){
        System.out.println("Os valores "+ c +" e "+ a +" são iguais!\n");
    }else{
        System.out.println("Nenhum é igual!\n");
    }
}
public static void MostrarMaior(int value) {
    System.out.println("Maior =" + value);
}
public static void MostrarMenor(int value) {
    System.out.println("Menor =" + value);
}
