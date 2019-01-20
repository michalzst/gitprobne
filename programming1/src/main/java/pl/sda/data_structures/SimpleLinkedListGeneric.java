package pl.sda.data_structures;

/**
 * https://visualgo.net/en/list
 * <p>
 * Zaimplementuj liste wiazana jednokierunkowa, przechowujaca dane typu int
 * Lista powininna posiadac nastepujace metody:
 * - prepend - dodaje element na poczatek listy
 * - append - dodaje element na koniec listy
 * - insert - dodaje element na zadanym indeksie
 * - remove - usuwa element na podanym indeksie z listy
 * - getSize() - zwraca ilosc elementow w liscie
 * - isEmpty - sprawdza czy lista jest pusta
 */
public class SimpleLinkedListGeneric<T> {
    private Node head;
    private Node tail;
    private int size;

    public void remove(int index) {
        if (isEmpty()) {
            return;
        }
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if (index == 0) {
            Node temp = head;
            head = head.nextNode;
            temp = null;
        } else if (index == size - 1) {
            Node previous = head;
            Node current = head.nextNode;

            while (current.nextNode != null) {
                previous = previous.nextNode;
                current = current.nextNode;
            }

            previous.nextNode = null;
            current = null;
            tail = previous;
        } else {
            Node previous = head;

            for (int i = 0; i < index - 1; i++) {
                previous = previous.nextNode;
            }

            Node deletedNode = previous.nextNode;
            previous.nextNode = deletedNode.nextNode;
            deletedNode = null;
        }
        size--;
    }


    public T getIndex(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.nextNode;
        }
        return (T) tmp.value;
    }


    public void insert(T element, int index) {
        if (isEmpty()) {
            return;
        }
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if (index == 0) {
            prepend(element);
        } else if (index == size) {
            append(element);
        } else {
            Node pre = head;
            for (int i = 0; i < index - 1; i++) {
                pre = pre.nextNode;
            }
            Node aft = pre.nextNode;
            Node newNode = new Node(element);
            newNode.nextNode = aft;
            pre.nextNode = newNode;
            size++;
        }
    }


    public void append(T element) {   //dodaje element do kolejki
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

    public void prepend(T element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node tmp = head;
            newNode.nextNode = tmp;
            head = newNode;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<T> {
        T value;
        Node nextNode;

        Node(T value) {
            this.value = value;
        }
    }
}
