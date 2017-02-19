package menuItems;

public class Salad extends Food implements IForVegan{

	public final static double MIN_WEIGHT = 300;
	public final static double MAX_WEIGHT = 600;
	
	protected Salad(String name, double weight) {
		super(name, 5, weight);
		// TODO Auto-generated constructor stub; HOW TO VALIDATE WEIGHT?	
	}


	@Override
	public IType getType() {
		return FoodType.SALAD;
	}

}
