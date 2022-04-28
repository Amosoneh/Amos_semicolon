package tdd;

import java.util.Scanner;
public class InvestmentValue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();

		System.out.print("Enter annual interest in percentage: ");
		double annualInterest = input.nextDouble();

		System.out.print("Enter number of years: ");
		int numberOfYears = input.nextInt();

		double monthlyInterestRate = 1 + (annualInterest / 100);

		
		double futureInvestmentValue = investmentAmount * Math.pow(monthlyInterestRate, numberOfYears);
		System.out.printf("The cost of driving is $%.2f%n", futureInvestmentValue);
	}

}