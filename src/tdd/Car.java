package tdd;

public class Car {
	private String model;
	private String year;
	private double price;
	private double discount;
	private double discountPrice;
	
	
	
	public Car(String model, String year, double price, double discount) {
		this.model = model;
		this.year = year;
		if (price < 0) {
			this.price = 0;
			this.discountPrice = 0;
		}
		else{
			this.price = price;
			this.discountPrice = price - ((discount / 100) * price);
		}

		//this.discount = discount / 100;
		
		
	}
	
	public void setModel(){
		this.model = model;
	}
	
	public void setYear(){
		this.year = year;
	}
	
	public void setPrice(){
		this.year = year;
		
	}
	
	public String getModel(){
		return model;
	}
	
	public String getYear(){
		return year;
	}
	
	public double getPrice(){
		return price;
	}


	public double getDiscountPrice(){
		return discountPrice;
	}
	
	
}
