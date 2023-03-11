package ch.css.produkt.kata;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class SignalParser {
    public List<Integer> getFile(String path) throws IOException {
        File file = new File(path);
        InputStream is = Files.newInputStream(file.toPath());
        Reader reader = new InputStreamReader(is);
        BufferedReader r = new BufferedReader(reader);
        return r.lines().map(Integer::parseInt).collect(Collectors.toList());
    }
}
