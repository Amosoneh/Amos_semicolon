package tdd;

public class SumOfFirst10NaturalNumbers {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
//        for(int i = 1; i <= num; i++){
//            sum += i;
//        }
        int i = 1;
        while (i <= num){
            sum += i;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers is: "+ sum);
    }
}
