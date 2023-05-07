package JavaBeginnerEx;

import java.util.Scanner;

// do program that checks the given integer is a multiple of 5
public class IsMulOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println("Enter int number to check if it is multiple by 5: ");

        if(num %5 == 0)
        {
            System.out.println("The number "+num +"is multiple of 5");
        }
        else {
            System.out.println("The number "+num +"is NOT  multiple of 5");
        }
    }
}
