//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager man = new Manager("Rohit Sharma", 45, 100000, "Finance");
        RegularEmployee re1 = new RegularEmployee("rishav pant", 12, 60000, "engineer2");
        RegularEmployee re2 = new RegularEmployee("Yashaswi Jaiswal", 19, 40000, "engineer1");

        man.displayInfo();
        re1.displayInfo();
        re2.displayInfo();

        double totalSalary = man.getSalary() + re1.getSalary() + re2.getSalary();
        System.out.println("Total Salary of the employee is:" +totalSalary);

        Employee highestSalary = findHghestSalary(man, re1, re2);
        System.out.println("Highest Salary of the employee is:" +highestSalary);
        highestSalary.displayInfo();
    }

    public static Employee findHghestSalary(Employee... employees){
        if(employees == null){
            return null;
        }
        Employee highestPaid = employees[0];
        double maxSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {

            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                highestPaid = employees[i];
            }
        }

        return highestPaid;

    }
}

