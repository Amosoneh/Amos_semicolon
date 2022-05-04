package tdd;

import java.util.Scanner;

//public class ClassAverage {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double total = 0;
//        int gradeCounter = 1;
//        while (gradeCounter <= 4){
//            System.out.println("Enter grade: ");
//            double grade = input.nextDouble();
//            total += grade;
//            gradeCounter += 1;
//        }
//        double average = total / 4;
//        System.out.printf("The average of the 10 grades is %.2f ", average);

//        double total = 0;
//        int gradeCounter = 0;
//        System.out.println("Enter score or -1 to exit: ");
//        double grade = input.nextDouble();
//        while (grade != -1){
//            total += grade;
//            gradeCounter += 1;
//
//            System.out.println("Enter score or -1 to exit: ");
//            grade = input.nextDouble();
//        }
//        if (gradeCounter != 0){
//            double average = total / gradeCounter;
//            System.out.printf("%n Total of %d grades entered is %.2f%n",gradeCounter, total);
//            System.out.printf("Class average is %.2f", average);
//        }
//        else{
//            System.out.println("No score is entered");
//        }
//    }
//
//}
public class ClassAverage {
    public static void main(String[] args) {
//        int x = -2;
//        int total = 0;
//        while (x <= 10){
//            int y = x + 2;
//            x++;
//            total +=y;
//            System.out.printf("Y is: %d and total is %d%n", y, total);
//        }
//        int row = 5;
//        while (row >= 1){
//            int column = 5;
//            while (column >= 1){
//                System.out.print(row % 2 == 1 ? "X" : "0");
//                ++column;
//            }
//            --row;
//            System.out.println();
//        }
        double principal = 1000;
        double rate = 0.05;

        System.out.printf("%s%25s%n", "Year", "Amount of Deposit");
        for (int year = 1; year <= 10; year++){
            double amount = principal * Math.pow(rate + 1, year);
            System.out.printf("%3d %,16.2f%n", year, amount);
        }
    }
}

