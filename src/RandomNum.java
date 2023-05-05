import java.util.Random;
public class RandomNum {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(6) +1; //the value (6) will limit the random value to 6.
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
