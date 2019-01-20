package pl.sda.sorting;

import java.util.Arrays;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=OGzPmgsI-pQ
 */


public class InsertionSort {
    private static void insertionSort(int[] arraySorted) {
        if (arraySorted.length <= 1) {
            return;
        }

        int i, j, unsortedElement;
        for (j = 1; j < arraySorted.length; j++) {
            unsortedElement = arraySorted[j];
            i = j - 1;
            while (i >= 0 && arraySorted[i] > unsortedElement) {
                arraySorted[i] = arraySorted[i + 1];
                j = j - 1;
            }
            arraySorted[i + 1] = unsortedElement;
        }
    }

    public static void main(String[] args) {
        int arrayToSort[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("Initial: " + Arrays.toString(arrayToSort));
        insertionSort(arrayToSort);
        System.out.println("Sorted: " + Arrays.toString(arrayToSort));

    }
}
