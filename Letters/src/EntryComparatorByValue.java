import java.util.Comparator;
import java.util.Map.Entry;

public class EntryComparatorByValue implements Comparator<Entry<Character, Integer>>{

	@Override
	/**
	 * Compares the Integer values of 2 <Character, 
	 */
	public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
		return o2.getValue() - o1.getValue();
	}

}
