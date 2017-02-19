public abstract class Vignette {

	public enum VignettePeriod {

		DAY(1), MONTH(10), YEAR(10 * 6);

		int priceMultyplier;

		private VignettePeriod(int multiplier) {
			this.priceMultyplier = multiplier;
		}

		private static final VignettePeriod[] ENUMS = VignettePeriod.values();

		public static final int NUMBER_OF_PERIODS = ENUMS.length;

		public VignettePeriod number(int num) {
			if (num < 0 || num > NUMBER_OF_PERIODS)
				throw new IllegalArgumentException("Invalid enum number: " + num);
			return ENUMS[num];
		}

	}

	public enum VignetteType {

		CAR(5, "Green"), TRUCK(7, "Red"), BUS(9, "Blue");

		int priceForDay;
		String colour;

		private VignetteType(int priceForDay, String colour) {
			this.priceForDay = priceForDay;
			this.colour = colour;
		}

		private static final VignetteType[] ENUMS = VignetteType.values();

		public static final int NUMBER_OF_TYPES = ENUMS.length;

		/**
		 * Returns the VignetteType enum of corresponding ordinal position,
		 * starting at 0; Throws IllegalArgumentExeption if num is less than 0
		 * or more than the total number of values.
		 * 
		 * @param num
		 *            - ordinal position
		 * @return corresponding VignetteType
		 */
		public VignetteType number(int num) {
			if (num > NUMBER_OF_TYPES || num < 0)
				throw new IllegalArgumentException("Invalid enum number: " + num);
			return ENUMS[num];
		}

	}

	private final VignetteType type;
	private final String colour;
	private final double price;
	private final LocalDate purchaseDate;
	private final LocalDate expiaryDate;
	
	
	public Vignette(VignettePeriod period, VignetteType type) {
		super();
		this.period = period;
		this.type = type;
		this.price = type.priceForDay * period.priceMultyplier;
		this.colour = type.colour;
		
		
	}

	public double getPrice() {
		return this.price;
	}

	private final VignettePeriod period;

	public VignettePeriod getPeriod() {
		return period;
	}

	public VignetteType getType() {
		return type;
	}

	public String getColour() {
		return colour;
	}

}
