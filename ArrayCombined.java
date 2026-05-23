import java.util.*;

public class ArrayCombined
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        // ---------------- INPUT ----------------
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }

        // ---------------- OUTPUT ----------------
        System.out.println("\nArray elements are:");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(arr[i] + " ");
        }

        // ---------------- SUM ----------------
        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            sum += arr[i];
        }
        System.out.println("\n\nSum = " + sum);

        // ---------------- MAX ----------------
        int max = arr[0];
        for (int i = 1; i < 5; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum element = " + max);
        sc.close();
    }
}