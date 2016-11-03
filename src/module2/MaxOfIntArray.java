package module2;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/3/2016.
 */
public class MaxOfIntArray {
    public static void main(String[] args) {
        int[] arrayOfInts = {23, 12, 1, 3, 8, -3, 5, 19, -12, 2};

        System.out.println("The array is: " + (Arrays.toString(arrayOfInts)));
        int arrayMaxValue = max(arrayOfInts);
        System.out.println("The maximum value in this array is: " + arrayMaxValue);
    }

    public static int max(int array[]) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        return max;
    }
}
