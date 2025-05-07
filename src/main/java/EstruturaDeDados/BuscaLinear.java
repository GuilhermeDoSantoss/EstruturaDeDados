package EstruturaDeDados;

public class BuscaLinear {

    public static int buscar(int arr[], int valor){
        for(int i = 0; i < arr.length; i++){
            if( arr[i] == valor){
                return i;
            }
        }

        return -1;
    }

}
