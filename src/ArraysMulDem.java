public class ArraysMulDem {
    public static void main(String[] args) {
        //2d array is array of arrays:

        /*
        String[][] cars = new String[3][3];

        cars[0][0] = "BMW";    //cars[row][col]
        cars[0][1] = "Mercedes-Benz";
        cars[0][2] = "Audi";
        cars[1][0] = "Honda";
        cars[1][1] = "Mazda";
        cars[1][2] = "Lexus";
        cars[2][0] = "Camaro";
        cars[2][1] = "Ferrari";
        cars[2][2] = "Tesla";
        */


        //other way of doing the task:
        String[][] cars = {
                {"BMW", "Mercedes-Benz", "Audi"}, //this is row 0
                {"Honda", "Mazda", "Lexus"},   //row 1
                {"Camaro", "Ferrari", "Tesla"}  //row 2}
                };

        for(int i = 0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.println(cars[i][j]+" ");
            }
        }
    }
}
