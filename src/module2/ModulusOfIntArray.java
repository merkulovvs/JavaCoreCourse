package module2;

import java.util.Arrays;

/**
 * Created by merkulovvs on 11/3/2016.
 */
public class ModulusOfIntArray {
    public static void main(String[] args) {
        int [] arrayOfInts = {23, 12, 1, 3, 8, -3, 5, 19, -12, 2};

        System.out.println("The array is: " + (Arrays.toString(arrayOfInts)));
        int arrayModulus = modulus(arrayOfInts);
        System.out.println("The modulus of this array is: " + arrayModulus);
    }
    public static int modulus(int array[]){
        int modulus = array[0];
        for(int i=1; i<10; i++)
            modulus %= array[i];
        return modulus;
    }
}
