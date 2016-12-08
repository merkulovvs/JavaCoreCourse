package module6;

import java.util.Arrays;

/**
 * Created by merkulovvs on 12/8/2016.
 */
public class ArraysUtils {

    public static final int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < 10; i++)
            sum += array[i];
        return sum;
    }

    public static final int min(int array[]) {
        Arrays.sort(array);
        int min = array[0];
        return min;
    }

    public static final int max(int array[]) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        return max;
    }

    public static final void maxPositive(int[] array) {
        int negativeNumbers = 0;
        for (int i : array)
            if (i < 0) negativeNumbers++;
        if (negativeNumbers == array.length) {
            System.out.println("There are no positive values in this array");
        } else {
            Arrays.sort(array);
            int max = array[array.length - 1];
            int arrayMaxPositiveValue = max;
            System.out.println("The maximum positive value in this array is: " + arrayMaxPositiveValue);
        }
    }

    public static final int product(int array[]) {
        int product = array[0];
        for (int i = 1; i < 10; i++)
            product *= array[i];
        return product;
    }

    public static final int modulus(int array[]) {
        int modulus = array[0];
        for (int i = 1; i < 10; i++)
            modulus %= array[i];
        return modulus;
    }

    public static final int secondLargest(int array[]) {
        Arrays.sort(array);
        int secondLargest = array[array.length - 2];
        return secondLargest;
    }

    public static final int[] reverse(int[] array) {

        int[] revArr = new int[array.length];
        for (int i = array.length-1; i>=0; i--){
            revArr[((array.length-1)-i)] = array[i];

//        for (int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
        }
        return revArr;
    }

    public static final int[] findEvenElements(int[] array) {
        int count = 0;
        for (int num : array)
            if (num%2==0)
                count++;
        int[] evenNums = new int[count];
        int i = 0;
        for (int num : array)
            if (num%2==0){
            evenNums[i]=num;
            i++;
            }
            return evenNums;
    }


}
