import java.util.*;
public class PayrollSystem
{
    private ArrayList<Employee> employeeList;  
    public PayrollSystem()
    {
        employeeList=new ArrayList<>();
    }  

    // Adding an Employee to the current DB
    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }
    //  this will be used to remove the employee if it exists
    public void removeEmployee(int id)
    {
        Employee employeeToRemove = null;
        for (Employee e : employeeList)
            {
                if(e.getID()==id)
                    employeeToRemove=e; 
                    break;
            }
            if(employeeToRemove!=null)
                    employeeList.remove(employeeToRemove);
            else
                    System.out.println("Employee not found");
    }

    // getting the list of curent working EMployees
    public void EmployeeList ()
    {
        for (Employee i : employeeList)
        {
            System.out.println(i);

        }
    }
}
