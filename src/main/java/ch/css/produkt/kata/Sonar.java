package ch.css.produkt.kata;

import java.util.List;

public class Sonar {
    public int getIncreases(List<Integer> deptData) {

        int increases = 0;

        for (int i = 1; i < deptData.size(); i++) {
            int left = deptData.get(i - 1);
            int right = deptData.get(i);
            if (right > left) {
                increases++;
            }
        }

        return increases;
    }

    public int getWindowIncreases(List<Integer> deptData) {
        int increases = 0;

        for (int i = 3; i < deptData.size(); i++) {
            int left = deptData.get(i - 1) + deptData.get(i - 2) + deptData.get(i - 3);
            int right = deptData.get(i) + deptData.get(i - 1) + deptData.get(i - 2);
            if (right > left) {
                increases++;
            }
        }

        return increases;
    }
}
