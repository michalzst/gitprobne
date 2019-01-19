package pl.sda.recap;

import java.util.Scanner;

public class Task2Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                int number =Integer.parseInt(input);
                String message = number %2==0 ?"parzysta":"nieprzysta";
                System.out.println(String.format("Liczba jest %s", message));
//                if (number%2==0){
//                    System.out.println("Liczba jest parzysta");
//                }else{
//                    System.out.println("Liczba jest nieparzysta");
//                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input");
            }

        }
    }
}