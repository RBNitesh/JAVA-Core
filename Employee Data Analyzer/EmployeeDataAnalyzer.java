import java.util.*;

public class EmployeeDataAnalyzer{
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Rahman", "Marketing", 50000.0);
        Employee employee2 = new Employee(102, "Johnson", "Marketing", 35000.0);
        Employee employee3 = new Employee(103, "Aradhya", "Marketing", 75000.0);

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(employee1);
        employeeManager.addEmployee(employee2);
        employeeManager.addEmployee(employee3);

        // print the details of all the employees
        System.out.println(employeeManager.getAllEmployees());

        EmployeeProcessor processor1 = new EmployeeProcessor(employeeManager, 101);
        EmployeeProcessor processor2 = new EmployeeProcessor(employeeManager, 102);
        EmployeeProcessor processor3 = new EmployeeProcessor(employeeManager, 103);
        EmployeeProcessor processor4 = new EmployeeProcessor(employeeManager, 104);

        processor1.start();
        processor2.start();
        processor3.start();
        processor4.start();

        try{
            processor1.join();
            processor2.join();
            processor3.join();
            processor4.join();
        }catch(InterruptedException exception){
            System.out.println("Error waiting for thread completion: " + exception.getMessage());
        }
    }
}