package tdd;

import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {
        int randomNumber = 20;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to guess: ");
        int userGuess = input.nextInt();
        int counter = 1;
        while(counter != 0){
            if (userGuess > randomNumber){
                System.out.println("Too high, try again");
                System.out.print("\nEnter a number to guess: ");
                userGuess = input.nextInt();
            }
            else if(userGuess < randomNumber){
                System.out.println("Too low, try again");
                System.out.print("\nEnter a number to guess: ");
                userGuess = input.nextInt();
            }
            else if(userGuess == randomNumber){
                System.out.println("Your guess is correct");
                break;

            }
        }

    }
}
