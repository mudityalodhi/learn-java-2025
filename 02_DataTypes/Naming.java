// Demonstration of valid variable naming in Java

public class Naming {
    public static void main(String[] args) {
        // Valid variable name
        int salary = 15000;
        System.out.println("Salary is: " + salary);

        // -------------------------------
        // 🔍 Java Variable Naming Rules:
        // -------------------------------

        // 1. Case sensitive:
        int Salary = 20000;
        System.out.println("Salary (capital S) is: " + Salary);
        // 'salary' and 'Salary' are two different variables

        // 2. Can contain letters, numbers, $ and _ (but not start with numbers)
        int mySalary2 = 17000;
        int $bonus = 3000;
        int _tax = 200;

        System.out.println("My Salary 2: " + mySalary2);
        System.out.println("Bonus: " + $bonus);
        System.out.println("Tax: " + _tax);

        // 3. Cannot start with numbers → ❌ int 2value = 50;
        // 4. Cannot use reserved keywords like `class`, `int`, `public` as variable
        // names
        // 5. Use meaningful names (recommended)
    }
}
