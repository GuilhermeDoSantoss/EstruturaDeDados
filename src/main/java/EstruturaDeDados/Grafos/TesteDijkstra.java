package EstruturaDeDados.Grafos;

import java.util.Scanner;

public class TesteDijkstra {

    private static final int S1 = 0;
    private static final int S2 = 1;
    private static final int S3 = 2;
    private static final int S4 = 3;
    private static final int S5 = 4;
    private static final int S6 = 5;
    private static final int S7 = 6;
    private static final int S8 = 7;
    private static final int S9 = 8;
    private static final int S10 = 9;
    private static final int S11 = 10;
    private static final int S12 = 11;
    private static final int S13 = 12;
    private static final int S14 = 13;
    private static final int S15 = 14;
    private static final int S16 = 15;
    private static final int S17 = 16;
    private static final int S18 = 17;
    private static final int S19 = 18;
    private static final int S20 = 19;

    public static void main(String[] args) {

        AlgoritmoDijkstra dijkstra = new AlgoritmoDijkstra(20);

        // Linha vermelha
        dijkstra.criarAresta(S1, S2, 16);
        dijkstra.criarAresta(S2, S3, 14);
        dijkstra.criarAresta(S3, S4, 12);
        dijkstra.criarAresta(S4, S5, 12);
        dijkstra.criarAresta(S5, S6, 14);

        // Linha verde
        dijkstra.criarAresta(S7, S8, 15);
        dijkstra.criarAresta(S8, S9, 11);
        dijkstra.criarAresta(S9, S10, 13);
        dijkstra.criarAresta(S10, S11, 16);
        dijkstra.criarAresta(S11, S6, 15);

        // Linha Amarela
        dijkstra.criarAresta(S12, S8, 11);
        dijkstra.criarAresta(S8, S2, 8);
        dijkstra.criarAresta(S2, S5, 7);
        dijkstra.criarAresta(S15, S16, 7);
        dijkstra.criarAresta(S16, S17, 12);
        dijkstra.criarAresta(S17, S18, 9);

        Scanner in = new Scanner(System.in);
        System.out.println("Bem vindo ao Subway System");
        System.out.println("-----------------------------------------");

        while(true){
            System.out.println("Por favor, entre com a sua rota ou pressione ENTER para sair do programa");
            int origem = lerEstacao("Origem", in);
            int destino = lerEstacao("Destino", in);

            for (Integer estacao : dijkstra.caminhoMinimo(origem, destino)){
                System.out.print((estacao+1) +" -> ");
            }

            System.out.println("Fim de Rota");
        }
    }
}
