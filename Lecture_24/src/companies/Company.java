package companies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeSet;

import companies.comparators.EmployeeComparatorByAge;
import companies.comparators.EmployeeComparatorByName;
import companies.comparators.EmployeeComperatorBySalary;

public class Company {

	private String name;
	
	private HashMap<Departments, HashSet<Employee>> payroll;
	
	
	
	public Company(String name) {

		if(!name.isEmpty())
			this.name = name;
		else
			this.name = "NAME YOUR COMPANY FFS!";
		
	}
	
	
	public void addEmployee(Employee emp, Departments dep){
		
		if(emp == null)
			return;
	
		if(this.payroll == null)
			this.payroll = new HashMap<Departments, HashSet<Employee>>();
		
		if(!payroll.containsKey(dep))
			payroll.put(dep, new HashSet<>());
			
		payroll.get(dep).add(emp);
	
	}
	
	
	public void listEmployees(){

		if(payroll.equals(null)){
			System.out.println("Payroll not set up!");
			
		}
		
		for (Iterator itr = payroll.entrySet().iterator(); itr.hasNext();) {
			
			Entry entr = (Entry) itr.next();
			
			System.out.println(entr.getKey());
			
			HashSet<Employee> emps = (HashSet<Employee>) entr.getValue();
			
			for (Employee emp : emps) {
				System.out.println("    - " + emp.toString());
			}
			System.out.println("-------------------");
		}
		
		
	}
	
	
	
	
	private void printEmployeeSet(Comparator<Employee> comparator){
		
		ArrayList<Employee> emps = new ArrayList<>();
		
		emps.sort(comparator);
		
		for (HashSet<Employee> hashSet : payroll.values()) {
			emps.addAll(hashSet);
		}
		
		for (Employee employee : emps) {
			System.out.println(employee.toString());
		}
		
	}
	
	
	public void printByAge(){
		printEmployeeSet(new EmployeeComparatorByAge());
	}

	public void printBySalary(){
		printEmployeeSet(new EmployeeComperatorBySalary());
	}
	
	public void printByName(){
		printEmployeeSet(new EmployeeComparatorByName());
	}
	
	
	
	public TreeSet<Employee> workersInDepartment(Collection<Employee> candidates, Departments dep){
		
		TreeSet<Employee> validWorkers = new TreeSet<>(new EmployeeComparatorByName());
		
		if(payroll.containsKey(dep)){
			validWorkers.addAll(payroll.get(dep));
			validWorkers.retainAll(payroll.get(dep));
		}
		
		return validWorkers;
		
	}
	
}
