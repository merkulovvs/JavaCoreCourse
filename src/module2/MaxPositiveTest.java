package module2;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/5/2016.
 */
public class MaxPositiveTest {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[]{-23, -12, -1, -3, -8, -3, -5, -19, -12, -2};
        System.out.println("The array is: " + (Arrays.toString(arrayOfInts)));
        int negativeNumbers = 0;
        for (int i : arrayOfInts) {
            if (i < 0) negativeNumbers++;
        }

        if (negativeNumbers == arrayOfInts.length) {
            System.out.println("There are no positive values in this array");
        } else {
            int arrayMaxPositiveValue = max(arrayOfInts);
            System.out.println("The maximum positive values in this array is: " + arrayMaxPositiveValue);
        }
    }
    public static int max(int array[]) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        return max;
    }
}
