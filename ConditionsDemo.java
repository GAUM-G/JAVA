public class ConditionsDemo
{
    public static void main(String args[])
    {
        // ---------------- if statement ----------------
        // Checks single condition
        int a = 10;
        System.out.println("--- if statement ---");
        if (a > 5) {
            System.out.println("a is greater than 5");
        }

        // ---------------- if-else ----------------
        // Checks two possibilities (true/false)
        System.out.println("\n--- if-else ---");
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // ---------------- if-else if ladder ----------------
        // Used for multiple conditions
        System.out.println("\n--- if-else if ladder ---");
        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade A");
        } 
        else if (marks >= 75) {
            System.out.println("Grade B");
        } 
        else if (marks >= 60) {
            System.out.println("Grade C");
        } 
        else {
            System.out.println("Fail");
        }

        // ---------------- switch statement ----------------
        // Used for fixed value matching
        System.out.println("\n--- switch statement ---");
        int day = 3;

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}