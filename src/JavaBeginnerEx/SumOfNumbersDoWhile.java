package JavaBeginnerEx;

import java.util.Scanner;

//Sum of numbers:
//Write a program that asks the user to enter a series of numbers and calculates their sum using a do-while loop.
// The loop should continue until the user enters a negative number.
public class SumOfNumbersDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        int count = 0;

        do {
            System.out.print("Enter a number (or a negative number to exit): ");
            int number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
                count++;
            }
        } while (count < 3);

        System.out.println("Sum of the entered numbers: " + sum);
    }
}