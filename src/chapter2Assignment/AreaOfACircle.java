package chapter2Assignment;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your radius: ");
        int radius = input.nextInt();
        System.out.printf("The diameter of the circle is %d%n", 2 * radius);
        System.out.printf("The circumference of the circle is %f%n", 2 * Math.PI * radius);
        System.out.printf("The area of the circle is %f%n", Math.PI* radius * radius);
    }
}
