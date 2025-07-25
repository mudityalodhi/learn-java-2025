public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        int fac = 1;
        
        for (int i = n; i >= 1; i--) {
            fac = fac * i;
        }
        System.out.println("Factorial of " + n + " = " + fac);
    }
}
// Q13. Calculate factorial of a number
// 🔸 Input: 5
// 🔸 Output: 120