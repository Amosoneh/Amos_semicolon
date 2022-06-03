package chapter7;

import java.util.ArrayList;

public class ShoppingClass {
    private ArrayList<ShoppingClassItem>totalItems;

    public ShoppingClass() {
        totalItems = new ArrayList<>();
    }

    public void addItem(ShoppingClassItem newItem){
        totalItems.add(newItem);
    }

    public double calculatedSubTotal(){
        double subTotal = 0.0;
        for(ShoppingClassItem item: totalItems){
            double itemPrice = item.getPricePerUnit() * item.getQuantity();
            subTotal += itemPrice;
        }
        return subTotal;
    }

    public double discount(double percentDiscount){
        double total = calculatedSubTotal();
        double discountAmount = (percentDiscount * total) / 100;
        return discountAmount;
    }
    public double vat(){
        double vatPercent = 17.5 / 100;
        double total = calculatedSubTotal();
        return vatPercent * total;
    }
}
