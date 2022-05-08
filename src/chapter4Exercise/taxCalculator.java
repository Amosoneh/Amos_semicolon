package chapter4Exercise;

import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int earning ;
        String citizenName ;
        double taxRate;
        int counter = 1;
        double totalTax;

        while (counter <= 3){
            System.out.print("Enter citizen name: ");
            citizenName = input.next();


            System.out.print("Enter " + citizenName+ " earnings: ");
            earning = input.nextInt();


            if (earning <= 30_000){
                taxRate = 0.15;
            }
            else {
                taxRate = 0.2;
            }
            totalTax = earning * taxRate;
            System.out.printf("%s total tax is: %.2f%n",citizenName, totalTax);
            counter++;
            System.out.println();

        }

    }
}
