void main() {
    int[] vetor = new int[10];
    int x;
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
        vetor[i] = sc.nextInt();
    }
    x = sc.nextInt();
    for (int i = 0; i < 10; i++) {
        if (vetor[i] % x == 0) {
            IO.println(vetor[i]);
        }
    }
}
