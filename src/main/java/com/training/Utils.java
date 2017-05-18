package com.training;

/**
 * Created by Opleiding on 18/05/2017.
 */
public class Utils {

    public static int add(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
