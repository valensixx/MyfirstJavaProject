import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        //nested loop is a loop inside another loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
           columns = scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol = scanner.next(); //this line of code will give the user to add his own symbol till hit space or enter.

        for(int i =1; i<=rows; i++){
            System.out.println(); //this line of code will move the cursor one line down
            for(int j=1; j<=columns; j++){
               System.out.print(symbol);//it is important to use .print
            }
        }

    }
}
