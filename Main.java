import java.nio.channels.Pipe.SourceChannel;
import java.util.Date;
import java.awt.Point;

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
// Non- Primitive or Call bt=y Reference
        Point a1 = new Point(1, 2);
        Point b1 = a1;
        a1.x = 10;
        System.out.println(b1);
    }
}