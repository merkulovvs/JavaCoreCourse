package module2.assignment_2_1;

import module6.ArraysUtils;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/3/2016.
 */
public class MaxPositiveOfIntArray {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[]{23, 12, 1, 3, 8, -3, 5, 19, -12, 2};
        System.out.println("The array is: " + (Arrays.toString(arrayOfInts)));
        ArraysUtils.maxPositive(arrayOfInts);
    }

    /*private static void maxPositive(int[] arrayOfInts) {
        int negativeNumbers = 0;
        for (int i : arrayOfInts) {
            if (i < 0) negativeNumbers++;
        }

        if (negativeNumbers == arrayOfInts.length) {
            System.out.println("There are no positive values in this array");
        }
        else {
            Arrays.sort(arrayOfInts);
            int max = arrayOfInts[arrayOfInts.length - 1];
            int arrayMaxPositiveValue = max;
            System.out.println("The maximum positive value in this array is: " + arrayMaxPositiveValue);
        }
    }*/
    /*public static int max(int array[]) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        return max;
    }*/
}
