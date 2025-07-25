import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of queries

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();  // starting number
            int b = in.nextInt();  // multiplying number
            int n = in.nextInt();  // number of terms

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
