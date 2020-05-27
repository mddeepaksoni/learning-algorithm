package me.deepak.learning.algorithm.ctci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Ex1IsUniqueTest {

    /**
     * String is null
     */
    @Test
    public void testProcessCase1() {
        Assert.assertTrue(Ex1IsUnique.process(null));
    }

    /**
     * String is empty
     */
    @Test
    public void testProcessCase2() {
        Assert.assertTrue(Ex1IsUnique.process(""));
    }

    /**
     * String has duplicate characters
     */
    @Test
    public void testProcessCase3() {
        Assert.assertFalse(Ex1IsUnique.process("This string has duplicate characters"));
    }

    /**
     * String has unique characters
     */
    @Test
    public void testProcessCase4() {
        Assert.assertTrue(Ex1IsUnique.process("Unique"));
    }
}
