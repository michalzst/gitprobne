package pl.sda.data_structures;

public class SimpleLinkedListDemo {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();

        simpleLinkedList.append(101);

        for (int i = 0; i < 100; i++) {
            simpleLinkedList.insert(i+1, i);
        }

        for (int i = 0; i < simpleLinkedList.getSize() ; i++) {
            System.out.println(simpleLinkedList.getIndex(i));
        }

        simpleLinkedList.remove(50);

        for (int i = 0; i < simpleLinkedList.getSize() ; i++) {
            System.out.println(simpleLinkedList.getIndex(i));
        }
    }
}
