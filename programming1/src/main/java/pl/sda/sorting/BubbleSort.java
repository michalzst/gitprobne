package pl.sda.sorting;

import java.util.Arrays;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=nmhjrI-aW5o
 */
public class BubbleSort {
    private static void bubbleSort(int[] arraySorted) {
        if (arraySorted.length <= 1) {
            return;
        }
        for (int j = arraySorted.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arraySorted[i] > arraySorted[i + 1]) {
                    SortingUtils.swap(arraySorted, i, i + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arrayToSort[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("Initial: " + Arrays.toString(arrayToSort));
        bubbleSort(arrayToSort);
        System.out.println("Sorted: " + Arrays.toString(arrayToSort));
    }
}
