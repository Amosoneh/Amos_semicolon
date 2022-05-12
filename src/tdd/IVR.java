package tdd;

import java.util.Scanner;

public class IVR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for English:\n\t2 for Igbo:\n\t3 for French:\n\t4 for Yoruba:");
        int userInput = input.nextInt();
        if(userInput == 1){
            System.out.println("Enter 1 for Data:\n2 for Transfer:");
            userInput = input.nextInt();
            if(userInput == 1){
                System.out.println("Data");
            }
            else {
                System.out.println("Transfer");
            }
        }
        else if(userInput == 2){
            System.out.println("Enter 1 for Sharing:\n2 for Caring:");
            userInput = input.nextInt();
            if(userInput == 1){
                System.out.println("Sharing");
            }
            else {
                System.out.println("Caring");
            }

        }
        else if(userInput == 3){
            System.out.println("Enter 1 for Egg:\n2 for Champagne:");
            userInput = input.nextInt();
            if(userInput == 1){
                System.out.println("Egg");
            }
            else {
                System.out.println("Champagne");
            }

        }
        else if(userInput == 4){
            System.out.println("Enter 1 for Ewa:\n2 for Agoyi:");
            userInput = input.nextInt();
            if(userInput == 1){
                System.out.println("Ewa");
            }
            else {
                System.out.println("Agoyi");
            }

        }
    }
}
