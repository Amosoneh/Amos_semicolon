package tdd;

import java.util.Scanner;

public class MysteryNumber {
    public static void main(String... args){
        int mysteryNumber = 20;

        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Guess the mystery number: ");
        int number = inputNumber.nextInt();

        if( number > mysteryNumber){
            System.out.println("Your guess is too high");
        }
        if(number < mysteryNumber){
            System.out.println("Your guess is too low");
        }
        else if(number == mysteryNumber){
            System.out.println("Your guess is correct");
        }
    }

}
