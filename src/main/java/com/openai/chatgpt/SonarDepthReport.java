package com.openai.chatgpt;

import java.util.Scanner;

/**
 * ChatGpt Solution 10.03.2023
 */
public class SonarDepthReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int previousDepth = 0;
        int currentDepth = 0;
        int increaseCount = 0;
        boolean isFirstDepth = true;

        System.out.println("Enter the sonar depth report (type 'done' to finish):");

        while (true) {
            String line = input.nextLine();

            if (line.equals("done")) {
                break;
            }

            currentDepth = Integer.parseInt(line);

            if (!isFirstDepth && currentDepth > previousDepth) {
                increaseCount++;
            }

            previousDepth = currentDepth;
            isFirstDepth = false;
        }

        System.out.println("Number of measurements that are larger than the previous measurement: " + increaseCount);

        input.close();
    }

}
