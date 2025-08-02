public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void checkResult() {
        if (marks > 33) {
            System.out.println(name + " passed the exam.");
        } else {
            System.out.println(name + " failed the exam.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Muditya", 91);
        System.out.println("Name " + s1.getName());
        s1.checkResult();
    }
}
