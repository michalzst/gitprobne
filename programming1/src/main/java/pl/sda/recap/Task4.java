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
}
