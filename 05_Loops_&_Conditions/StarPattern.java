public class StarPattern {
    public static void main(String[] args) {

        // 🧠 Tip to Never Forget:
        // 🌟 "i is the row number, j is the number of stars in that row.
        // Always run j loop from 0 to i to print increasing stars."

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
