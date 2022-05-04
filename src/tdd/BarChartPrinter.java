package tdd;

import java.util.Scanner;

public class BarChartPrinter {
    public static void main(String[] args) {
        int[] number = new int[5] ;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < number.length; i++) {
            System.out.print("Enter number " + (1+i) + ": ");
            number[i] = input.nextInt();
        }

        for(int i = 0; i < number.length; i++) {

            System.out.print("Number " + (i+1) + ": ");
            for(int j =0; j < number[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
