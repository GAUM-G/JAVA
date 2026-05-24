import java.util.*;
public class factorial {
    public static void main (String args[]) {
        //int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");;
        int n = sc.nextInt();
        int fact = 1;
        for(int i =1; i<=n; i++) {
            fact=fact*i; //fact*=i;
        }
        System.out.println("Factorial: "+fact);
        sc.close();
    }
}
// 1x1=1,1x2=2,2x3=6,6x4=24,24x5=120