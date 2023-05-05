public class ForLoop {
    //for loop = executes a block of code limited amount of times
    public static void main(String[] args) {


         for(int i = 0; i<=10; i++){
            System.out.println(i);
        }



        for(int i = 10; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("Happy new year!");



        for (int i = 10; i>=0; i-=2){
            System.out.println(i);
        }
        System.out.println("Happy new year!");

        //You can also put i-=2; out of the for loop and it will work the same!
        /*
        for (int i = 10; i>=0;){
            System.out.println(i);
            i-=2;
        }
        System.out.println("Happy new year!");
        */
    }
}
