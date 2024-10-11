public class Main 
{
    public static void main(String[] args) {
        PayrollSystem  payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1= new FullTimeEmployee("shivam",1, 70000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Alex" , 2, 40,100);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial employee details");
        payrollSystem.EmployeeList();

        System.out.println("removing employees");
        payrollSystem.removeEmployee(2);

        System.out.println("Remaining Employee Details");
        payrollSystem.EmployeeList();
    }    
}
