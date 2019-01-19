package pl.sda.recap;

public class Task1Demo {
    static int metoda(int dlugosc) {
        int[] tablica = new int[dlugosc];
        for (int i = 0; i < tablica.length-1; i++) {
            tablica[i] = i;
            System.out.println(tablica[i++]);
        }
        return dlugosc;
    }

    public static void main(String[] args) {
        //Napisz program, który wypisze co drugi element tablicy przekazanej jako parametr


        System.out.println(metoda(100));


    }

}
