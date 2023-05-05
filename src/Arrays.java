public class Arrays {
    public static void main(String[] args) {
        //array is used to store multiple values in a single variable.

        String[] cars ={"BMW","Mercedes-Benz","Audi"};

        cars[0] = "Tesla";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);


        //Other way of solve this task:
        String[] newCars = new String[3];
        newCars[0] = "Honda";
        newCars[1] = "Mazda";
        newCars[2] = "Lexus";
        System.out.println(newCars[0]);
        System.out.println(newCars[1]);
        System.out.println(newCars[2]);

        //Here I am using for loop to display all data in the array
        for(int i=0; i<=newCars.length;i++){
            System.out.println(newCars[i]);
        }
    }
}
