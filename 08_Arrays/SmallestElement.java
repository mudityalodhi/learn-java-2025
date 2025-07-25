public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 9, 8, -10, 32, 11, 0, 21, 10 };
        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Smallest : " + min);

    }
}
