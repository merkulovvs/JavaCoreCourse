package module2;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/3/2016.
 */
public class ModulusOfDoubleArray {
    public static void main(String[] args) {
        double [] arrayOfDoubles = {3.7, -10.1258, 15.00217, -1.0344, 3.14, 9.0852, 5.552, 18.999999, -8.1128, 2.5};

        System.out.println("The array is: " + (Arrays.toString(arrayOfDoubles)));
        double arrayModulus = modulus(arrayOfDoubles);
        System.out.println("The modulus of this array is: " + arrayModulus);
    }
    public static double modulus(double array[]){
        double modulus = array[array.length-1];
        for(int i=1; i<10; i++)
            modulus %= array[i];
        return modulus;
    }
}
