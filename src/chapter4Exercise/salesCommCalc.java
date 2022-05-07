package chapter4Exercise;

import java.util.Scanner;

public class salesCommCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int item = input.nextInt();

        System.out.print("Enter the item value: ");
        double value = input.nextDouble();
        while (item != 0){
            double earnings = (200 + 0.09 * value) * item;
            System.out.printf("Your earnings for last week is: %.2f", earnings);
            break;
        }

    }
}
