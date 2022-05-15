package tdd;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {
    static Random randomGenerator = new Random();
    private static int firstNum;
    private static int secondNum;
    private static int correct = 0;
    private static int wrong = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many questions do you want: ");
        int userInput = input.nextInt();
        int i = 1;
        while ( i <= userInput){
            generateRandomNum();
            createQuizAndAnswer();
            i++;
        }


        int total = correct - wrong;
        System.out.printf("You got %d correct answer and %d wrong answer.\nYour total score is %d", correct, wrong, total);


    }
    private static void generateRandomNum(){
        for (int i = 0; i < 10; i++){
            firstNum = (int)(Math.random() * 10 + 1);
            secondNum = (int)(Math.random() * 10 + 1);
        }
    }
    private static void createQuizAndAnswer(){
        Scanner input = new Scanner(System.in);
        char operator = getRandomOperator();
        int correctAnswer=0;
        for (int i = 0; i < 1; i++){
            System.out.printf("%2d %c %2d = ", firstNum,operator, secondNum);
            switch (operator){
                case '+' -> correctAnswer = firstNum + secondNum;
                case '*' -> correctAnswer = firstNum * secondNum;
                case '/' -> correctAnswer = firstNum / secondNum;
                case '-' -> correctAnswer = firstNum - secondNum;
            }
            int userAnswer = input.nextInt();
            if (userAnswer == correctAnswer) correct++;
            else wrong++;
        }
    }
    private static char getRandomOperator(){
        String operators = "+-*/";
        return operators.charAt(randomGenerator.nextInt(operators.length()));
    }

}

