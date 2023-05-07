package JavaBeginnerEx;

import java.util.Scanner;

//Convert temperature from C to F
//Also from F to C
public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter temperature in C: ");
        double tempC = scanner.nextDouble();

        System.out.println("Please enter temperature in F: ");
        double tempF = scanner.nextDouble();

        double convertedTempC = (tempF - 32) *5/9;
        double convertedTempF = (tempC * 9/5) +32;

        System.out.println("Temperature of C to F is: "+convertedTempF);
        System.out.println("Temperature of F to C is:"+convertedTempC);


    }
}
