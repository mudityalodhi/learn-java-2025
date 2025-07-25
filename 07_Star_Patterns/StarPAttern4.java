public class StarPAttern4 {
    public static void main(String[] args) {
        int row = 4;

        for (int i = 1; i <= row; i++) {

            // space = (i - 1)
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            // stars = (row - i + 1)
            for (int j = row; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
