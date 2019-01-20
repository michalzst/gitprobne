package pl.sda.data_structures;

/**
 *  Zaimplementuj liste wiazana jednokierunkowa, przechowujaca dane typu int
 *  Lista powininna posiadac nastepujace metody:
 *  - add - dodaje element na koniec listy
 *  - getSize() - zwraca ilosc elementow w liscie
 *  - isEmpty - sprawdza czy lista jest pusta
 */
public class SimpleArrayList {
    private static final int NOT_FOUND = -1;
    private Node head;
    private Node tail;
    private int size;

    public void add(int element) {   //dodaje element do kolejki
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            Node tmp = tail;
            tail = newNode;
            tmp.nextNode = tail;
        }
        size++;
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node {
        int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
        }
    }
}
