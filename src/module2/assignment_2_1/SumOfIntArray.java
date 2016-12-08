package module2.assignment_2_1;

/**
 * Created by merkulovvs on 11/3/2016.
 */
import module6.ArraysUtils;

import java.util.Arrays;
public class SumOfIntArray {
    public static void main(String[] args) {
        int [] arrayOfInts = {23, 12, 1, 3, 8, -3, 5, 19, -12, 2};

        System.out.println("The array is: " + (Arrays.toString(arrayOfInts)));
        int arraySum = ArraysUtils.sum(arrayOfInts);
        System.out.println("The sum of this array is: " + arraySum);
    }
    /*public static int sum(int array[]){
        int sum = 0;
        for(int i=0; i<10; i++)
            sum += array[i];
        return sum;
    }*/
}
