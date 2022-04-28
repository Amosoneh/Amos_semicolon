package tdd;

import java.util.Scanner;

public class AmountOfEnergyNeeded {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.print("Enter the amount of water in kg:");
		float M = input.nextFloat();

		System.out.print("Enter the initial temperature:");
		float initialTemperature = input.nextFloat();

		System.out.print("Enter the final temperature:");
		float finalTemperature = input.nextFloat();

		float Q = M * (finalTemperature - initialTemperature) * 4184;

		System.out.printf("The energy needed is %f%n", Q);

	}

}