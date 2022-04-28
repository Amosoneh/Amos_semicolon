package tdd;


import java.util.Scanner;

//Psuedocode
//prompt a user to enter a score
//if the score is from 90 to 100, print your grade is A
//if the score is from 80 and less than 90, print your grade is B
//if the score is from 70 and less than 80, print your grade is C
//if the score is from 60 and less than 70, print your grade is D
//if the score is less than 60, print your grade is F
public class ScoreRanges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = input.nextInt();

        if(score >= 90 && score <= 100){
            System.out.println("Your grade is A");
        }

        if(score >= 80 && score < 90){
            System.out.println("Your grade is B");
        }

        if(score >= 70 && score < 80){
            System.out.println("Your grade is C");
        }

        if(score >= 60 && score < 70){
            System.out.println("Your grade is D");
        }

        if(score < 60){
            System.out.println("Your grade is F");
        }
    }
}
