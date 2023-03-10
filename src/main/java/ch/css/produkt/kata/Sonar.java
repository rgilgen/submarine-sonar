package ch.css.produkt.kata;

import java.io.InputStream;
import java.util.Collections;
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

    public List<Integer> getFile() {
        InputStream is = getClass().getClassLoader().getResourceAsStream("kata-input.txt");
        return Collections.emptyList();
    }
}
