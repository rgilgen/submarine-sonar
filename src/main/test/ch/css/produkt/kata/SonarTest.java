package ch.css.produkt.kata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SonarTest {

    @Test
    void getOneIncreaseTest(){
        int expectedIncreases = 1;
        List<int> deptData = new ArrayList {99,100};
        int increases = Sonar.getIncreases(deptData);

        assertEquals(expectedIncreases, increases);
    }

}