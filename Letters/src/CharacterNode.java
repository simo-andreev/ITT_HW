
public class CharacterNode implements Comparable<CharacterNode>{

	private char value;
	private int count;
	
	
	public CharacterNode(char value){
		this.value = value;
		this.count = 0;
	}
	
	
	public int getCount() {
		return count;
	}
	
	public char getValue() {
		return value;
	}

	
	public void incrementCount(){
		this.count++;
	}
	
	
	@Override
	public int compareTo(CharacterNode o) {
		return this.count - o.getCount();
	}
	
}
