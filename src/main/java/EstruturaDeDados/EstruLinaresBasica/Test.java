package EstruturaDeDados.EstruLinaresBasica;

public class Test {
    public static void main(String [] args){

        try{
            Vetor nomes = new Vetor(5);
            nomes.adicionar("Matheus");
            nomes.adicionar("Guilherme");
            nomes.adicionar("Giovana");
            nomes.adicionar("Lucas");
            nomes.adicionar("Amanda");
            nomes.adicionar("Carol");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
