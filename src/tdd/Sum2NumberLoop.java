package tdd;

import java.util.Scanner;

public class Sum2NumberLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        while(counter <= 2){
            System.out.print("Enter first number: ");
            int firstNumber = input.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = input.nextInt();
            int sum = firstNumber + secondNumber;
            System.out.println("The sum of the two numbers is "+ sum);
            System.out.println("Do you want to perform the operation again? \nif yes, enter 1 or enter 2 to exit: ");
            int decision = input.nextInt();
            if (decision == 1){
                continue;
            }
            else {
                break;
            }


        }
    }

}
