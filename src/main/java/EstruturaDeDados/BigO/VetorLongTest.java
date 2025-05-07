package EstruturaDeDados.BigO;

public class VetorLongTest {

    // Tempo ded execução: 6546 ms
    private static final int TAMANHO = 100000;

    public static void main(String[] args){

        long[] array = new long[TAMANHO];

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < TAMANHO ; i++){
            for (int i = 0; i < TAMANHO; i++){
                array[i] += i;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: "+(endTime - startTime)+" ms");
    }
}
