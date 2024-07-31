public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Add employees
        manager.addEmployee(new Employee("E001", "Alice", "Engineering", 70000));
        manager.addEmployee(new Employee("E002", "Bob", "Marketing", 50000));
        manager.addEmployee(new Employee("E003", "Charlie", "HR", 60000));

        // Display employees
        System.out.println("Employees after adding:");
        manager.displayEmployees();

        // Update an employee
        manager.updateEmployee("E002", "Bob Smith", "Marketing", 55000);

        // Display employees after update
        System.out.println("\nEmployees after updating:");
        manager.displayEmployees();

        // Delete an employee
        manager.deleteEmployee("E001");

        // Display employees after deletion
        System.out.println("\nEmployees after deletion:");
        manager.displayEmployees();
    }
}
