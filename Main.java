
import java.awt.Point;
import java.util.Arrays;
import java.util.Date;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hi I am Arka1!");
/*The following  is the way to create new objects*/
        String s1 = new String("First string object");
        Date newDate = new Date();
        System.out.println(s1);
        System.out.println(newDate);
// Primitive data or Call by value
        int a = 5;
        int b = a;
        a = 7;
        System.out.println(b);
// Non- Primitive or Call by Reference
        Point a1 = new Point(1, 2);
        Point b1 = a1;
        a1.x = 10;
        System.out.println(b1);
// String methods
        String s2 = new String("Arka Mandal");
        System.out.println(s2.contains("Arka"));
        System.out.println(s2.toUpperCase());
        System.out.println(s2.startsWith("b"));
        System.out.println(s2.indexOf("Mank"));
        System.out.println(s2.charAt(5));
        System.out.println(s2.replace("Arka", "Jubin"));
// Arrays 
        int[] marks = new int[] {50,60,70,80,90};
        System.out.println(Arrays.toString(marks));
        int[][] newMarks = new int [][] {{50,55,60},{90,95,100}};
        System.out.println(Arrays.deepToString(newMarks));

        int[] a2 = new int[] {5,15,20,10};
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));
// final keyword
         final float PI = 3.14F;
// Casting
        long a3 = 10;
        int b3 = (int) a3;

        int x = Integer.parseInt("69");
        System.out.println(x);

// Math class
         System.out.println(Math.max(a, b3));
         System.out.println(Math.min(a, b3));

         float f = 69.69F;
         System.out.println(Math.floor(f));
         System.out.println(Math.ceil(f));
         System.out.println(Math.round(f));

         double random = Math.random();
         System.out.println(random + 50 );

         System.out.println(Math.pow(random, b3));
    }
}