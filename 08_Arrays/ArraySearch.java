public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = { 11, 92, 53, 24, 55, 26 };
        int key = 55; // value to search

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
