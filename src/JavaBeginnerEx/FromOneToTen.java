package JavaBeginnerEx;

//Print numbers in reverse order:
//Write a program that uses a do-while loop to print the numbers from 10 to 1 in descending order.
public class FromOneToTen {
    public static void main(String[] args) {
        int i = 10;
        do{
            System.out.println(i);
            i--;
        }while(i>=1);

    }
}
