package Tarefa0505;

public class GerenciadorEscopo {
    String status = "Ativo!";

    public void executarTeste(int parametro){
        String status = "Teste!";

        System.out.println(status);
        System.out.println(this.status);

        int somaLocal = parametro + 10;
        System.out.println(somaLocal);


    }
}
