package menuItems;

public class Alcohol extends Drink implements IForThug{

	protected Alcohol(String name) {
		super(name, 4);
	}

	@Override
	public IType getType() {
		return DrinkType.ALCOHOL;
	}

}
