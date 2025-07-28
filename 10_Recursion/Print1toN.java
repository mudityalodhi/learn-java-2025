public class Print1toN {
    public static void print1toN(int n) {
        if (n == 0) {
            return; // Base case
        }

        print1toN(n - 1); // Recursive call pehle
        System.out.print(n + " "); // Baad mein print karo
    }

    public static void main(String[] args) {
        print1toN(5);
    }
}
