public class InvertedRightTriangle {
    public static void main(String[] args) {
        
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// ⭐ Pattern banana = Outer loop for rows, Inner loop for columns/stars.
// Count dekho, pattern observe karo → loop condition banao.

// *****
// ****
// ***
// **
// *
