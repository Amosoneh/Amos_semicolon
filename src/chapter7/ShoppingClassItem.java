package chapter7;

public class ShoppingClassItem {
    private String itemName;
    private double pricePerUnit;
    private int quantity;

    public ShoppingClassItem(String itemName, double pricePerUnit, int quantity) {
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
