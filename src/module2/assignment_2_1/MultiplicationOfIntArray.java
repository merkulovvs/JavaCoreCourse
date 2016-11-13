package module2.assignment_2_1;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/3/2016.
 */
public class MultiplicationOfIntArray {
    public static void main(String[] args) {
        int [] arrayOfInts = {23, 12, 1, 3, 8, -3, 5, 19, -12, 2};

        System.out.println("The array is: " + (Arrays.toString(arrayOfInts)));
        int arrayProduct = product(arrayOfInts);
        System.out.println("The product of this array is: " + arrayProduct);
    }
    public static int product(int array[]){
        int product = array[0];
        for(int i=1; i<10; i++)
            product *= array[i];
        return product;
    }
}
