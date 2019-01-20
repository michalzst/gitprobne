package pl.sda.data_structures;

import java.util.Arrays;

/**
 *  Zaimplementuj liste wiazana jednokierunkowa, przechowujaca dane typu int
 *  Lista powininna posiadac nastepujace metody:
 *  - add - dodaje element na koniec listy
 *  - getSize() - zwraca ilosc elementow w liscie
 *  - isEmpty - sprawdza czy lista jest pusta
 */
public class SimpleArrayList {
    private static final int DEFAULT_CAPACITY =10;
    private static final int NOT_FOUND = -1;
    private int[] content;
    private int size;

    SimpleArrayList(){
        content = new int[DEFAULT_CAPACITY];
    }

    public void add(int element){
        if (size==content.length){
            content= Arrays.copyOf(content, size*2);
        }
        content[size]=element;
        size++;
    }

    public int getSize() {
        return size;
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return content[index];
    }


    public boolean isEmpty() {
        return size == 0;
    }
}
