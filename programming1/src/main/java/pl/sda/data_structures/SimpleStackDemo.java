package pl.sda.data_structures;

public class SimpleStackDemo {
    public static void main(String[] args) {
        SimpleStack simpleStack = new SimpleStack();

        //peek
//        System.out.println("=========PEEK=========");
//        System.out.println("IsEmpty: " + ( simpleStack.isEmpty() ? "empty" : "not empty"));
//        System.out.println("PEEK " + simpleStack.peek());

        //push
        System.out.println("\n=========PUSH=========");
        simpleStack.push(31);
        simpleStack.push(13);
        simpleStack.push(250);
        //System.out.println("IsEmpty: " + ( simpleStack.isEmpty() ? "empty" : "not empty"));
        System.out.println("PEEK " + simpleStack.peek());

        //pop
        System.out.println("\n=========POP==========");
        while (!simpleStack.isEmpty()){
            System.out.println("IsEmpty: " + ( simpleStack.isEmpty() ? "empty" : "not empty"));
            System.out.println("PEEK " + simpleStack.peek());
            simpleStack.pop();
        }
//        System.out.println("IsEmpty: " + ( simpleStack.isEmpty() ? "empty" : "not empty"));
//        System.out.println("PEEK " + simpleStack.peek());
    }
}
