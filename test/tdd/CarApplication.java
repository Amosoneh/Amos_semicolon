package tdd;

public class CarApplication {
	public static void main(String[] args) {
		Car car1 = new Car("Bentley", "2022", 300000, 5);
		Car car2 = new Car("Toyota", "2022", 50000, 7);
		
		System.out.printf("%s price: %.2f%n", car1.getModel(), car1.getPrice());
		System.out.printf("%s price: %.2f%n%n", car2.getModel(), car2.getPrice());

		System.out.printf("%s price with discount: %.2f%n", car1.getModel(), car1.getDiscountPrice());
		System.out.printf("%s price with discount: %.2f%n%n", car2.getModel(), car2.getDiscountPrice());
	}
}
