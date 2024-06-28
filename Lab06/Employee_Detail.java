
// Create class Employee_Detail with attributes Employee_ID, Name, Designation,
// and Salary. Write a program to read the detail from user and print it. 
import java.util.Scanner;

class Employee {
    int Employee_ID;
    String Name;
    String designation;
    double salary;

    Employee(int Employee_ID, String Name, String designation, double salary) {
        this.Employee_ID = Employee_ID;
        this.Name = Name;
        this.designation = designation;
        this.salary = salary;
    }

    public String display() {
        return "Employee detail : " + Employee_ID +
                "\nName : " + Name +
                "\nDesignation : " + designation +
                "\nSalary : " + salary;
    }

}

public class Employee_Detail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee id : ");
        int id = scanner.nextInt();
        System.out.println("Enter employee name : ");
        String name = scanner.next();
        System.out.println("Enter employee designation : ");
        String designation = scanner.next();
        System.out.println("Enter employee salary : ");
        double salary = scanner.nextDouble();
        Employee e = new Employee(id, name, designation, salary);
        System.out.println(e.display());

    }
}