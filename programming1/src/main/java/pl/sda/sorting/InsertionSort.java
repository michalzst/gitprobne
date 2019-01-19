package pl.sda.sorting;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=OGzPmgsI-pQ
 */


public class InsertionSort {
    private static void insertionSort(int[] arraySorted) {
        if(arraySorted.length <= 1) {
            return;
        }
        
        int temp;
        for (int j = arraySorted.length-1; j > 0; j--) {
            for (int i = 0; i <j ; i++) {
                if (arraySorted[i] > arraySorted[i+1]) {
                    temp = arraySorted[i + 1];
                    SortingUtils.swap(arraySorted, i, i + 1);
                }else{
                    SortingUtils.swap(arraySorted, i, i - 1);
                }
                }
        }
        for (int array:arraySorted) {
            System.out.println(array);
        }
    }

    public static void main(String[] args) {
        int arrayToSort[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        insertionSort(arrayToSort);
    }
}
