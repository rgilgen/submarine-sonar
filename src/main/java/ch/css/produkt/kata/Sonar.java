package ch.css.produkt.kata;

import java.util.List;

public class Sonar {
    public static int getIncreases(List<Integer> deptData) {
        int left = deptData.get(0);
        int right = deptData.get(1);

        if (right > left) {
            return 1;
        }

        return 0;
    }
}
