package entites;

public class ImportedProduct extends Product{

	private Double CustomFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		CustomFee = customFee;
	}
	
	
	public Double getCustomFee() {
		return CustomFee;
	}

	public void setCustomFee(Double customFee) {
		CustomFee = customFee;
	}

	@Override
	public String priceTag () {
		 return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", CustomFee)
				+ ")";
	}
	
	public double totalPrice() {
		return getPrice() + CustomFee; 
	}
	
}
