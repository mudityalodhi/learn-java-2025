public class OnlyEven {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 8, 20, 15, 7, 6, 1 };

        System.out.print("Even : ");

        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
