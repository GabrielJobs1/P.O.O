void main() {
    int[] vetor = new int[10];
    Scanner sc = new Scanner(System.in);
    int i, j;
    int numero;
    int repitido;

    for (i = 0; i < 10; i++) {
        IO.println("Digite um numero: ");
        numero = sc.nextInt();
        repitido = 0;
        for (j = 0; j < i; j++) {
            if (vetor[j] == numero) {
                repitido = 1;
                break;
            }
        }
        if (repitido == 0) {
            vetor[i] = numero;
        } else {
            IO.println("Numero ja digitado, tente outro");
            i--;
        }
    }
}
