package pl.sda.recap;

public class Task1Demo {
    private static void metoda(int[] arrayToBePrinted) {
        for (int i = 0; i < arrayToBePrinted.length; i += 2) {
            System.out.println(arrayToBePrinted[i]);
        }
    }

    private static void printOddOrEven(int[] arrayToBePrinted, boolean printOdd) {
        for (int i = 0; i < arrayToBePrinted.length-1; i++) {
            if (printOdd && arrayToBePrinted[i] % 2 == 1) {
                System.out.println(arrayToBePrinted[i]);
            }
            if (printOdd && arrayToBePrinted[i] % 2 == 0) {
                System.out.println(arrayToBePrinted[i]);
            }
        }
    }


    public static void main(String[] args) {
        //Napisz program, który wypisze co drugi element tablicy przekazanej jako parametr
        int[] arrayToPrint = {8, 5, 15, 300, 32, 48};

//        metoda(arrayToPrint);
        printOddOrEven(arrayToPrint, true);

    }

}
