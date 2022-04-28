package tdd;

public class PetrolPurchase {
	private String stationLocation;
	private String petrolType;
	private int quantity;
	private double pricePerLiter;
	private double percentDiscount;
	private double purchasedAmount;
	
	public PetrolPurchase(String stationLocation, String petrolType, int quantity, double pricePerLiter, double percentDiscount){
		//this.purchasedAmount = purchasedAmount;
		this.stationLocation = stationLocation;
		this.petrolType = petrolType;
		this.quantity = quantity;
		this.pricePerLiter = pricePerLiter;
		if(pricePerLiter > 0.0){
		this.percentDiscount = (percentDiscount / 100) * pricePerLiter * quantity;
		}
	}
	
	public void setStationLocation(){
		this.stationLocation = stationLocation;
	}
	
	public void setPetrolType(){
		this.petrolType = petrolType;
	}
	
	public void setQuantity(){
		this.quantity = quantity;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setPricePerLiter(){
		this.pricePerLiter = pricePerLiter;
	}

	public void setPercentDiscount(){
		this.percentDiscount = percentDiscount;
	}

	public double getPercentDiscount(){
		return percentDiscount;
	}
	
	public String getStationLocation(){
		return stationLocation;
	}
	
	public String getPetrolType(){
		return petrolType;
	}
	
	public double getPricePerLiter(){
		return pricePerLiter;
	}
	
	public double getPurchasedAmount(){
		return this.purchasedAmount =(quantity * pricePerLiter) - percentDiscount;
	}
	
}
