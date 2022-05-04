package tdd;

import java.util.Scanner;

public class RaisedToPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long result = 1;
        System.out.println("Enter the base number: ");
        int base = input.nextInt();
        System.out.println("Enter the power: ");
        int power = input.nextInt();
        for(; power != 0; power--){
            //System.out.print(exponential);
            result *= base;
        }
        System.out.println("Answer = "+ result);
    }
}
