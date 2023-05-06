import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        //it takes less steps to take the job and it is more readable
        //it is less flexible

        //String[] animals= {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i: animals){  //for every string i in animals
            System.out.println(i);
        }

    }
}
