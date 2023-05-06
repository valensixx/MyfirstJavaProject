public class Methods {
    public static void main(String[] args) {
        //method is a block of code that is executed whenever it is called

        String name = "Valentin";
        int age = 28;

        int x=3;
        int y=4;

        int z = add(x,y); //we can use int z, because it that case it is local var
        System.out.println(z);

        hello(name,age);
    }

   static void hello(String name, int age){ //this is hello method!!
        System.out.println("Hello "+name);
        System.out.println("You are "+age);
    }

    static int add(int x, int y){
        int z = x+y;
        return z;
    }
}
