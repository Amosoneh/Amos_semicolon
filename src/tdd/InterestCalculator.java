package tdd;

import java.util.Scanner;
public class InterestCalculator{
	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter balance and interest rate: ");
		int balance = input.nextInt();
		double interestRate = input.nextDouble();

		double interest = balance * (interestRate/1200);

		System.out.printf("The interest is %f%n",interest);		
		
		
	}
}