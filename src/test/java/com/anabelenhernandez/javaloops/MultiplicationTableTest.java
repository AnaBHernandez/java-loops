package com.anabelenhernandez.javaloops;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;  // Asegúrate de incluir esta línea
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTableTest {

    @Test
    public void testGetMultiplicationTable() {
        int n = 5;

        List<String> expected = new ArrayList<>();
        expected.add("5 x 1 = 5");
        expected.add("5 x 2 = 10");
        expected.add("5 x 3 = 15");
        expected.add("5 x 4 = 20");
        expected.add("5 x 5 = 25");
        expected.add("5 x 6 = 30");
        expected.add("5 x 7 = 35");
        expected.add("5 x 8 = 40");
        expected.add("5 x 9 = 45");
        expected.add("5 x 10 = 50");

        List<String> actual = MultiplicationTable.getMultiplicationTable(n);
        assertEquals(expected, actual);
    }
}
