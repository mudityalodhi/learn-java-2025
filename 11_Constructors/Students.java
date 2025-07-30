public class Students {
    String name;
    int rollNo;
    char grade;

    public Students(String name, int rollNo, char grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + rollNo);
        System.out.println("Grade : " + grade);
    }
}
