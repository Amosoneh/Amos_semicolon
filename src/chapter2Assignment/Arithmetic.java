package chapter2Assignment;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        int firstSquare = firstNumber * firstNumber;
        int secondSquare = secondNumber * secondNumber;
        int sumOfTheirSquare = firstSquare + secondSquare;
        int differenceOfTheirSquare = firstSquare - secondSquare;

        System.out.println("The square of " + firstNumber + " and " + secondNumber + " is: "+firstSquare +" and "+ secondSquare );
        System.out.println("The sum of their square is: "+sumOfTheirSquare);
        System.out.println("The difference of their square is: "+differenceOfTheirSquare);


    }
}
