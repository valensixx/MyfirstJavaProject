import java.util.*;
public class ArraysTwoDem {
    // We are making a list of items in another list here!
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("protein powder");

        ArrayList<String> vitaList = new ArrayList<>();
        vitaList.add("apple");
        vitaList.add("orange");
        vitaList.add("lemon");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("vodka");
        drinkList.add("uzo");
        drinkList.add("rakija");

        groceryList.add(bakeryList);
        groceryList.add(vitaList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(2).get(1));
    }
}
