public class Array1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; // ✅ Method 1: Direct initialization
        int[] arr1 = new int[4]; // ✅ Method 2: Declaration with fixed size

        // Stack:         Heap:

        // ---------      ---------------
        // arr──────►     [1][2][3][4][5]       ← arr points here
        // arr1 ────►     [0][0][0][0]          ← default-initialized

    }
}
