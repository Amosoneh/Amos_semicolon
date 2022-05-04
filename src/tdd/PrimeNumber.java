package tdd;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int userInput = input.nextInt();

//        if (userInput > 1  && userInput % 2 == 0 && userInput % 3 == 0 && userInput % 5 == 0 && userInput % 7 == 0) {
//            System.out.println(userInput + " is a prime number.");
//        }
//        else {
//            System.out.println(userInput + " is not a prime number.");
//        }
        boolean flag = false;
        for (int i = 2; i <= userInput / 2; i++){
            if(userInput % i == 0){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(userInput + " is a prime number.");
        }
        else {
            System.out.println(userInput + " is not a prime number.");
        }

    }

}
