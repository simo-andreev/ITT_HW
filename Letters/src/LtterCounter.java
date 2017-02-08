import java.util.TreeMap;

public class LtterCounter {

	
	
	public static void main(String[] args) {
		
		String str = "Hellow wordl!";
		
		String temp = str.toLowerCase();
		
		
		TreeMap<Character, Integer> letters = new TreeMap();
		
		for(int i = 0; i < temp.length(); i++){
			
			Character ch = temp.charAt(i);
			
			if( Character.isLetter(ch) ){
				
				if(letters.containsKey(ch))
					letters.put(ch, letters.get(ch)+1);
				else
					letters.put(ch, 1);
			}
			
		}
		
		
		System.out.println(letters.toString());
		
	}
	
	
	
}
