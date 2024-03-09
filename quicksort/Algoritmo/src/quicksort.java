public class quicksort {

    public static void main(String[] args) {
        int[] arreglo = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println("Antes de ordenar:");
        printArray(arreglo);

        quickSort(arreglo, 0, arreglo.length - 1);

        System.out.println("Después de ordenar:");
        printArray(arreglo);
    }

    public static void quickSort(int[] arreglo, int bajo, int alto) {
        if (bajo < alto) {
            int Index = partition(arreglo, bajo, alto);
            quickSort(arreglo, bajo, Index - 1);
            quickSort(arreglo, Index + 1, alto);
        }
    }

    public static int partition(int[] arreglo, int bajo, int alto) {
        int pivot = arreglo[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (arreglo[j] < pivot) {
                i++;
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[alto];
        arreglo[alto] = temp;
        return i + 1;
    }

    public static void printArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
