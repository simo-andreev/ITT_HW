package companies.comparators;

import java.util.Comparator;

import companies.Employee;

public class EmployeeComperatorBySalary implements Comparator<Employee>  {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		double diff = o1.getSalary() - o2.getSalary();
		
		if(diff < 0)
			return -1;
		if(diff > 0)
			return 1;
		
		return 0;
		
	}

}
