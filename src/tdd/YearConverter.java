package tdd;

import java.util.Scanner;

public class YearConverter {

	public static void main(String[] args){
	
	Scanner input = new Scanner (System.in);

	System.out.print("Enter number of minutes:");
	int minutes = input.nextInt();

	int numberOfYears = minutes / 525600;
	
	int numberOfDays = minutes % 525600 / 1440;

	System.out.printf("%d minutes is approximately %d years and %d days",minutes, numberOfYears, numberOfDays);
	}
}