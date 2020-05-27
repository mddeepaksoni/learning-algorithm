package me.deepak.learning.algorithm.ctci.ch1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * Hints: #7, #84, #722, #737
 */
public class Ex2CheckPermutation {

    static boolean process(String str1, String str2) {
        if (Objects.isNull(str1) && Objects.isNull(str2)) {
            return true;
        }

        if (Objects.isNull(str1) || Objects.isNull(str2)) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }

        List<Integer> count = new ArrayList<>(Collections.nCopies(128, 0));
        for (int i = 0; i < str1.length(); i++) {
            count.set((int) str1.charAt(i), count.get((int) str1.charAt(i)) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            count.set((int) str2.charAt(i), count.get((int) str2.charAt(i)) - 1);
        }

        return !count.stream().anyMatch(item -> item != 0);
    }
}
