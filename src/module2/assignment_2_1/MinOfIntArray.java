package module2.assignment_2_1;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/3/2016.
 */
public class MinOfIntArray {
    public static void main(String[] args) {
        int[] arrayOfInts = {23, 12, 1, 3, 8, -3, 5, 19, -12, 2};

        System.out.println("The array is: " + (Arrays.toString(arrayOfInts)));
        int arrayMinValue = min(arrayOfInts);
        System.out.println("The minimum value in this array is: " + arrayMinValue);
    }

    public static int min(int array[]) {
        Arrays.sort(array);
        int min = array[0];
        return min;
    }
}