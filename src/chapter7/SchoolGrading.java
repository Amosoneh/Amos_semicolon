package chapter7;

import java.util.Scanner;
import java.util.Arrays;

public class SchoolGrading {
    static Scanner input = new Scanner(System.in);
    static int classSize = 40;
    static String [] studentNames = new String[classSize];
    static int [] subjectOneScores = new int[classSize];
    static int [] subject2Scores = new int[classSize];
    static int counter = 0;
    static double[]averages = new double[100];
    static int [] subject3Scores = new int[classSize];

    static void setStudentNameAndScores(){
        boolean continueCondition = true;

        while (continueCondition) {

                System.out.println("Enter Student name: ");
                studentNames[counter] = input.next();

                System.out.println("Enter score for subject 1");
                subjectOneScores[counter] = input.nextInt();

                System.out.println("Enter score for subject 2");
                subject2Scores[counter] = input.nextInt();

                System.out.println("Enter score for subject 3");
                subject3Scores[counter] = input.nextInt();
                System.out.println("Enter 0 to end or 1 to enter score for another student");
                int userResponse = input.nextInt();
                if(userResponse == 0) continueCondition =false;

            counter++;
        }
    }

    static void geStudentNameAndScores() {
        int[] position = new int[classSize];

        double average = 0.0;
        //double average = 0.0;
        System.out.println("=".repeat(58));
        System.out.println("STUDENT\t\tSUB1\tSUB2\tSUB3\tTOT\t\tAVE\t\tPOS");
        System.out.println("=".repeat(58));
        int[] total = new int[0];
        for (int i = 0; i < classSize; i++) {
            if (studentNames[i] != null || subjectOneScores[i] != 0 || subject2Scores[i] != 0 || subject3Scores[i] != 0) {

                total = new int[studentNames.length];

                total[i] = subjectOneScores[i] + subject2Scores[i] + subject3Scores[i];
                averages[i] = (double) total[i] / 3;
            }
                System.out.printf("%s %8d %8d %8d %8d %8.2f %8d%n",
                        studentNames[i],
                        subjectOneScores[i],
                        subject2Scores[i],
                        subject3Scores[i],
                        total[i],
                        averages[i],
                        position[i]);

        }




        System.out.println("=".repeat(58));
        System.out.println("=".repeat(58));
    }





    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

}
