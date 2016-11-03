package module2;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/3/2016.
 */
public class MinOfDoubleArray {
    public static void main(String[] args) {
    double [] arrayOfDoubles = {3.7, -10.1258, 15.00217, -1.0344, 3.14, 9.0852, 5.552, 18.999999, -8.1128, 2.5};

        System.out.println("The array is: " + (Arrays.toString(arrayOfDoubles)));
        double arrayMinValue = min(arrayOfDoubles);
        System.out.println("The minimum value in this array is: " + arrayMinValue);
}

    public static double min(double array[]) {
        Arrays.sort(array);
        double min = array[0];
        return min;
    }
}
