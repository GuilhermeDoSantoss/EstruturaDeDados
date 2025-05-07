package EstruturaDeDados.TabelasHash;


import java.util.HashMap;
import java.util.Map;

/* Crie uma classe chamada GerenciadorDeEstoque com as seguintes funcionalidades:

     - Adicionar ou atualizar um produto. Se o produto já existir, atualize sua quantidade.
        Caso contrário, adicione

     - Remover um produto: Renova o produto do estoque.

     - Exibir todos os produtos: Exiba a lista de produtos e suas quantidades.

     - Consultar um produto específico: Mostre a quantidade de um produto específico no estoque.

   - Use a classe HaspMap para armazenar os produtos.

 */
public class GerenciadorDeEstoque {

    private HashMap<String, Integer> listaEstoque;

    public GerenciadorDeEstoque(){
        listaEstoque = new HashMap<String, Integer>();
    }

    public String adicionarOuAtualizar(final String produto, final Integer quantidade){
        if (quantidade <= 0){
            return "Quantidade inválida: Deve-se adicionar uma quantidade positiva";
        }

        if(listaEstoque.containsKey(produto)){
            listaEstoque.put(produto, listaEstoque.get(produto) + quantidade);
            return "Produto" +produto+ " atualizado com sucecsso";
        } else {
            listaEstoque.put(produto, quantidade);
            return "Produto adicionado ao estoque";
        }
    }

    public String removerProduto(final String produto){
        if (listaEstoque.remove(produto) != null){
            return "Produto "+ produto+" foi removido!";
        } else{
            return "Produto não encontrado no estoque";
        }
    }

    public void exibirTodosProdutos(){

        for (Map.Entry<String, Integer> entry : listaEstoque.entrySet()){
            System.out.println("Produto "+entry.getKey()+" Quantidade: "+entry.getValue());
        }
    }

    public void consultarProduto(final String produto){
        if(listaEstoque.containsKey(produto)){
            Integer nomeProduto = listaEstoque.get(produto);
            System.out.println("Produto: "+produto+ " Quantidade: "+qtdProduto);
        } else {
            System.out.println("Produto não encontrado no estoque");
        }
    }

    public static void main(String[] args) {


    }
}
