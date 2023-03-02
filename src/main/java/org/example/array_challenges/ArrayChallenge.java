package org.example.using_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        Integer[] firstArray = generateNum(10);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(firstArray));

        //to sort array in reverse order use the wrapper class Integer to declare the array instead of int
        Integer[] newArray = {10,324,54,4,64,23,5,76,66,3};
        Arrays.sort(newArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(newArray));

    }
    private static Integer[] generateNum(int num) {
        Random random = new Random();
        Integer[] newInt = new Integer[num];
        for (int i = 0; i < num; i++){
            newInt[i] = random.nextInt(51);
        }
        return newInt;
    }

}
