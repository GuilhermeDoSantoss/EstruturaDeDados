package EstruturaDeDados.TabelasHash;
/*
Você foi contratado para desenvolver um programa que gerencie uma lista de nomes únicos de pessoas que entram em um evento.
O obejetivo é garantir que não haja duplicatas e permitir funcionalidades básicas de consulta.

Requisitos:

   - Crie uma classe chamada GerenciadorDeNomes com as seguintes funcionalidades:

        - Adicionar um nome: Método que aceita um nome e adiciona á lista de nomes únicos, se ainda não existir.
           Retorne um mensagem indicando se o nome foi adicionado ou já existia.

        - Verificar a existência de um nome: Método que verifica se um nome já foi adicionado.

        - Remover um nome: Método que remove um nome, se ele existir.

        - Exibir todos os nomes: Método que exibe todos os nomes armazenados.

  - Use a classe HashSet para armazenar os nomes.
 */

import javax.swing.*;
import java.util.HashSet;

public class GerenciadorDeNomes {

    private HashSet<String> hashNomes;
    public GerenciadorDeNomes(){
        this.hashNomes = new HashSet<String>();
    }

    public String adicionarNome(final String nome){
        if(hashNomes.add(nome)){
            return "Nome adicionado na lista";
        }
        else {
            return "Nome duplicado! Impossível adicioná-lo";
        }
    }

    public boolean existeNome(final String nome){
        return hashNomes.contains(nome);
    }

    public String removerNome(final String nome){
       if (hashNomes.remove(nome)){
        return "Nome removido da lista";
        }
       else {
           return "Nome não encontrado para remover";
       }
    }

    public void exibirTodosNomes(){
        if (hashNomes.isEmpty()){
            System.out.println("Lista de nomes vazia!");
        }
        else{
            for (String s : hashNomes){
                System.out.println("Nome: "+s);
            }
        }
    }

    public static void main(String[] args) {

        GerenciadorDeNomes gerenciadorDeNomes = new GerenciadorDeNomes();

        int opt = 5;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Adiconar Nome\n"
                            + "2 - Verificar Nome\n"
                            + "3 - Remover Nome\n"
                            + "4 - Exibir todos os nomes\n"
                            + "5 - Sair"
            ));
            switch (opt){
                case 1: {
                    System.out.println(gerenciadorDeNomes.adicionarNome(JOptionPane.showInputDialog("Digite um nome para adicionar: ")));
                    break;
                }
                case 2: {
                    System.out.println("Existe o nome? "+gerenciadorDeNomes.existeNome(JOptionPane.showInputDialog("Digite um nome para encontrar: ")));
                    break;
                }
                case 3: {
                    System.out.println(gerenciadorDeNomes.removerNome(JOptionPane.showInputDialog("Digite um nome para remover: ")));
                    break;
                }
                case 4: {
                    gerenciadorDeNomes.exibirTodosNomes();
                    break;
                }

                default:
                    System.out.println("Opção inválida. Tente de 1 a 5!");
            }
        }
        while (opt != 5);


    }
}
