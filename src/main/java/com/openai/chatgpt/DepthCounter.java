package com.openai.chatgpt;
import java.util.Scanner;

/**
 * ChatGPT 11.03.3023
 */
import java.util.Scanner;
import java.util.Scanner;

public class DepthCounter {
    public static int countIncreasingDepths() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int prevDepth = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int depth = scanner.nextInt();
            if (depth > prevDepth) {
                count++;
            }
            prevDepth = depth;
        }

        return count;
    }

    public static void main(String[] args) {
        int count = countIncreasingDepths();
        System.out.println(count);
    }
}