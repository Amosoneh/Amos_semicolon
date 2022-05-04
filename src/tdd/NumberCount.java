package tdd;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number or -1 to exit: ");
        int num = input.nextInt();
        while (num != -1) {

            if (num < 0) {
                countNegative++;
            }
            if (num > 0) {
                countPositive++;
            }
            if (num == 0) {
                countZero++;

            }
            System.out.print("Enter a number or -1 to exit: ");
            num = input.nextInt();
        }

        System.out.println("Total number of positive numbers is " + countPositive);
        System.out.println("Total number of negative numbers is " + countNegative);
        System.out.println("Total number of zero numbers is " + countZero);


    }
}
