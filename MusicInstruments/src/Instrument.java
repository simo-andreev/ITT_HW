
public class Instrument {

	
	private final String category;
	private final String type;
	private double price;
	
	

	public Instrument(String category, String type, double price) {
		
		if(category.isEmpty() || type.isEmpty() || price <= 0)
			throw new IllegalArgumentException();
		
		this.category = category;
		this.type = type;
		this.price = price;
		
	}
	
	
	public void setPrice(double price) {
		if(price > 0)
			this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getType() {
		return type;
	}
	
	
	
	@Override
	public int hashCode() {
		return this.type.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this.type == ((Instrument)obj).type);
	}
	
	
	
	
}
