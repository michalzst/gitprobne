package pl.sda.data_structures;

public class SimpleQueueDemo {
    public static void main(String[] args) {
        SimpleQueue simpleQueue = new SimpleQueue();

        System.out.println("======ENQUEUE=========");
        System.out.println(simpleQueue.isEmpty() ? "Empty " : "Not empty " + simpleQueue.getSize());
        simpleQueue.enqueue(100);
        simpleQueue.enqueue(10);
        simpleQueue.enqueue(1011);
        simpleQueue.enqueue(111);
        simpleQueue.enqueue(110);
        System.out.println(simpleQueue.isEmpty() ? "Empty " : "Not empty " + simpleQueue.getSize());
        System.out.println("======PEEK======");
        System.out.println(simpleQueue.peek());

        System.out.println("====DEQUEUE====");
        while (!simpleQueue.isEmpty()) {
            int deletedValue = simpleQueue.dequeue();
            System.out.println(deletedValue);
        }
    }
}

