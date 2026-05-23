import java.util.*;

public class StringCombined
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s;

        System.out.println("Enter a string:");
        s = sc.nextLine();

        System.out.println("\nString = " + s);

        // Length of string
        System.out.println("Length = " + s.length());

        // Character at specific index
        System.out.println("Char at index 2 = " + s.charAt(2));

        // Uppercase conversion
        System.out.println("Uppercase = " + s.toUpperCase());

        // Lowercase conversion
        System.out.println("Lowercase = " + s.toLowerCase());

        // Simple condition using string length
        if (s.length() > 5)
        {
            System.out.println("String is long");
        }
        else
        {
            System.out.println("String is short");
        }
        sc.close();
    }
}