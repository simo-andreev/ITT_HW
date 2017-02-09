package companies;

public class Demo {

	public static void main(String[] args) {
				
		Company comp = new Company("IBNM");
		
		Employee emp1 = new Employee("emp1", 33, 900);
		Employee emp2 = new Employee("emp2", 52, 1900);
		Employee emp3 = new Employee("emp3", 23, 799.99);
		Employee emp4 = new Employee("emp4", 40, 1300);
		Employee emp5 = new Employee("emp5", 33, 1457.63);
		

		comp.addEmployee(emp1, Departments.IT);
		comp.addEmployee(emp2, Departments.HR);
		comp.addEmployee(emp3, Departments.LEGAL);
		comp.addEmployee(emp4, Departments.SALES);
		comp.addEmployee(emp5, Departments.IT);
		
		
		comp.listEmployees();
		
		System.out.println("--------------------------");
		comp.printByAge();
	
		System.out.println("--------------------------");
		comp.printByName();
		
		System.out.println("--------------------------");
		comp.printBySalary();
	}
		
}
