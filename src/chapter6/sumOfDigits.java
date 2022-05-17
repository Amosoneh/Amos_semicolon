package chapter6;

public class sumOfDigits {
    public static void main(String[] args) {
        digitSum(123);
        System.out.println(digitSum(123));

    }
    private static int digitSum(int num){
        int sum = 0;
        String number = String.valueOf(num);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            sum += j;
        }
        return sum;
    }
}
