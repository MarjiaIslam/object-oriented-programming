package Class01;


import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args){
        int[] myArray = new int[5];
        myArray[2] = 15;
//        System.out.println(myArray[2]);
        System.out.println(myArray.length);

        //twoD array
        int[][] twoD = new int[4][];
        twoD[0] = new int[3];
        twoD[1] = new int[2];
        twoD[2] = new int[1];
        twoD[3] = new int[3];


        for (int[] x : twoD){
            System.out.println(Arrays.toString(x));
        }
        System.out.println(twoD[3].length);
//        System.out.println(twoD[2]);

    }
}