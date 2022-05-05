package chapter2Assignment;

import java.util.Scanner;

public class SmallestAndLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = input.nextInt();
        int smallest =0;
        int largest =0;

        int sum = firstNumber + secondNumber + thirdNumber;
        int product = firstNumber * secondNumber * thirdNumber;
        int average = sum / 3;
        if(firstNumber < secondNumber && firstNumber < thirdNumber){
            smallest = firstNumber;
        }
        if(secondNumber < firstNumber && secondNumber < thirdNumber){
            smallest = secondNumber;
        }
        if(thirdNumber < firstNumber && thirdNumber < secondNumber){
            smallest = thirdNumber;
        }
        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            largest = firstNumber;
        }
        if(secondNumber > firstNumber && secondNumber > thirdNumber){
            largest = secondNumber;
        }
        if(thirdNumber > firstNumber && thirdNumber > secondNumber){
            largest = thirdNumber;
        }
        System.out.printf("The sum of the three numbers are: %d%n",sum);
        System.out.printf("The product of the three numbers are: %d%n",product);
        System.out.printf("The average of the three numbers are: %d%n",average);
        System.out.println("The largest numbers is: "+largest);
        System.out.println("The smallest numbers is: "+smallest);
    }
}
