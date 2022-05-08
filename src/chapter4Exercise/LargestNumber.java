//initialize variables
//int num;
//int largest = 0;
//int counter = 1;
//prompt user to enter integer
//initialize counter to 1
//while counter is less than 10
//  if integer entered is greater than largest variable initialize,
//      then largest is equal to number, else the number remain retain it's value.
//  counter increment;
//print the largest number

package chapter4Exercise;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int largest = 0;
        int counter = 1;
        while (counter < 10){
            System.out.println("Enter an integer: ");
            num = input.nextInt();

            if(num > largest){
                largest = num;
            }
            else {
                num = num;
            }
            counter++;
        }
        System.out.println("The largest integer is: "+ largest);

    }
}
