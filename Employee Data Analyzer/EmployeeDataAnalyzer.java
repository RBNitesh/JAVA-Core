public class EmployeeDataAnalyzer{
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Rahman", "Marketing", 50000.0);
        Employee employee2 = new Employee(102, "Johnson", "Marketing", 35000.0);

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(employee1);
        employeeManager.addEmployee(employee2);

        // print the details of all the employees
        System.out.println(employeeManager.getAllEmployees());
    }
}