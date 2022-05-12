package tdd;

import java.util.Scanner;

public class IVRSWITCH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for English:\n\t2 for Igbo:\n\t3 for French:\n\t4 for Yoruba:");
        int userInput = input.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Enter 1 for Data:\n2 for Transfer:");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Data");
                        break;
                    case 2:
                        System.out.println("Transfer");
                        break;
                    default:
                        System.out.println("Wrong selection");
                        break;
                }break;
            case 2:
                System.out.println("Enter 1 for Sharing:\n2 for Caring:");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Sharing");
                        break;
                    case 2:
                        System.out.println("Caring");
                        break;
                    default:
                        System.out.println("Wrong selection");
                        break;
                }break;
            case 3:
                System.out.println("Enter 1 for Egg:\n2 for Champagne:");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Egg");
                        break;
                    case 2:
                        System.out.println("Champagne");
                        break;
                    default:
                        System.out.println("Wrong selection");
                        break;
                }break;
            case 4:
                System.out.println("Enter 1 for Ewa:\n2 for Agoyi:");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Ewa");
                        break;
                    case 2:
                        System.out.println("Agoyi");
                        break;
                    default:
                        System.out.println("Wrong selection");
                        break;
                }
        }
    }
}
