package ch.css.produkt.kata;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SignalParserTest {

    @Test
    void getExpecteLinecountFromFile() throws IOException {
        int size = 2000;

        List<Integer> l = new SignalParser().getFile("src/main/resources/kata-input.txt");

        assertEquals(size, l.size());
    }
}