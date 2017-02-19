package menuItems;

public abstract class Food extends AbstractMenuItem {

	enum FoodType implements IType {
		DESSERT, SALAD, MAIN_COURSE;
	}
	
	private final double weight;
	
	protected Food(String name, double price, double weight) {
		super(name, price);
		this.weight = weight;
	}
	
}
