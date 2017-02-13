import java.util.Comparator;

public class InstrumentsComparatorByName implements Comparator<Instrument>{

	@Override
	public int compare(Instrument o1, Instrument o2) {
		return o1.getType().compareTo(o2.getType());
	}

}
