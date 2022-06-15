package chapter7;

import java.util.Objects;
import java.util.Scanner;

public class ShoppingCartMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShoppingClass cart = new ShoppingClass();
        String customerName;
        String userInput;

        do{
            System.out.println("Enter customer name");
            customerName = input.next();
            System.out.println("Enter item name");
            String itemName = input.next();
            System.out.println("Enter price per unit");
            double pricePerUnit = input.nextDouble();
            System.out.println("Enter quantity");
            int qty = input.nextInt();
            System.out.println("Do you want to add a new item? enter yes or no");
            userInput = input.next();

            ShoppingClassItem item = new ShoppingClassItem(
                    itemName,
                    pricePerUnit,
                    qty
            );
        }
        while (Objects.equals(userInput, "no"));
    }
}
