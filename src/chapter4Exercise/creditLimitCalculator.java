package chapter4Exercise;

import java.util.Scanner;

public class creditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNumber = 1, balance, charges, credit, creditLimit, newBalance;
        while (accountNumber != 0){
            System.out.print("Enter your account number: ");
            accountNumber = input.nextInt();

            System.out.print("Enter your balance: ");
            balance = input.nextInt();

            System.out.print("Enter total item charges for this month: ");
            charges = input.nextInt();

            System.out.print("Enter the total credit applied to the customer account: ");
            credit = input.nextInt();

            System.out.print("Enter customer allowed credit limit: ");
            creditLimit = input.nextInt();

            newBalance = balance + charges - credit;

            System.out.println("Your new balance is: " + newBalance);
            if(newBalance > creditLimit){
                System.out.println("Credit limit exceeded");
                break;
            }
        }
    }
}
