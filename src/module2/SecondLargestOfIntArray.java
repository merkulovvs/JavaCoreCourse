package module2;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/3/2016.
 */
public class SecondLargestOfIntArray {
    public static void main(String[] args) {
        int[] arrayOfInts = {23, 12, 1, 3, 8, -3, 5, 19, -12, 2};

        System.out.println("The array is: " + (Arrays.toString(arrayOfInts)));
        int arraySecondLargest = secondLargest(arrayOfInts);
        System.out.println("The second largest value in this array is: " + arraySecondLargest);
    }

    public static int secondLargest(int array[]) {
        Arrays.sort(array);
        int secondLargest = array[array.length - 2];
        return secondLargest;
    }
}
