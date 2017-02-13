package comparators;

import java.util.Comparator;

import main.Employee;

public class EmployeeComparatorByWage implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
	
		double diff = o1.getWage() - o2.getWage();
		
		if(diff < 0) return -1;
		if(diff > 0) return 1;
		return 0;
		
	}

}
