package EstruturaDeDados.Fila;

import java.util.LinkedList;
import java.util.Queue;

// Fila segue a lógica FIFO: o primeiro a entrrar é o primeiro a sair.
// Pense na fila de um banco. São ideias para o processamento sequencial: tarefas, requisições, impressão e etc..

// affer: adiciona ao final do fila
// poll: remove o primeiro elemento
// peek: visualiza o primeiro sem remover

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.offer("Cliente 1");
        fila.offer("Cliente 2");
        System.out.println(fila.poll());
    }
}
