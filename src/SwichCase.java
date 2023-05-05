class SwitchCase {
    public static void main(String[] args) {

        String day = "Friday";

        switch (day){
            case "Sunday": System.out.println("It is Sunday!");
            break;

            case "Monday": System.out.println("It is Monday");
            break;

            case "Tuesday": System.out.println("It is Tuesday");
            break;

            case "Wednesday": System.out.println("It is Wednesday");
            break;

            case "Thursday": System.out.println("It is Thursday");
            break;

            case "Friday": System.out.println("It is Friday");
            break;

            case "Saturday": System.out.println("It is Saturday");
            break;

            //if there is no match it will display default: System.out.println("There is no such day in the week!");
            default: System.out.println("There is no such day in the week!");

        }
    }
}
