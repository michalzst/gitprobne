package pl.sda.data_structures;

public class SimpleArrayListDemo {
    public static void main(String[] args) {
        SimpleArrayList simpleArrayList = new SimpleArrayList();

        simpleArrayList.add(2);
        simpleArrayList.add(3);
        simpleArrayList.add(4);
        System.out.println((simpleArrayList.isEmpty() ? "Empty" : "Not empty") +
                "\nList size: " + simpleArrayList.getSize());
        System.out.println(simpleArrayList.get(2));

    }
}
