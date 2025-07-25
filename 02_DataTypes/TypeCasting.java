// Demonstration of Type Casting in Java

public class TypeCasting {
    public static void main(String[] args) {

        // 🔷 WIDENING (IMPLICIT CASTING)
        // Smaller → Larger type (Java does this automatically)
        int a = 100;
        long l = a;          // int to long
        float f = l;         // long to float

        System.out.println("🔹 Widening Casting:");
        System.out.println("int a = " + a);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);

        System.out.println("----------------------");

        // 🔶 NARROWING (EXPLICIT CASTING)
        // Larger → Smaller type (manual conversion)
        double d = 123.456;
        int i = (int) d;     // fractional part is lost
        byte b = (byte) i;   // possible overflow if out of byte range

        System.out.println("🔸 Narrowing Casting:");
        System.out.println("double d = " + d);
        System.out.println("int i = (int) d = " + i);
        System.out.println("byte b = (byte) i = " + b);

        System.out.println("----------------------");

        // 🔄 Example of overflow in narrowing
        int bigNum = 260;
        byte smallByte = (byte) bigNum;  // byte range = -128 to 127

        System.out.println("🔁 Overflow Example in Narrowing:");
        System.out.println("int bigNum = " + bigNum);
        System.out.println("byte smallByte = (byte) bigNum = " + smallByte); // Output: 4

        // 👉 Explanation:
        // byte has range: -128 to 127 (total 256 values)
        // 260 % 256 = 4 → that's why we get 4

        System.out.println("----------------------");

        // 🔄 BONUS: byte a = 5; why a = a + 5 gives error, but a += 5 doesn't

        byte x = 5;

        // ❌ Compilation Error: a + 5 = int, can't assign int to byte
        // x = x + 5;

        // ✅ No error, because += automatically handles casting internally
        x += 5;

        System.out.println("🔹 Compound Assignment vs Normal:");
        System.out.println("byte x = 5 → x += 5 → x = " + x);
    }
}
