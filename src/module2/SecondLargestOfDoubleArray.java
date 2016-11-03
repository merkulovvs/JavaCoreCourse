package module2;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/3/2016.
 */
public class SecondLargestOfDoubleArray {
    public static void main(String[] args) {
        double [] arrayOfDoubles = {3.7, -10.1258, 15.00217, -1.0344, 3.14, 9.0852, 5.552, 18.999999, -8.1128, 2.5};
        System.out.println("The array is: " + (Arrays.toString(arrayOfDoubles)));
        double arraySecondLargest = secondLargest(arrayOfDoubles);
        System.out.println("The second largest value in this array is: " + arraySecondLargest);
    }

    public static double secondLargest(double array[]) {
        Arrays.sort(array);
        double secondLargest = array[array.length-2];
        return secondLargest;
    }
}
