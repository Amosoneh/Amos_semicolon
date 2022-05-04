package tdd;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        int userInput = input.nextInt();
        int factor = 1;
        for(int i = 1; i <= userInput; i++){

            factor = factor * i;

        }
        System.out.print("The factorial value of "+userInput+ " is: "+ factor);
    }
}
