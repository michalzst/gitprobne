package pl.sda.recap;

public class Task4 implements Runnable{

    private final String name;
    private final int numberOfRepeats;


    Task4(String name, int numberOfRepeats){
        this.name=name;
        this.numberOfRepeats=numberOfRepeats;
    }

    public void run() {
        for (int i = 0; i < numberOfRepeats; i++) {
            System.out.println("Hello from thread named " + name+" wyswietlone po raz "+i);
        }
    }

    public static void main(String[] args) {
        Task4 task1 = new Task4("Watek 1",100);
        Task4 task2 = new Task4("Watek 2",10);

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}
