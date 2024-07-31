import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void updateEmployee(String employeeId, String newName, String newDepartment, double newSalary) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                employee.setName(newName);
                employee.setDepartment(newDepartment);
                employee.setSalary(newSalary);
                break;
            }
        }
    }

    public void deleteEmployee(String employeeId) {
        employees.removeIf(employee -> employee.getEmployeeId().equals(employeeId));
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
