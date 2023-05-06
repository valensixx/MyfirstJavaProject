package JavaBeginnerEx;

import java.util.Scanner;

public class SumOfTwoArr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i];
        }

        System.out.println("The sum of the elements in the first array is: " + sum1);

        System.out.print("Enter the number of elements in the second array: ");
        int m = scanner.nextInt();

        int[] arrr = new int[m];

        System.out.println("Enter the elements of the second array: ");
        for(int j = 0; j < m; j++){
            arrr[j] = scanner.nextInt();
        }

        int sum2 = 0;
        for(int j = 0; j < m; j++){
            sum2 += arrr[j];
        }

        System.out.println("The sum of the elements in the second array is: " + sum2);

        int sum = sum1 + sum2;
        System.out.println("The sum of the two arrays is: " + sum);

        scanner.close();
    }
}