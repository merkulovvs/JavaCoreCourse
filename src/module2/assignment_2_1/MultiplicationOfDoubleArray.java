package module2.assignment_2_1;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/3/2016.
 */
public class MultiplicationOfDoubleArray {
    public static void main(String[] args) {
        double [] arrayOfDoubles = {3.7, -10.1258, 15.00217, -1.0344, 3.14, 9.0852, 5.552, 18.999999, -8.1128, 2.5};

        System.out.println("The array is: " + (Arrays.toString(arrayOfDoubles)));
        double arrayProduct = product(arrayOfDoubles);
        System.out.println("The product of this array is: " + arrayProduct);
    }
    public static double product(double array[]){
        double product = array[array.length-1];
        for(int i=1; i<10; i++)
            product *= array[i];
        return product;
    }
}
