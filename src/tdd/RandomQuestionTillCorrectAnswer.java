package tdd;

import java.util.*;

public class RandomQuestionTillCorrectAnswer {
    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);
    private static int firstNumber;
    private static int secondNumber;
    private static int correct = 0;
    private static int wrong = 0;
    private static int correctAns = 0;
    public static void main(String[] args) {
        System.out.print("How many questions do you want: ");
        int userInput = input.nextInt();

        while (correct != userInput ) {
            getRandomNumber();
            createTest();
        }
        System.out.printf("You got %d correct answer and %d wrong answer.", correct, wrong);
    }
    private static void createTest(){
        String operators = "+*-/";
        char operator = operators.charAt(rand.nextInt(operators.length()));
        for (int index = 0; index < 1; index++) {
            System.out.printf("%2d %c %2d = ", firstNumber, operator, secondNumber);
            switch (operator) {
                case '+' -> correctAns = firstNumber + secondNumber;
                case '*' -> correctAns = firstNumber * secondNumber;
                case '/' -> correctAns = firstNumber / secondNumber;
                case '-' -> correctAns = firstNumber - secondNumber;
            }
            int userAnswer = input.nextInt();
            if (userAnswer == correctAns) correct++;
            else wrong++;
        }
    }
    private static void getRandomNumber() {
        for(int i = 1; i <= 10; i++ ) {
            firstNumber = (int)(Math.random()* 20 + 1);
            secondNumber = (int)(Math.random()* 20 + 1);
        }
    }
}
