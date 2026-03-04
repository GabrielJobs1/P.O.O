public class ArraysRevisao2 {
    static void main(){
        int[] v = new int[5];
        int i;
        for(i = 0; i < 5; i++){
            v[i] = (i+5*1)%(i+1);
            System.out.printf("O valor do vetor na posição %d é: %d\n", i+1, v[i]);
        }


    }
}
