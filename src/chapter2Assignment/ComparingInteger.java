package chapter2Assignment;

import java.util.Scanner;

public class ComparingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int numSquared = number * number;

        if((number + numSquared) > 100){
            System.out.println("The number and it's square is greater than 100");
        }
        if((number + numSquared) == 100){
            System.out.println("The number and it's square is equal to 100");
        }
        if((number + numSquared) != 100){
            System.out.println("The number and it's square is not equal to 100");
        }
        if((number + numSquared) < 100) {
            System.out.println("The number and it's square is less than 100");
        }

    }
}
