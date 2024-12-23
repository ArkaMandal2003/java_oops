
import java.util.Scanner;

// q1. implement s= ut + 1/2 at^2
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the initial speed:");
        double speed = scanner.nextDouble();

        double time;
        do{
            System.out.println("enter the time:");
        time = scanner.nextDouble();
}while(time < 0);

        System.out.println("enter the accelaration:");
        double acc = scanner.nextDouble();

        double distance = (speed * time) + (0.5 * acc * time * time);
        System.out.println("The distance covered is: "+ distance);


    }
}
