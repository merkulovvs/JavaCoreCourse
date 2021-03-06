package module2.assignment_2_1;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/3/2016.
 */
public class MaxPositiveOfDoubleArray {
    public static void main(String[] args) {
        double [] arrayOfDoubles = {3.7, -10.1258, 15.00217, -1.0344, 3.14, 9.0852, 5.552, 18.999999, -8.1128, 2.5};
        System.out.println("The array is: " + (Arrays.toString(arrayOfDoubles)));
        int negativeNumbers = 0;
        for (double i: arrayOfDoubles) {
            if (i < 0) negativeNumbers++;
        }
        if (negativeNumbers == arrayOfDoubles.length) {
            System.out.println("There are no positive values in this array");
        }

        else {
            double arrayMaxValue = max(arrayOfDoubles);
            System.out.println("The maximum positive value in this array is: " + arrayMaxValue);
        }
    }

    public static double max(double array[]) {
        Arrays.sort(array);
        double max = array[array.length-1];
        return max;
    }
}
