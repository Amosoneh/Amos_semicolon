package chapter4Exercise;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles;
        int gallons = 0;
        int totalMile = 0;
        int totalGallon = 0;
        int tripcounter = 0;
        double milesPerGallon;
        double totalMilesPerGallon = 0.0;

        System.out.print("Enter trip 1 mileage or -1 to exit: ");
        miles = input.nextInt();
        //mile++;1
        if (miles != -1) {
            System.out.print("Enter trip 1 gallons: ");
            gallons = input.nextInt();
            tripcounter++;
        }
        //gallon++;





        while (miles != -1) {

            totalMile += miles;
            totalGallon += gallons;
            totalMilesPerGallon =(double) totalMile / totalGallon;

            milesPerGallon = (double) miles / gallons;

            System.out.printf("Trip %d's miles per gallon is: %.2f%n%n", tripcounter, milesPerGallon);

            if (tripcounter > 1) {
                System.out.printf("  Total miles of your %d trips is %d%n", tripcounter, totalMile);
                System.out.printf("  Total gallons of your %d trips is %d%n", tripcounter, totalGallon);
                System.out.printf("  Total miles per gallon of your %d trips is %.1f%n%n", tripcounter, totalMilesPerGallon);
            }
            tripcounter++;
            System.out.printf("Enter trip %d mileage or -1 to exit: ", tripcounter);
            miles = input.nextInt();
            if (miles != -1) {
                System.out.printf("Enter trip %d gallons: ", tripcounter);
                gallons = input.nextInt();
            }

        }
        if(totalMile != 0 ){
            System.out.printf("\nFinal total miles driven is: %d%n", totalMile);
            System.out.printf("\nFinal total gallons used is: %d%n", totalGallon);
            System.out.printf("\nFinal total miles per gallon is: %.1f%n", totalMilesPerGallon);
        }
        else {
            System.out.println("No trip information was entered");
        }
    }
}