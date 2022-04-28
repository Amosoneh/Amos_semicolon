package tdd;
//write an app that ask for a score,
// if the user enter a score above 55 and above, it show pass.
// if the user enters below 55, it shows fail

//Psuedocode

//prompt a user to enter a score
//if the score is 55 and above, print pass
//if the score is below 55, print fail


import java.util.Scanner;

public class PassMark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = input.nextInt();

        if(score >= 55){
            System.out.println("You passed");
        }
        if(score < 55){
            System.out.println("You failed");
        }

    }


}
