package Class02;

import java.util.Arrays;

public class TwoDArrayExercise {
    public static void main(String[] args) {
        int[][] twoD = new int[4][];
        twoD[0] = new int[]{7,8,9,10};
        twoD[1] = new int[]{4,5,6};
        twoD[2] = new int[]{2,3};
        twoD[3] = new int[]{1};

        for (int[] x : twoD){
            System.out.println(Arrays.toString(x));
        }

    }
}
