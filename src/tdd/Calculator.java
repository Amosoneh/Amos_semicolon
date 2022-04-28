package tdd;

import java.util.Scanner;

public class Calculator{

	public static void main(String... args){
		Scanner input = new Scanner (System.in);

		System.out.print("Enter first number:");
		int firstNumber = input.nextInt();

		System.out.print("Enter second number:");
		int secondNumber = input.nextInt();

		int sum = firstNumber + secondNumber;
		int difference = firstNumber - secondNumber;
		int product = firstNumber * secondNumber;
		int division = firstNumber / secondNumber;

		System.out.printf("The sum of the numbers is %d%n",sum );
		System.out.printf("The difference between the numbers is %d%n", difference );
		System.out.printf("The product of the numbers is %d%n", product );
		System.out.printf("The quotient of the numbers is %d%n", division );
	}
}


