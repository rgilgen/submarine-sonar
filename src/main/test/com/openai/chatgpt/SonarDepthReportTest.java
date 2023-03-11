package com.openai.chatgpt;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ChatGPT 10.03.2023
 */
public class SonarDepthReportTest {

    @Test
    public void testNoIncrease() {
        String input = "100\n200\n300\ndone\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SonarDepthReport.main(new String[0]);
        assertEquals("Number of measurements that are larger than the previous measurement: 2\n",
                getOutput());
    }

    @Test
    public void testAllIncrease() {
        String input = "100\n200\n300\n400\ndone\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SonarDepthReport.main(new String[0]);
        assertEquals("Number of measurements that are larger than the previous measurement: 3\n",
                getOutput());
    }

    @Test
    public void testAllDecrease() {
        String input = "400\n300\n200\n100\ndone\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SonarDepthReport.main(new String[0]);
        assertEquals("Number of measurements that are larger than the previous measurement: 0\n",
                getOutput());
    }

    @Test
    public void testMixedIncreasesAndDecreases() {
        String input = "100\n200\n300\n250\n275\n225\ndone\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SonarDepthReport.main(new String[0]);
        assertEquals("Number of measurements that are larger than the previous measurement: 3\n",
                getOutput());
    }

    private String getOutput() {
        //return new String (System.out.toByteArray());
        //dear chatgpt: upper code does not compile
        return "";
    }

}