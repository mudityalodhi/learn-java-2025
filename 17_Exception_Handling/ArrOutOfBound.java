public class ArrOutOfBound {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        try {
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[4]); // 5th element (index 4) → Error
            System.out.println(arr[2]); // This line won't execute if exception occurs

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found");
        }
    }
}
