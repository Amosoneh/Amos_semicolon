package chapter2Assignment;

import java.util.Scanner;

public class PosNegZeroValueCount {
    public static void main(String[] args) {
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        if(num1 > 0) countPositive++;
        else if (num1 < 0) countNegative++;
        else countZero++;

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        if(num2 > 0) countPositive++;
        else if (num2 < 0) countNegative++;
        else countZero++;

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        if(num3 > 0) countPositive++;
        else if (num3 < 0) countNegative++;
        else countZero++;

        System.out.print("Enter the fourth number: ");
        int num4 = input.nextInt();
        if(num4 > 0) countPositive++;
        else if (num4 < 0) countNegative++;
        else countZero++;

        System.out.print("Enter the fifth number: ");
        int num5 = input.nextInt();
        if(num5 > 0) countPositive++;
        else if (num5 < 0) countNegative++;
        else countZero++;

//        if (num1 > 0 || num2 > 0 || num3 > 0 || num4  > 0 || num5 > 0) {
//            countPositive++;
//        }
//        if (num1 < 0 || num2 < 0 || num3 < 0 || num4  < 0 || num5 < 0) {
//            countNegative++;
//        }
//        if (num1 == 0 || num2 == 0 || num3 == 0 || num4  == 0 || num5 == 0) {
//            countZero++;
//        }
        System.out.printf("The number of positive numbers input is: %d%n",countPositive);
        System.out.printf("The number of negative numbers input is: %d%n",countNegative);
        System.out.printf("The number of zero input is: %d%n",countZero);
    }
}


