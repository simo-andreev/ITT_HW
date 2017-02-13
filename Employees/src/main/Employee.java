package main;

public class Employee implements Comparable<Employee> {

	private static int uniqueIDgen = 1_000_000;

	private Company employer;
	private String name;
	private int age;
	private double wage;

	// private HashMap<Month, Double> salaries;

	private final int uniqueID;

	public Employee(String name, int age, double wage) {

		this.uniqueID = uniqueIDgen++;

		this.name = name;
		this.age = age;

	}

	public int getID() {
		return this.uniqueID;
	}

	public String getName() {
		return this.name;
	}

	public double getWage() {
		return this.wage;
	}
	
	public int getAge() {
		return age;
	}

	public boolean isEmployed() {
		return this.employer != null;
	}

	protected void employ(Company employer, double wage) {
		this.employer = employer;
		this.wage = wage;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append("  :  ");
		sb.append(this.uniqueID);
		return sb.toString();
	}

	@Override
	public int compareTo(Employee o) {
		return this.uniqueID - o.uniqueID;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this)
			return true;

		return this.uniqueID == ((Employee) obj).uniqueID;

	}
}
