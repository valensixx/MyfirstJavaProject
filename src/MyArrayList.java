import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        // ArrayList is resizable array - elements can be added and removed after compilation phase.
        // It stoe reference data types
        // Difference between primitive and wrapper data types is that wrapper starts with capital letter:
        // (boolean,char,int,double) == (Boolean, Char, Int, Double)

        /*
         * Example of wrapper data types: Boolean a= true; Character b='@'; Double c=
         * 3.14; Integer d = 123; String e = "Name";
         */

        ArrayList<String> food = new ArrayList<String>();

        food.add("Spagetti");
        food.add("Pizza");
        food.add("Doner");

        food.set(0, "fish");
        food.remove(2);
        food.clear(); // this removes all elements in the array

        for(int i =0; i<food.size(); i++){
                System.out.println(food.get(i));
        }
    }
}