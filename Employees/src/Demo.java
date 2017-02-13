import main.Company;
import main.Employee;

public class Demo {

	public static void main(String[] args) {

		Company comp =  new Company("SimCo");

		Employee emp = new Employee("Gosho", 87);
		
		comp.addEmployee(emp, "ADMC dep.");

		comp.addDepartment("ADMC dep.");
	}

}
