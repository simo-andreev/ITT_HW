package menuItems;

public abstract class Drink extends AbstractMenuItem {

	enum DrinkType implements IType{
		ALCOHOL,SOFT_DRINK;
	}
	
	
	protected Drink(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

}
