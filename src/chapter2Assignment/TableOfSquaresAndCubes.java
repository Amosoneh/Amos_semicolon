package chapter2Assignment;

public class TableOfSquaresAndCubes {
    public static void main(String[] args) {
        int num = 0, squarenum = 0, cubenum = 0;
        int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5, num6 = 6, num7 = 7, num8 = 8, num9 = 9, num10 = 10;

        int squarenum1 = num1 * num1, squarenum2 = num2 * num2, squarenum3 = num3 * num3, squarenum4 = num4 * num4;
        int squarenum5 = num5 * num5, squarenum6 = num6 * num6, squarenum7 = num7 * num7, squarenum8 = num8 * num8;
        int squarenum9 = num9 * num9, squarenum10 = num10 * num10;

        int cubenum1 = num1 * num1 * num1, cubenum2 = num2 * num2 * num2, cubenum3 = num3 * num3 * num3, cubenum4 = num4 * num4 * num4;
        int cubenum5 = num5 * num5 * num5, cubenum6 = num6 * num6 * num6, cubenum7 = num7 * num7 * num7, cubenum8 = num8 * num8 * num8;
        int cubenum9 = num9 * num9 * num9, cubenum10 = num10 * num10 * num10;

        System.out.println("number  " + " square "+ "     cube ");
        System.out.printf("%d \t\t %d \t\t\t %d%n",num , squarenum , cubenum);
        System.out.printf("%d \t\t %d \t\t\t %d%n",num1 , squarenum1 , cubenum1);
        System.out.printf("%d \t\t %d \t\t\t %d%n",num2 , squarenum2 , cubenum2);
        System.out.printf("%d \t\t %d \t\t\t %d%n",num3 , squarenum3 , cubenum3);
        System.out.printf("%d \t\t %d \t\t %d%n",num4 , squarenum4 , cubenum4);
        System.out.printf("%d \t\t %d \t\t %d%n",num5 , squarenum5 , cubenum5);
        System.out.printf("%d \t\t %d \t\t %d%n",num6 , squarenum6 , cubenum6);
        System.out.printf("%d \t\t %d \t\t %d%n",num7 , squarenum7 , cubenum7);
        System.out.printf("%d \t\t %d \t\t %d%n",num8 , squarenum8 , cubenum8);
        System.out.printf("%d \t\t %d \t\t %d%n",num9 , squarenum9 , cubenum9);
        System.out.printf("%d \t\t %d \t\t %d%n",num10 , squarenum10 , cubenum10);
    }
}
