package com.training;

/**
 * Created by hassan on 18/05/2017.
 */
public class Utils {
    public static int add(int... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[0];
        }
        return result;
    }
}

