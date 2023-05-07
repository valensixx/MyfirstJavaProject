package JavaBeginnerEx;

import java.util.Scanner;

public class SumOtTwo {
    public static void main(String[] args) {
        //To do -> take 2 numbers from users input and display the sum of it.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int m = scanner.nextInt();

        int sum = n+m;

        System.out.println("The sum is: "+ sum);
    }
}
