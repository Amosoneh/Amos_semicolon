import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for a triangle: ");
		double pointX1 = input.nextDouble();
		double pointY1 = input.nextDouble();
		double pointX2 = input.nextDouble();
		double pointY2 = input.nextDouble();
		double pointX3 = input.nextDouble();
		double pointY3 = input.nextDouble();

		double area = (pointX1 * (pointY2 - pointY3) + pointX2 * (pointY3 - pointY1) + pointX3 * (pointY1 - pointY2)) / 2;
		double TotalArea = Math.abs(area);
		System.out.printf("The area of the triangle is %.1f", TotalArea);


    }
}