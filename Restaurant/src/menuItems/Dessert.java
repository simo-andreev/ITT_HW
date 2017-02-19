package menuItems;

public class Dessert extends Food{

	public final static double MIN_WEIGHT = 200;
	public final static double MAX_WEIGHT = 300;
	
	protected Dessert(String name, double price, double weight) {
		super(name, price, weight);
		// TODO Auto-generated constructor stub; HOW TO VALIDATE WEIGHT?	
	}


	@Override
	public IType getType() {
		return FoodType.DESSERT;
	}

}
