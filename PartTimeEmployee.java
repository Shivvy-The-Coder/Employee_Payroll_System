public class PartTimeEmployee extends Employee
{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name , int id , int hoursWorked , float hourlyRate)
    {
        super(name,id);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }
    @Override
    public double calculatesalary()
    {
        return  hoursWorked*hourlyRate;
    }
}
