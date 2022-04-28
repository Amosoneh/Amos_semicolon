package tdd;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int userInput = input.nextInt();

        if (userInput % 2 == 0) {
            System.out.printf("%d is an even number", userInput);
        } else {
            System.out.printf("%d is an odd number", userInput);
        }
    }
}
