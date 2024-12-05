package Inheritence;

public class TwoDArray {

    public static void outputArray(int[][] array) {
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                System.out.printf("%d\t", array[row][column]);
            }
            System.out.println("\n");
        }

    }
    public static void main(String[] args) {
        int[][] array1 = {{1,2,3}, {4,5,6}};

        int[][] array2 = {{1,2,}, {3}, {4,5,6}};
        System.out.println("values in Array1 by row are : ");

        TwoDArray arr = new TwoDArray();
        arr.outputArray(array1);
        arr.outputArray(array2);
    }
}