package companies;

import java.util.Comparator;
import java.util.TreeSet;

import companies.comparators.EmployeeComparatorByAge;

public class Employee {

	private static int nextID = 1_000_000;
	
	private String name;
	private int age;
	private double salary;
	private final int emplyeeID;
	
	
	public Employee(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		
		this.salary = salary;
		
		this.emplyeeID = nextID++;
		
	}
	
	
	@Override
	public boolean equals(Object obj) {

		return this.emplyeeID == ((Employee) obj).emplyeeID;

	}
	
	@Override
	public int hashCode() {
		return this.emplyeeID;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	
	

	
	
	
	
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public double getSalary() {
		return salary;
	}


	public int getEmplyeeID() {
		return emplyeeID;
	}

	
}
