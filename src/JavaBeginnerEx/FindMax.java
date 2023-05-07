package JavaBeginnerEx;

//find the biggest number: int[] arr = {2,6,7,20,8,50};
//find the lowest number:
//find 5-th element in the array.
public class FindMax {
    public static void main(String[] args) {
        int[] arr = {2,6,7,20,8,50};
        int biggestNumber = arr[0];
        for (int i: arr){
            if(i> biggestNumber){
                biggestNumber =i;
            }
        }
        System.out.println("The biggest number in the array is: " + biggestNumber);

        int lowestNumber = arr[0];
        for(int j: arr){
            if ( j< lowestNumber){
                lowestNumber = j;
            }
        }
        System.out.println("The lowest number in the array is: " + lowestNumber);

        int fifthElement =arr[4];
        System.out.println("The fifth element in the array is: "+arr[4]);
    }
}
