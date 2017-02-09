package companies.comparators;

import java.util.Comparator;

import companies.Employee;

public class EmployeeComparatorByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getAge() - o2.getAge();

	}

}
