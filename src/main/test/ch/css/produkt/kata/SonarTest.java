package ch.css.produkt.kata;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void getTwoIncreaseTest() {
        int expectedIncreases = 2;
        List<Integer> deptData = Arrays.asList(99, 100, 101);

        int increases = testee.getIncreases(deptData);

        assertEquals(expectedIncreases, increases);
    }

    @Test
    void getDiverseInputs() {
        int expectedIncreases = 1;
        List<Integer> deptData = Arrays.asList(101, 100, 99, 200);

        int increases = testee.getIncreases(deptData);

        assertEquals(expectedIncreases, increases);
    }

    @Test
    void getExpecteValueFromFile() throws IOException {
        int size = 2000;

        List<Integer> l = testee.getFile();

        assertEquals(size, l.size());
    }

    @Test
    void getAnswerOfQuiz() throws IOException {
        int expectedIncreases = 1527;
        List<Integer> sonarlist = testee.getFile();

        int actualincreases = testee.getIncreases(sonarlist);

        assertEquals(expectedIncreases, actualincreases);
    }

    @Test
    void getWindowIncreaseOfThree() {
        int expectedValue = 0;
        List<Integer> sonarlist = Arrays.asList(104, 111, 124);

        int actualValue = testee.getWindowIncreases(sonarlist);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void getWindowIncreaseOfFourWithIncrease() {
        int expectedValue = 1;
        List<Integer> sonarlist = Arrays.asList(104, 111, 124, 105);

        int actualValue = testee.getWindowIncreases(sonarlist);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void getWindowIncreaseOfFiveWithTwoIncrease() {
        int expectedValue = 2;
        List<Integer> sonarlist = Arrays.asList(104, 111, 124, 105, 300);

        int actualValue = testee.getWindowIncreases(sonarlist);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void getWindowIncreaseOfFiveWithNoIncrease() {
        int expectedValue = 0;
        List<Integer> sonarlist = Arrays.asList(104, 104, 104, 104, 104);

        int actualValue = testee.getWindowIncreases(sonarlist);

        assertEquals(expectedValue, actualValue);
    }
}
