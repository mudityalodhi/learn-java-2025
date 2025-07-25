public class CountPNZ {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, -6, 0, 3, -8, -1, 2, 0 };

        int positive = 0, negative = 0, zero = 0;

        for (int i : arr) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive : " + positive);
        System.out.println("Negative : " + negative);
        System.out.println("Zero : " + zero);
    }
}
