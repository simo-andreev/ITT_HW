package comparators;

import java.util.Comparator;

import main.Employee;

public class EmployeeComparatorByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() - o2.getAge();
	}

}
