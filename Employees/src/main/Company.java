package main;

import java.time.Month;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Company {

	private String name;

	private HashMap<String, HashMap<Employee, HashMap<Month, Double>>> payRoll;
	// Department -> List of Employees < Employee -> List of salaries < Month ->
	// amount > >

	public Company(String name) {
		this.name = name;
		this.payRoll = new HashMap<>();
	}

	public void listEmployees() {

		for (Iterator itr = payRoll.entrySet().iterator(); itr.hasNext();) {
			Entry department = (Entry) itr.next();

			System.out.println("================================");
			System.out.println(department.getKey());

			HashMap<Employee, HashMap<Month, Double>> depEmployees = (HashMap<Employee, HashMap<Month, Double>>) department.getValue();

			for (Iterator itr2 = depEmployees.keySet().iterator(); itr2.hasNext();) {

				System.out.println("    - " + itr2.next().toString());

			}

		}
		
		System.out.println("================================");

	}

	void addEmployee(Employee emp, String department) {

		
		
	}
	
	/**
	 * If Employee emp is present in the company's payRoll it is removed.
	 * Removes first found instance
	 * 
	 * @param emp - Employee value to remove
	 */
	void removeEmployee(Employee emp){
		//TODO 
	}
	
	

}
