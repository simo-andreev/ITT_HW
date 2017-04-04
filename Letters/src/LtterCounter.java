import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LtterCounter {

	public static void main(String[] args) {

		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor "
				+ "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud "
				+ "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure "
				+ "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
				+ "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit "
				+ "anim id est laborum.";
		
		String temp = str.toLowerCase();
		int letterCount = 0;

		TreeMap<Character, Integer> letters = new TreeMap();

		for (int i = 0; i < temp.length(); i++) {

			Character ch = temp.charAt(i);

			if (Character.isLetter(ch)) {

				letterCount++;

				if (letters.containsKey(ch))
					letters.put(ch, letters.get(ch) + 1);
				else
					letters.put(ch, 1);
			}

		}

		ArrayList<Entry<Character, Integer>> sortedLetters = new ArrayList<>();

		sortedLetters.addAll(letters.entrySet());

		sortedLetters.sort(new EntryComparatorByValue());
//
		System.out.println(
				"    0%------------------------------------------------------------------------------------------------100%");
		for (Entry<Character, Integer> entry : sortedLetters) {
			System.out.print(entry.getKey() + " : ");

			for (int i = 0; i <= (double) entry.getValue() / letterCount * 100; i++)
				System.out.print("#");

			System.out.println();

		}
		System.out.println(
				"    0%------------------------------------------------------------------------------------------------100%");

	}

}
