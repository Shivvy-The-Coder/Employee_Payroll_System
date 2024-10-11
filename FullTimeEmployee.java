public class FullTimeEmployee extends Employee {
// here we were getting an error when we extended Employee class with full time employee because 
// Employee class is an abstract class , adn it cotains an abstract fucntion whcih when inherited needs to be 
// implemented in the subclass. So we are implementing the abstract function here in FullTimeEmployee class

    private double monthlySalary;
    public FullTimeEmployee(String name , int id , double monthlySalary)
    {
        //  we write super class to access the name and id of just above parent class 
        super(name,id);
        // hence monthly salary nelongs to the same class therefore we will assign it with this keywords
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculatesalary() {
        return monthlySalary;
    }
}
