public class LoopDemo
{
    public static void main(String args[])
    {
        // ---------------- FOR LOOP ----------------
        // Used when number of iterations is known
        System.out.println("--- for loop ---");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i);
        }

        // ---------------- WHILE LOOP ----------------
        // Used when condition is checked before execution
        System.out.println("\n--- while loop ---");
        int i = 1;
        while (i <= 5)
        {
            System.out.println(i);
            i++;
        }

        // ---------------- DO-WHILE LOOP ----------------
        // Executes at least once before checking condition
        System.out.println("\n--- do-while loop ---");
        int j = 1;
        do
        {
            System.out.println(j);
            j++;
        }
        while (j <= 5);
    }
}