package EstruturaDeDados.Heap;

import java.util.PriorityQueue;

public class TarefaMain {
    public static void main(String[] args) {

        PriorityQueue<Tarefa> filaTarefa = new PriorityQueue<Tarefa>();
        filaTarefa.add(new Tarefa("Responder E-mails", 3));
        filaTarefa.add(new Tarefa("Corrigir Bugs", 1));
        filaTarefa.add(new Tarefa("Planejamento Sprint", 2));

        System.out.println("Tarefas por ordem de prioridades");
        while (!filaTarefa.isEmpty()){
            System.out.println(filaTarefa.poll());
        }
    }
}
