import java.util.*;
import java.util.stream.*;

public class EmployeeProcessor extends Thread{
    private EmployeeManager employeeManager;
    private int employeeId;

    public EmployeeProcessor(EmployeeManager employeeManager, int employeeId){
        this.employeeManager = employeeManager;
        this.employeeId = employeeId;
    }
    @Override
    public void run(){
        try{
            Optional<Employee> employee = employeeManager.getEmployeeById(employeeId);
            employee.ifPresentOrElse(
                    (emp) -> System.out.println("Processing employee: " +emp),
                    () -> System.out.println("Employee with id = "+employeeId+ " not found.")
            );
        }
        catch(Exception exception) {
            System.out.println("Error processing employee data: "+exception.getMessage());
        }
    }
}