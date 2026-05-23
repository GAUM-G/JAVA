public class parse {
    public static void main (String[] args) {
        int a = Integer.parseInt(args[0]);
        float b = Float.parseFloat(args[1]);
        float c = a+b ;
        System.out.println("Sum = " +c);
        System.out.println("hello");
    }
}
// javac parse.java
// java parse 2 3
// Sum is 5