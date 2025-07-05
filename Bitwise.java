public class Bitwise {
    public static void main(String[] args) {
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011

        System.out.println("a = " + a); 
        System.out.println("b = " + b);

        // AND
        System.out.println("a & b = " + (a & b)); // 0101 & 0011 = 0001 → 1

        // OR
        System.out.println("a | b = " + (a | b)); // 0101 | 0011 = 0111 → 7

        // XOR
        System.out.println("a ^ b = " + (a ^ b)); // 0101 ^ 0011 = 0110 → 6

        // NOT
        System.out.println("~a = " + (~a)); // ~0101 = 1010 (2's complement → -6)

        // Left Shift
        System.out.println("a << 1 = " + (a << 1)); // 0101 << 1 = 1010 → 10

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 >> 1 = 0010 → 2

        // Unsigned Right Shift
        int x = -8;
        System.out.println("x >>> 1 = " + (x >>> 1)); // fills 0 on left (no sign bit)
    }
}
