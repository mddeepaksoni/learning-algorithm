package me.deepak.learning.algorithm.ctci.ch1;

import java.util.Objects;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * Hints: #44, #777, #732
 */
public class Ex1IsUnique {

    static boolean process(String str) {
        if (Objects.isNull(str) || str.length() <= 1) {
            return true;
        }

        if (str.length() > 128) {
            return false;
        }

        boolean[] isCharPresent = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            if (isCharPresent[(int) str.charAt(i)]) {
                return false;
            }
            isCharPresent[(int) str.charAt(i)] = true;
        }


        return true;
    }

}
