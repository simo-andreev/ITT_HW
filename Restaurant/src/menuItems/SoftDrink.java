package menuItems;

public class SoftDrink extends Drink implements IForVegan{

	protected SoftDrink(String name) {
		super(name, 2);
	}

	@Override
	public IType getType() {
		return DrinkType.SOFT_DRINK;
	}

}
