package pl.sda.sorting;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=xWBP4lzkoyM
 */
public class SelectionSort {
    private static void selectionSort(int[]arraySorted){
        int firstIndex=0;

        while (firstIndex<arraySorted.length){
            int intexMin = firstIndex;
            for (int i = 0; i <arraySorted.length-1 ; i++) {
                if (arraySorted[i]< intexMin) {
                    intexMin = i;
                }
                SortingUtils.swap(arraySorted,i,intexMin);
            }
            firstIndex++;
        }

        for (int array:arraySorted) {
            System.out.println(array);
        }
    }
    public static void main(String[] args) {
        int arrayToSort[] = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        selectionSort(arrayToSort);
    }
}
