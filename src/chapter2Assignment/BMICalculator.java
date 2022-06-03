package chapter2Assignment;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double weightInKg = weight * 0.45359237;
        double heightInMeters = height * 0.0254;

        double BMI = weightInKg / heightInMeters * heightInMeters;

        System.out.printf(" Your BMI is %.2f%n%n%n", BMI);
        System.out.println("BMI Categories: ");
        System.out.println("Underweight = <18.5");
        System.out.println("Normalweight = 18.5 - 24.9");
        System.out.println("Overweight = 25 - 29.9");
        System.out.println("Obesity = BMI of 30 or greater");
    }
}