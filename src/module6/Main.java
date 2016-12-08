package module6;

import java.util.Arrays;

/**
 * Created by merkulovvs on 12/8/2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("The reverse array of array " + Arrays.toString(array) + " is array " +
                Arrays.toString(ArraysUtils.reverse(array)));

        


    }
}
