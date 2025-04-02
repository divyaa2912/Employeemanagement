class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void calculateSalary() {
        System.out.println("Salary calculation not defined.");
    }

    public void display() {
        System.out.print("ID: " + id + ", Name: " + name + ", ");
        calculateSalary(); 
    }
}
class FullTimeEmployee extends Employee {
    double salary, bonus;

    public FullTimeEmployee(String name, int id, double salary, double bonus) {
        super(name, id);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary: " + (salary + bonus));
    }
}
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary: " + (hourlyRate * hoursWorked));
    }
}
public class Employeemanagement {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Alice", 101, 50000, 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Bob", 102, 20, 120);

        emp1.display();
        emp2.display();
    }
}
