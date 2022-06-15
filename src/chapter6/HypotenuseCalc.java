package chapter6;

public class HypotenuseCalc {
    public static void main(String[] args) {
        System.out.println(hypotenuse(3,3));
    }

    private static double hypotenuse(double num1, double num2){
        double a = num1 * num1;
        double b = num2 * num2;
        double c = a + b;
        return Math.sqrt(c);
    }

}
