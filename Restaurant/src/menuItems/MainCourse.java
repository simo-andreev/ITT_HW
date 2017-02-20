package menuItems;

public class MainCourse extends Food implements IForThug{

	public final static double MIN_WEIGHT = 400;
	public final static double MAX_WEIGHT = 900;

	protected MainCourse(String name, double weight) {
		super(name, 9, weight);
		// TODO HOW TO VALIDATE WEIGHT?	
	}

	@Override
	public IType getType() {
		return FoodType.MAIN_COURSE;
	}
}
