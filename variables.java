//import java.util.*;
public class variables {
    public static void main(String[] args) {
        byte b =100;
        short s= 20000;
        int i = 100000;
        long l = 10000000000L;
        float f = 3.14f;
        double d = 3.141592653589793;
        char c = 'A';
        boolean bool = true;
        String name="Gautam";

        System.out.println("Byte: "+ b + "\t\t\t\tSize: " + Byte.SIZE/8 + " bytes");
        System.out.println("Short: "+ s + "\t\t\t\tSize: " + Short.SIZE/8 + " bytes");
        System.out.println("Int: "+ i + "\t\t\t\tSize: " + Integer.SIZE/8 + " bytes");
        System.out.println("Long: "+ l + "\t\t\tSize: " + Long.SIZE/8 + " bytes");
        System.out.println("Float: "+ f + "\t\t\t\tSize: " + Float.SIZE/8 + " bytes");
        System.out.println("Double: "+ d + "\t\tSize: " + Double.SIZE/8 + " bytes");
        System.out.println("Char: "+ c + "\t\t\t\t\tSize: " + Character.SIZE/8 + " bytes");
        System.out.println("Boolean: "+ bool + "\t\t\t\tSize: " + " JVM dependent");
        System.out.println("String: "+ name);
    }
}