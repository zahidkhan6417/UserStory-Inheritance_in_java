public class Employee {
    protected String name;
    protected int  id;
    protected double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("Name :" +name+ ", ID :" +id+ ", Salary :" +salary);
    }

    public double getSalary(){
        return salary;
    }
}

class Manager extends Employee{
    private String department;

    public Manager(String name, int id, double salary,String department){
        super(name, id, salary);
        this.department = department;
    }
    public void  displayInfo(){
        super.displayInfo();
        System.out.println("Department is :" +department);
    }
}

class RegularEmployee extends Employee{
    private String designation;

    public RegularEmployee(String name, int id, double salary,String designation){
        super(name, id, salary);
        this.designation = designation;
    }
    public void  displayInfo(){
        super.displayInfo();
        System.out.println("Designation is :" +designation);
    }
}
