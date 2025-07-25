// Q5. Find grade from marks:
// >=90 → A
// >=80 → B
// >=70 → C
// >=60 → D
// else → F

public class FindGrades {
    public static void main(String[] args) {
        int marks = 79;

        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 70) {
            System.out.println("C");
        } else if (marks >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
