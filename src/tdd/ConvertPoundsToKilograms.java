package tdd;

import java.util.Scanner;

public class ConvertPoundsToKilograms {

	public static void main(String[] args){
	
	Scanner input = new Scanner (System.in);

	System.out.print("Enter a number in pounds:");
	double pounds = input.nextDouble();

	double numberInKg = pounds * 0.454;

	System.out.printf("%f pounds is %f kilograms", pounds, numberInKg);
	}
}