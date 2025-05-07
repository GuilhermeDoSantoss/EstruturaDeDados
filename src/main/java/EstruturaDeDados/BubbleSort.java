package EstruturaDeDados;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 4, 2};

        System.out.println("Antes da ordenação: ");
        for (int num : numeros) {
            System.out.println(num + " ");
        }

        bubbleSort(numeros);

        System.out.println("Depois da ordenação: ");
        for (int num : numeros) {
            System.out.println(num + " ");
        }
    }
}
