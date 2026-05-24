import java.util.*;
public class primeno {
    public static void main(String args[]) {
        //int n = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = sc.nextInt();
        boolean prime = true;
        if (n<1)
            prime = false;
        for (int i =2; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                prime = false;
                break;
            }
        }
    System.out.println(prime);
    sc.close();
    }
}