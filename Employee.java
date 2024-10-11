abstract class Employee
{
    private String name ;
    private int id;

    public Employee(String name , int id)
        {
            this.name = name ;
            this.id =id;
        }    
    // this is getter function wcich will be used to get the name if the employee
    public String getName()
        {
            return name;
        }
    // this is a getter function for getting ID
        public int getID()
        {
            return id;
        }

    // the function which ia hve mentioned above are normal functions

    // now creating an abstract method
       public abstract double calculatesalary();

       @Override
       public String toString()
       {
        return "Employee[name ="+name+" ,id = "+id+" , Salary ="+calculatesalary()+" ]";
       }
}
