package main;

public class Employee {

	private static int uniqueIDgen = 1_000_000;
	
	
	private String name;
	private int age;
	
//	private HashMap<Month, Double> salaries;
	
	private final int uniqueID;
	
	
	
	
	
	public Employee(String name, int age) {

		this.uniqueID = uniqueIDgen ++;
		
		this.name = name;
		this.age = age;

	}
	
	
	public String getName(){
		return this.name;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append("  :  ");
		sb.append(this.uniqueID);
		return sb.toString();
	}
	
	
}
