package tdd;

public class Kata {

    public static int noOfFactorsOf(int num) {
        int factors = 0;
        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                factors++;
            }
        }
        return factors;
    }

    public static boolean isPrime(int num) {
//        boolean flag = false;
//        for (int i = 2; i <= num / 2; i++){
//            flag = num % i == 0;
//        }
//        return !flag;
        return noOfFactorsOf(num) == 2;
    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

    public int substract(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber){
            return firstNumber - secondNumber;
        }
        else {
            return secondNumber - firstNumber;
        }
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        if(secondNumber == 0){
            return 0;
        }
        else{
            return firstNumber / secondNumber;
        }
    }

    public int calculate(int copies) {
        int amount = 0;
        if(copies >= 1 && copies <= 4) {
            amount = copies * 2000;
        }
        if(copies >4 && copies <= 9){
            amount = copies * 1800;
        }
        if(copies >9 && copies <= 29){
            amount = copies * 1600;
        }
        if(copies >29 && copies <= 49){
            amount = copies * 1500;
        }
        if(copies >49 && copies <= 99){
            amount = copies * 1300;
        }
        if(copies >99 && copies <= 199){
            amount = copies * 1200;
        }
        if(copies >199 && copies <= 499){
            amount = copies * 1100;
        }
        else if(copies > 499) {
            amount = copies * 1000;
        }
        return amount;
    }


    public String scoreRangeGrade(int score) {
        String grade = null;
        if(score >= 90 && score <= 100){
            grade = "A";
        }

        if(score >= 80 && score < 90){
            grade = "B";
        }

        if(score >= 70 && score < 80){
            grade = "C";
        }

        if(score >= 60 && score < 70){
            grade = "D";
        }

        if(score < 60){
            grade = "F";
        }
        return grade;
    }

    public String score(int score) {
        String result = null;
        if(score >= 55){
            result = "Passed";
        }
        if(score < 55){
            result = "Failed";
        }
        return result;
    }

    private int balance;
    private String name;
    public int getBalance() {

        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0){
            balance = balance + amount;
        }

    }

    public void withdraw(int amount) {

        if(amount > 0 && amount <= balance ){
            balance = balance - amount;
        }
        else {
            balance = balance;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public static int factors(int x){
//        int factors =
//        return factors;
//    }

}
