package ch.css.produkt.kata;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SonarTest {

    @Test
    void getOneIncreaseTest() {
        int expectedIncreases = 1;
        List<Integer> deptData = Arrays.asList(99, 100);
        int increases = Sonar.getIncreases(deptData);

        assertEquals(expectedIncreases, increases);
    }

}