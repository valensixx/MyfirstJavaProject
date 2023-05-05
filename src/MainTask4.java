import java.util.Scanner;

//Task 4: find the hypotenuse of a triangle.
public class MainTask4 {
    public static void main(String[] args) {
        double x;
        double y;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        c = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is: "+c);

        scanner.close();
    }
}
