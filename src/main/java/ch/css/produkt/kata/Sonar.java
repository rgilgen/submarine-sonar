package ch.css.produkt.kata;

import java.util.List;

public class Sonar {
    public int getIncreases(List<Integer> deptData) {
        int increases = 0;
        int accuracy = 1;

        return countIncreases(deptData, increases, accuracy);
    }

    public int getWindowIncreases(List<Integer> deptData) {
        int increases = 0;
        int accuracy = 3;

        return countIncreases(deptData, increases, accuracy);
    }

    private int countIncreases(List<Integer> deptData, int increases, int accuracy) {
        for (int i = accuracy; i < deptData.size(); i++) {
            int left = sumUpFromIndex(deptData, i, accuracy);
            int right = sumUpFromIndex(deptData, i + 1, accuracy);
            if (right > left) {
                increases++;
            }
        }
        return increases;
    }

    private static int sumUpFromIndex(List<Integer> deptData, int index, int quantity) {
        if (index < quantity) {
            return Integer.MAX_VALUE;
        }
        if (deptData.size() >= quantity) {
            int startIndex = index - quantity;
            return deptData.subList(startIndex, index).stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }
        throw new IllegalArgumentException(String.format("Die verwendeten Parameter können nicht für die Berechnung verwendet werden. deptData.size %d index %d, accurracy %d", deptData.size(), index, quantity));
    }
}
