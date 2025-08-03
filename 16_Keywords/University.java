public class University {

    final String name = "DSMNRU University";

    final void display() {
        System.out.println("University : " + name);
    }

    // Uncommenting this will cause an error
    // class ChildUniversity extends University {
    // void display() { // ❌ Cannot override final method
    // System.out.println("Child University");
    // }
    // }

    public static void main(String[] args) {
        University u = new University();
        u.display();

        // u.name = "XYZ"; // ❌ Cannot reassign final variable

    }
}