// 1️⃣ Interface: ExamRules
interface ExamRules {
    void examEligibility();
}

// 2️⃣ Abstract Class: Student
abstract class Student {
    static int studentCount = 0; // shared counter
    final String collegeName = "DSMNRU University"; // final can't be changed

    String name;
    int age;
    int id;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++studentCount; // auto-incremented ID
    }

    abstract void displayDetails(); // abstract method
}

// 3️⃣ Concrete Class: CollegeStudent
class CollegeStudent extends Student implements ExamRules {
    int marks;

    // constructor
    public CollegeStudent(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }

    // abstract method implementation
    void displayDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("College: " + this.collegeName);
        System.out.println("Marks: " + this.marks);
    }

    // interface method implementation
    public final void examEligibility() {
        if (marks >= 40) {
            System.out.println("Eligible for exam ✅");
        } else {
            System.out.println("Not eligible for exam ❌");
        }
    }
}

// 4️⃣ Main Class
public class MiniProject {
    public static void main(String[] args) {
        CollegeStudent s1 = new CollegeStudent("Muditya", 21, 75);
        CollegeStudent s2 = new CollegeStudent("Riya", 20, 30);

        s1.displayDetails();
        s1.examEligibility();

        System.out.println("------------");

        s2.displayDetails();
        s2.examEligibility();

        System.out.println("\nTotal Students: " + Student.studentCount);
    }
}
