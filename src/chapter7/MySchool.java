package chapter7;


import java.util.Scanner;

public class MySchool {
    int classSize;
    int noOfSubject;
    int counter = 0;
    String[] subjects;
    int[][] subjectScores;
    String[] studentNames;
    int[] studentTotalScore;
    double[]studentsAverage;
    int[] position;

    Scanner input = new Scanner(System.in);

    public void setName(){
        System.out.println("Enter the number of Student in the class");
        classSize = input.nextInt();
        studentNames = new String[classSize];
        for (counter = 0; counter < classSize; counter++){
            System.out.println("Enter Student"+" "+ (counter+1)+" "+ "name: ");
            studentNames[counter] = input.next();
        }
//        for(String i: studentNames) System.out.println(i);
    }

    public void setSubjects(){
        System.out.println("How many subject is offered?");
        noOfSubject = input.nextInt();
        subjects = new String[noOfSubject];
        for (int i = 0; i < noOfSubject; i++){
            System.out.println("Enter subject "+ (i+1));
            subjects[i] =input.next();
        }
    }

    public void setScores(){
        subjectScores = new int[studentNames.length][subjects.length];
        for (int i = 0; i < studentNames.length; i++){
            for (int j = 0; j < noOfSubject; j++){
                System.out.println("Enter " + subjects[j]+" score for " + studentNames[i]);
                subjectScores[i][j] = input.nextInt();
            }
        }
    }

    public void setTotal(){
        studentTotalScore = new int[studentNames.length];
        studentsAverage = new   double[subjects.length];
        for (int i =0; i < studentNames.length; i++){
            for (int j = 0; j < subjects.length; j++){
                studentTotalScore[i] += subjectScores[i][j];
                studentsAverage[i] =(double) studentTotalScore[i] / subjects.length;
            }
            //System.out.println(studentTotalScore[i]);
        }
    }

    public void displayOutput(){
        System.out.println("=".repeat(75));
        for (String subject : subjects) {
            System.out.printf("\t\t%10s", subject);
        }
        System.out.printf("\t%5s\t%5s\t%5s\t%n", "TOT", "AVE", "POS");
        System.out.println("=".repeat(75));

        position = new int[classSize];
        for (int i= 0; i < studentTotalScore.length; i++){
            int count = 0;
            for (int k: studentTotalScore){
                if(k > studentTotalScore[i]) count++;
                position[i] = count + 1;
            }
        }
        for (int i =0; i < studentNames.length; i++){
            System.out.printf("%s\t\t", studentNames[i]);


            for (int j = 0; j <subjects.length; j++){
                if (subjects[i] != null){
                    System.out.printf("%7d\t\t", subjectScores[i][j]);
                }
            }

            System.out.printf("%7d\t\t%7.2f\t\t%d%n", studentTotalScore[i], studentsAverage[i], position[i]);
            //System.out.println("");
        }
        System.out.println("=".repeat(75));
        System.out.println("=".repeat(75));
    }

    public void displaySubjectSummary(){
        final int passMark = 45;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int total = 0;
        double average = 0;
        int pass = 0, fail = 0;
        int index = 0;
        System.out.println("SUBJECT SUMMARY");
        for (int i = 0; i < subjects.length; i++){
            System.out.println(subjects[i]);
            for (int j = 0; j < subjectScores.length; j++){
                if(subjectScores[j][i] > highest){
                    index = i;
                    highest = subjectScores[j][i];
                }
                if(subjectScores[j][i] < lowest){
                    index = i;
                    lowest = subjectScores[j][i];
                }
                total += subjectScores[j][i];
                average = (double) total / studentNames.length;
            }
            if (subjectScores[index][i] > passMark) pass++;
            if (subjectScores[index][i] < passMark) fail++;
            else if(highest == lowest) pass +=2;

            if(subjectScores[index][i] == highest || subjectScores[index][i] == lowest) {
                System.out.printf("Highest scoring student is: %s scoring %d%n", studentNames[index], highest);
                System.out.printf("Lowest scoring student is: %s scoring %d%n", studentNames[index], lowest);
            }

            System.out.println("Total score is: "+ total);
            System.out.println("Average score is: "+ average);
            System.out.println("Number of passes: "+ pass);
            System.out.println("Number of fail: "+ fail);
        }
    }

    public int getPosition(){
        position = new int[classSize];
        for (int i= 0; i < studentTotalScore.length; i++){
            int count = 0;
            for (int k: studentTotalScore){
                if(k > studentTotalScore[i]) count++;
                position[i] = count + i;
            }
        }
        for(int i = 0; i < position.length; i++) {
            if (studentTotalScore[i] == position[i]) {
                return position[i];
            }
        }
        return 0;
    }
}