package pl.sda.data_structures;

/**
 * https://visualgo.net/en/list
 * <p>
 * Zaimplementuj kolejke, przechowujaca dane typu int
 * Kolejka powininna posiadac nastepujace metody:
 * - enqueue - dodaje element do kolejki
 * - dequeue - usuwa element z kolejki
 * - peek - pozwala podejrzec element na poczatku kolejki
 * - isEmpty - sprawdza czy kolejka jest pusta
 */
public class SimpleQueue {
    private static final int NOT_FOUND = -1;
    private Node head;
    private Node tail;
    private int size;

    public int dequeue() {
        if (isEmpty()) {
            return NOT_FOUND;
        } else {
            Node tmp = head;
            head = head.nextNode;
            int returnTempValue = tmp.value;
            tmp = null;
            size--;
            return returnTempValue;
        }
    }

    public void enqueue(int element) {   //dodaje element do kolejki
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

    public int peek() {
        return head == null ? NOT_FOUND : head.value;
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
