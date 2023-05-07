package JavaBeginnerEx;

import java.util.Scanner;

// Display the given integer in reverse order
public class IntReversOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int: ");
        String input = scanner.nextLine();

        // Convert input to array of characters
        char[] digits = input.toCharArray();

        // Reverse the array
        int i = 0;
        int j = digits.length - 1;
        while (i < j) {
            char temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;
            i++;
            j--;
        }

        // Convert the reversed array back to string and parse as integer
        int number = Integer.parseInt(new String(digits));

        System.out.println(number);
    }
}