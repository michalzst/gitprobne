package pl.sda.sorting;

import java.util.Arrays;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=xWBP4lzkoyM
 */
public class SelectionSort {

    private static void selectionSort(int[] arraySorted) {
        if (arraySorted.length <= 1) {
            return;
        }
        int firstIndex = 0;

        while (firstIndex < arraySorted.length) {
            int intexMin = firstIndex;
            for (int i = firstIndex; i < arraySorted.length; i++) {
                if (arraySorted[i] < arraySorted[intexMin]) {
                    intexMin = i;
                }
            }
            SortingUtils.swap(arraySorted, firstIndex, intexMin);
            firstIndex++;
        }
    }

    public static void main(String[] args) {
        int arrayToSort[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("Initial: " + Arrays.toString(arrayToSort));
        selectionSort(arrayToSort);
        System.out.println("Sorted: " + Arrays.toString(arrayToSort));
    }
}
