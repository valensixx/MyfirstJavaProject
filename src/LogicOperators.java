import java.util.Scanner;

public class LogicOperators {
    public static void main(String[] args) {

        /*
        // && example:
        int temp = 25;

        if(temp > 30){
            System.out.println("It is hot today!");
        }
        else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm today!");
        }
        else{
            System.out.println("It is cold today!");
        }
        */

        // ------------------------------------------------------------------------------------------------------


        // || example:
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing my game now! Press v or V to quit.");
        String response = scanner.next(); // it will store a key value in it (like 'v' for example).

        if (!response.equals("v") && !response.equals("V")){
            System.out.println("You are still in the game.");
        }
        else{
            System.out.println("You quit the game!");
        }

    }
}
