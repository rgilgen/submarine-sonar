package ch.css.produkt.kata;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SonarTest {

    Sonar testee = new Sonar();

    @Test
    void getOneIncreaseTest() {
        int expectedIncreases = 1;
        List<Integer> deptData = Arrays.asList(99, 100);
        int increases = testee.getIncreases(deptData);

        assertEquals(expectedIncreases, increases);
    }

    @Test
    void getNoIncreaseTest() {
        int expectedIncreases = 0;
        List<Integer> deptData = Arrays.asList(100, 99);
        int increases = testee.getIncreases(deptData);

        assertEquals(expectedIncreases, increases);
    }

    @Test
    void getTwoIncreaseTest(){
        int expectedIncreases = 2;
        List<Integer> deptData = Arrays.asList(99,100,101);
        int increases = testee.getIncreases(deptData);

        assertEquals(expectedIncreases, increases);
    }

    @Test
    void getDiverseInputs(){
        int expectedIncreases = 1;
        List<Integer> deptData = Arrays.asList(101,100,99,200);
        int increases = testee.getIncreases(deptData);

        assertEquals(expectedIncreases, increases);
    }

    @Test
    void getExpecteValueFromFile() throws FileNotFoundException {
        int size = 0;

        List l = testee.getFile();

        assertTrue(l.size()==size);
    }
}