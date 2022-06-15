package chapter7;
import java.util.Scanner;

public class MinMax  {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        System.out.println("Enter a number or -0 to quit");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        //int[] a ={3,-560,1077,8,10,-56,-100,67};
//
//        for (int i = 0; i < a.length; i++){
//            if (a[i] > largest) largest = a[i];
//            if (a[i] < smallest) smallest = a[i];
 //        }

        while (input != -0){
            if (input > largest){
                largest = input;
            }
            if (input < smallest){
                smallest = input;
            }
            System.out.println("Enter a number or -0 to quit");
            input = scanner.nextInt();
        }
        System.out.println("Largest --> "+ largest);
        System.out.println("Smallest --> "+ smallest);
    }
}
