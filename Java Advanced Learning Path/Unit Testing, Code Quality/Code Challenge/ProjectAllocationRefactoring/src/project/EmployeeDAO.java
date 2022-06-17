package project;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

//comment
public class EmployeeDAO {
	private final List<Employee> employeeList = new ArrayList<>();
	static Logger log = Logger.getLogger();

	EmployeeDAO() {
	}

	// Add
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	// Remove
	public void removeEmployee(Employee employee) {
		employeeList.remove(employee);
	}

	public void viewEmployee() {
		for (Employee employee : employeeList) {
			System.out.println("Employee Id:" + employee.getEmployeeId());
			System.out.println("Employee Name:" + employee.getEmployeeName());
			System.out.println("Email Id:" + employee.getEmailId());
			System.out.println("Designation: " + employee.getDesignation());
		}
	}
}
