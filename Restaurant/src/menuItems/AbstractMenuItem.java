package menuItems;

public abstract class AbstractMenuItem {

	private String name;
	private double price;
	
	protected AbstractMenuItem(String name, double price){
	
		if(name.isEmpty() || name == null)
			throw new IllegalArgumentException("Invalid String name parameter passed: " + name);
		if(price <= 0)
			throw new IllegalArgumentException("Invalid double price parameter passed: " + price);
		
		this.name = name;
		this.price = price;
		
	}
		
	public abstract IType getType();
}
