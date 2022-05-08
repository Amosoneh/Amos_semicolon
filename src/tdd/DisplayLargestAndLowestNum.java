package tdd;

import java.util.Scanner;

public class DisplayLargestAndLowestNum {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number or -1 to exit: ");
        int num = input.nextInt();

        while (num != -1){
            if(num > max){
                max = num;
            }
            else if(num < max){
                min = num;
            }
            System.out.print("Enter a number or -1 to exit: ");
            num = input.nextInt();
        }
        System.out.println("The largest number is: " +max);
        System.out.println("The smallest number is: " +min);
    }

}
