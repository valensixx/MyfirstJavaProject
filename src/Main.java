import model.Product;
import java.util.Scanner;

//Task 1 --> swap the value of x and y
public class Main {
    public static void main(String[] args) {
        String x = "water";
        String y = "kool-Aid";
        String temp = x;
        x = y;
        y = temp;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}