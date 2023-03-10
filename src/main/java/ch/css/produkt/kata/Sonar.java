package ch.css.produkt.kata;

import java.io.*;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Integer> getFile() throws IOException {
        String path = "src/main/resources/kata-input.txt";
        File file = new File(path);
        InputStream is = Files.newInputStream(file.toPath());
        Reader reader = new InputStreamReader(is);
        BufferedReader r = new BufferedReader(reader);
        return r.lines().map(Integer::parseInt).collect(Collectors.toList());
    }
}
