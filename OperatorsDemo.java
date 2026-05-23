public class OperatorsDemo
{
    public static void main(String args[])
    {
        // Inbuilt values for demonstration
        int a = 10, b = 5;

        System.out.println("A = " + a + ", B = " + b);

        // ---------------- Arithmetic Operators ----------------
        // Used for basic mathematical operations
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("Addition (a + b) = " + (a + b));
        System.out.println("Subtraction (a - b) = " + (a - b));
        System.out.println("Multiplication (a * b) = " + (a * b));
        System.out.println("Division (a / b) = " + (a / b));
        System.out.println("Modulus (a % b) = " + (a % b));

        // ---------------- Relational Operators ----------------
        // Used to compare two values (returns true/false)
        System.out.println("\n--- Relational Operators ---");
        System.out.println("Equal (a == b) : " + (a == b));
        System.out.println("Not Equal (a != b) : " + (a != b));
        System.out.println("Greater Than (a > b) : " + (a > b));
        System.out.println("Less Than (a < b) : " + (a < b));
        System.out.println("Greater or Equal (a >= b) : " + (a >= b));
        System.out.println("Less or Equal (a <= b) : " + (a <= b));

        // ---------------- Logical Operators ----------------
        // Used to combine multiple conditions (true/false logic)
        boolean x = true, y = false;

        System.out.println("\n--- Logical Operators ---");
        System.out.println("AND (x && y) : " + (x && y));
        System.out.println("OR (x || y) : " + (x || y));
        System.out.println("NOT (!x) : " + (!x));

        // ---------------- Assignment Operators ----------------
        // Used to assign and update values
        System.out.println("\n--- Assignment Operators ---");
        int c = 10;
        System.out.println("c = " + c);
        c += 5; // c = c + 5
        System.out.println("c += 5 : " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3 : " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2 : " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2 : " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3 : " + c);

        // ---------------- Unary Operators ----------------
        // Used with single operand (increment/decrement)
        System.out.println("\n--- Unary Operators ---");
        int d = 5;
        System.out.println("Initial d = " + d);
        System.out.println("Post Increment (d++) : " + (d++));
        System.out.println("After Post Increment : " + d);
        System.out.println("Pre Increment (++d) : " + (++d));
        System.out.println("Post Decrement (d--) : " + (d--));
        System.out.println("Pre Decrement (--d) : " + (--d));

        // ---------------- Bitwise Operators ----------------
        // Used to perform operations at binary level
        System.out.println("\n--- Bitwise Operators ---");
        int p = 5, q = 3;
        System.out.println("AND (p & q) : " + (p & q));
        System.out.println("OR (p | q) : " + (p | q));
        System.out.println("XOR (p ^ q) : " + (p ^ q));
        System.out.println("NOT (~p) : " + (~p));
        System.out.println("Left Shift (p << 1) : " + (p << 1));
        System.out.println("Right Shift (p >> 1) : " + (p >> 1));

        // ---------------- Ternary Operator ----------------
        // Short form of if-else condition
        System.out.println("\n--- Ternary Operator ---");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b : " + max);
    }
} 
