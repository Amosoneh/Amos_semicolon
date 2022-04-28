package tdd;

public class Kata {
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
}
