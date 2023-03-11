package ch.css.produkt.kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SonarTest {

    Sonar testee = new Sonar();


    @ParameterizedTest(name = "{index} : {0} erwarte {1}")
    @CsvSource({
            "'99,100',           1",
            "'100,99',           0",
            "'99, 100, 101',     2",
            "'101, 100, 99, 200',1"
    })
    void getIncreasesTest(String list, Integer expectedIncreases) {
        List<Integer> deptData = parseToIntegerList(list);

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

    private static List<Integer> parseToIntegerList(String list) {
        return Arrays.stream(
                        list.split(",")
                )
                .map(s -> Integer.parseInt(s.trim()))
                .toList();
    }
}
