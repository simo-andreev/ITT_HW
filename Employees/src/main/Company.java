package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.TreeMap;

import comparators.EmployeeComparatorByAge;
import comparators.EmployeeComparatorByName;
import comparators.EmployeeComparatorByWage;

public class Company {

	private static final double MINIMAL_WAGE = 420;
	private String name;
	private HashMap<String, HashSet<Employee>> employees;
	private HashMap<Employee, Double> payRoll;

	public Company(String name) {
		this.name = name;
		this.employees = new HashMap<>();
		// this.payRoll = new HashMap<>();
	}

	public String getName() {
		return name;
	}

	public void addEmployee(Employee emp, String dep, double wage) {
		if (emp == null || dep.isEmpty() || dep == null || wage < MINIMAL_WAGE || emp.isEmployed())
			return;

		if (!employees.containsKey(dep)) {
			System.out.println(this.name + " does not have a \"" + dep + "\" department!");
			return;
			// TODO - prompt to add dep;
		}

		employees.get(dep).add(emp);
		payRoll.put(emp, wage);
		emp.employ(this, wage);

	}

	void removeEmpolyee(Employee emp) {
		// TODO
	}

	void removeEmployee(Employee emp, String dep) {
		// TODO
	}

	void addDepartment(String department) {
		// TODO
	}

	public void listEmployees(Collection<Employee> empCollection) {

		for (Employee emp : empCollection) {
			System.out.println("::" + emp.toString());
		}

	}

	public void listEmployeesByDepartment() {

		for (Entry<String, HashSet<Employee>> department : employees.entrySet()) {

			System.out.println("=====================================");
			System.out.println(department.getKey());
			listEmployees(department.getValue());

		}

		System.out.println("_____________________________________");
		System.out.println("=====================================");

	}

	private void listEmployeesByComparator(Comparator<Employee> comp) {
		ArrayList<Employee> emps = new ArrayList<>();

		for (HashSet<Employee> empSet : employees.values()) {
			emps.addAll(empSet);
		}

		emps.sort(comp);

		listEmployees(emps);
	}

	public void listEmployeesByWage() {
		listEmployeesByComparator(new EmployeeComparatorByWage());
	}

	public void listEmployeesByName() {
		listEmployeesByComparator(new EmployeeComparatorByName());

	}

	public void listEmployeesByAge() {

		listEmployeesByComparator(new EmployeeComparatorByAge());

	}

	public void filterDuplicateEmployees(){
		
		TreeMap<Employee, String> filteredEmps = new TreeMap<>();
		
		for(Entry<String, HashSet<Employee>> department : employees.entrySet()){
			
			for(Employee emp : department.getValue()){
				filteredEmps.putIfAbsent(emp, department.getKey());
			}
			
		}
		
		
	}
	
	
}