package com.openai.chatgpt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

/**
 * ChatGPT 11.02.2023
 */
public class DepthCounterTest {

    @Test
    public void testNoDepths() {
        String input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int count = DepthCounter.countIncreasingDepths();
        Assertions.assertEquals(0, count);
    }

    @Test
    public void testSingleDepth() {
        String input = "100";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int count = DepthCounter.countIncreasingDepths();
        Assertions.assertEquals(0, count);
    }

    @Test
    public void testIncreasingDepths() {
        String input = "100\n200\n300\n400";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int count = DepthCounter.countIncreasingDepths();
        Assertions.assertEquals(3, count);
    }

    @Test
    public void testDecreasingDepths() {
        String input = "400\n300\n200\n100";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int count = DepthCounter.countIncreasingDepths();
        Assertions.assertEquals(0, count);
    }

    @Test
    public void testEqualDepths() {
        String input = "100\n100\n100\n100";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int count = DepthCounter.countIncreasingDepths();
        Assertions.assertEquals(0, count);
    }

    @Test
    public void testRandomDepths() {
        String input = "199\n200\n208\n210\n200\n207\n240\n269\n260\n263";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int count = DepthCounter.countIncreasingDepths();
        Assertions.assertEquals(7, count);
    }
}
