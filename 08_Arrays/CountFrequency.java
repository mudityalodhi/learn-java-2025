public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = { 12, 12, 10, 2, 3, 1, 2, 0, 2, 1, 2, 5, 15, 15 };
        int key = 15, count = 0;

        for (int i : arr) {
            if (i == key) {
                count++;
            }
        }
        System.out.println("Frequency of " + key + " : " + count);
    }
}
