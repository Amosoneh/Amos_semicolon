import java.util.Scanner;

public class ClockTest {
	public static void main(String[] args) {
		Clock clock1 = new Clock(22, 45, 50);
		
		System.out.printf("The time is %s%n:", clock1.getDisplayTime());
	}
}
