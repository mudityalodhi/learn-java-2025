import java.util.Arrays;

public class NonPrimitiveTypes {
    public static void main(String[] args) {

        // 🔹 1. String (Most common non-primitive)
        String name = "Muditya Lodhi";
        System.out.println("Name: " + name);

        // 🔹 2. Array (Fixed-size collection of elements)
        int[] marks = { 90, 85, 88, 92 };
        System.out.println("Marks: " + Arrays.toString(marks)); // prints all array values

        // 🔹 3. Class (User-defined data type)
        Student student = new Student("Aman", 21);
        System.out.println("Student name: " + student.name);
        System.out.println("Student age: " + student.age);

        // 🔹 4. Object (base type for all classes)
        Object obj = "I am an object holding a String";
        System.out.println("Object content: " + obj);

        // 🔹 5. Enum (fixed set of constants)
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);
    }
}

// Custom class
class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Enum type example
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
