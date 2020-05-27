package me.deepak.learning.algorithm.ctci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Ex2CheckPermutationTest {

    /**
     * Both strings are null
     */
    @Test
    public void testProcessCase1() {
        Assert.assertTrue(Ex2CheckPermutation.process(null, null));
    }

    /**
     * Both string are empty
     */
    @Test
    public void testProcessCase2() {
        Assert.assertTrue(Ex2CheckPermutation.process("", ""));
    }

    /**
     * Any string is empty
     */
    @Test
    public void testProcessCase3() {
        Assert.assertFalse(Ex2CheckPermutation.process("", "This is test"));
    }

    /**
     * Equal strings
     */
    @Test
    public void testProcessCase4() {
        Assert.assertTrue(Ex2CheckPermutation.process("This is test", "This is test"));
    }

    /**
     * Unequal strings
     */
    @Test
    public void testProcessCase5() {
        Assert.assertFalse(Ex2CheckPermutation.process("This is test1", "This is test2"));
    }

    /**
     * Permutation
     */
    @Test
    public void testProcessCase6() {
        Assert.assertTrue(Ex2CheckPermutation.process("Test", "Tset"));
    }
}
