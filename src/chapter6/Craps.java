package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status{CONTINUE, LOST, WON}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    static Status gameStatus;
    static int bankBalance = 1000;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int myPoint = 0;
        System.out.println("Enter wager to play");
        int wager = input.nextInt();
        while (wager!=0) {
            while (wager > bankBalance) {
                System.out.println("Enter valid wager");
                wager = input.nextInt();
            }
            int sumOfDice = rollDice();

            switch (sumOfDice) {
                case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
                case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
                default -> {
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Point is %d%n", myPoint);
                }
            }
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();

                if (sumOfDice == myPoint) gameStatus = Status.WON;
                else if (sumOfDice == SEVEN) gameStatus = Status.LOST;

            }
            if (gameStatus == Status.WON) {
                System.out.println("Player wins");
                bankBalance += wager;
                System.out.printf("Your new balance = %d%n", bankBalance);
            } else {
                System.out.println("Player loses");
                bankBalance -= wager;
                System.out.printf("Your new balance = %d%n", bankBalance);
            }
            chatter();
            if (bankBalance != 0) {
                System.out.println("Enter wager to play again or 0 to cash out: ");
                wager = input.nextInt();
                if(wager == 0) System.out.println("Total balance is " + bankBalance + "\nProceed to cash out point for your payment");
            }
                else System.out.println("Sorry. You are busted.\nLoad your account to play");

        }


    }
    private static void chatter(){
        if (gameStatus == Status.WON) System.out.println("You're up big. Now's the time to cash in your chips");
        if (gameStatus == Status.LOST) System.out.println("Oh, you're going for broke, huh?");
        if (gameStatus == Status.CONTINUE) System.out.println("Aw c'mon, there is still a chance!");
        if (bankBalance == 0) System.out.println("You are broke bor.");
    }

    private static int rollDice(){
        int firstDie = 1 + randomNumbers.nextInt(6);
        int secondDie = 1 + randomNumbers.nextInt(6);
        int sum = firstDie + secondDie;
        System.out.printf("Player rolled %d + %d = %d%n",firstDie,secondDie,sum);
        return sum;
    }
}
