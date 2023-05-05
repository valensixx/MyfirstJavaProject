public class IfStatements {
    public static void main(String[] args) {

        int age = 76;

        if(age>=75){
            System.out.println("You are un old person, but with a young soul! :P");
        }
        else if(age>=18){
            System.out.println("You are un adult.");
        } else if (age>=13) {
            System.out.println("You are a teenager");
        } else{
            System.out.println("You are not an adult!");
        }
    }
}
