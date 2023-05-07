package JavaBeginnerEx;

import java.util.Scanner;
import java.lang.Math;

//Find the area of triangle by 3 given sides
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter side b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter side c: ");
        double c = scanner.nextDouble();

        double s = (a+b+c)/2;
        System.out.println("The S of the triangle is: "+s);

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is: "+area);

    }
}
