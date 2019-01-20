package pl.sda.data_structures;

/**
 * https://visualgo.net/en/list
 * <p>
 * Zaimplementuj stos, przechowujacy dane typu int
 * Stos powinien posiadac nastepujace metody:
 * - pop - sciaga element ze stosu
 * - push - odklada element na stos
 * - peek - pozwala podejrzec element na wierzchu stosu
 * - isEmpty - sprawdza czy stos jest pusty
 */
public class SimpleStack {
    private static final int NOT_FOUND = -1;
    private  Node head;
    private int size;

    public int peek() {
        return head == null ? NOT_FOUND : head.value;
    }

    public int pop() {
        if (isEmpty()) {
            return NOT_FOUND;
        }else {
            Node tmp = head;
            head = tmp.nextNode;
            int returnTempValue = tmp.value;
            tmp = null;
            size--;
            return returnTempValue;
        }
    }

    public void push(int element) {
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

    private static class Node {
        int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
        }
    }
}
