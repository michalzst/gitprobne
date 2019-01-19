package pl.sda.recap;

public class Task1Demo {
    public static void main(String[] args) {
        //Napisz program, który wypisze co drugi element tablicy przekazanej jako parametr

        int[] tablica =new int[10];

        for (int i = 0; i < tablica.length ; i++) {
            tablica[i]=i;
            System.out.println(tablica[i++]);
        }

    }
}
