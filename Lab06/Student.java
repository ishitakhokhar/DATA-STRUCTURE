
//Create array of object of class Student_Detail with attributes Enrollment_No,
//Name, Semester, CPI for 5 students, scan their information and print it.
import java.util.Scanner;

class Student_Detail {
    double Enrolment_No;
    String Name;
    int semester;
    double CPI;

    Student_Detail(double Enrolment_No, String Name, int semester, double CPI) {
        this.Enrolment_No = Enrolment_No;
        this.Name = Name;
        this.semester = semester;
        this.CPI = CPI;
    }

    public void display() {
        System.out.println("Enrolment number : " + Enrolment_No);
        System.out.println("Name : " + Name);
        System.out.println("Semester : " + semester);
        System.out.println("CPI : " + CPI);
    }

}

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student_Detail[] students = new Student_Detail[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student Enrolment No : ");
            double Enrollment_No = scanner.nextDouble();
            System.out.println("Enter student Name : ");
            String Name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Enter student Semester : ");
            int semester = scanner.nextInt();
            System.out.println("Enter student CPI : ");
            double CPI = scanner.nextDouble();
            students[i] = new Student_Detail(Enrollment_No, Name, semester, CPI);
        }
        for (int i = 0; i < 5; i++) {
            students[i].display();
        }
    }
}
