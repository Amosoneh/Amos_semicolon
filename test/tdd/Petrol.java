package tdd;

import java.util.Scanner;
public class Petrol {
	public static void main(String[] args){
		PetrolPurchase purchase1 = new PetrolPurchase("Total filling station, Ogba", "diesel", 5, 200.00, 5.0);
		System.out.printf("I bought %s liters of %s at %s at the price of %s%n per Liter at an interest rate of 5.0 percent for %.2f", purchase1.getQuantity(), purchase1.getPetrolType(), purchase1.getStationLocation(), purchase1.getPricePerLiter(), purchase1.getPurchasedAmount());
	}
}


