void main() {
    char op;
    int minutos;
    Locale.setDefault(Locale.US);
    Scanner ler = new Scanner(System.in);
    IO.println("Escolha o seu plano(P.Basico = b,P.plus = p):");
    op = ler.next().charAt(0);
    IO.println("Quantos minutos foram utilizados?");
    minutos = ler.nextInt();
    if (op == 'b' || op == 'B') {
        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Seu valor a pagar é: R$ %.2f", conta);
    } else if (op == 'p' || op == 'P') {
        double conta = 100.0;
        if (minutos > 300) {
            conta += (minutos - 300) * 1.0;
        }
        System.out.printf("Seu valor a pagar é: R$ %.2f", conta);
    } else {
        IO.println("Esse plano não existe, tente novamente!");
    }
}
