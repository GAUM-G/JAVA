import java.util.*;
public class inputoutput {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter salary: ");
        float salary = sc.nextFloat();
        System.out.println("Entered name: "+name);
        System.out.println("Entered age: "+age);
        System.out.println("Entered salary: "+salary);
    }
}