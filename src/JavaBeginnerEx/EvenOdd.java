package JavaBeginnerEx;
import java.util.Scanner;
// You must check if number is even or odd;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an int number: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("The number is Even! "+number);
        }else{
            System.out.println("The number is Odd! " +number);
        }

    }
}
