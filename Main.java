
import java.awt.Point;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
// user input
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Hi! what is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi "+ name);*/

// if else

        int x1 = scanner.nextInt();
        if (x1 == 5){
                System.out.println("good");
        }
        else{
                System.out.println("bad");
        }
// loops
        int x2 = scanner.nextInt();
        if (x2 > 10){
                System.out.println("bad");
        }
        if(x2 <= 10 && x2 >= 0) {
                
                while (x2 <= 10){
                        System.out.println(x2);
                        (x2)++;
                }
        }
        else{
                for (int i= (x2); i <= 0; i++){
                        System.out.println(i);
                }
        }
        int c = 5;
        do {
                System.out.println(c);
                c++;
        }while(c<10);
        
        
    }
}