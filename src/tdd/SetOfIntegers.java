package tdd;

import java.util.Scanner;

public class SetOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int i;
        int evenNumber = 0;
        int oddNumber = 0;
        System.out.println("How many numbers do you want to input: ");
        i = input.nextInt();
        for(;;){
            i--;
            System.out.println("Please input a number: ");
            num = input.nextInt();

            if (num < 0){
                System.out.println("Invalid input");
            }

            else if (num % 2 == 0){
                evenNumber += num;
            }
            else {
                oddNumber += num;
            }
            if (i == 0){
                System.out.println("Sum of even numbers is: " + evenNumber);
                System.out.println("Sum of odd numbers is: " + oddNumber);
                break;
            }
        }
    }
}
