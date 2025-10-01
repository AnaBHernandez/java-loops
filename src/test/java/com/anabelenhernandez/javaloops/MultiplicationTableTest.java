package com.anabelenhernandez.javaloops;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testGetMultiplicationTableWithCustomLimit() {
        int n = 3;
        int limit = 5;

        List<String> expected = new ArrayList<>();
        expected.add("3 x 1 = 3");
        expected.add("3 x 2 = 6");
        expected.add("3 x 3 = 9");
        expected.add("3 x 4 = 12");
        expected.add("3 x 5 = 15");

        List<String> actual = MultiplicationTable.getMultiplicationTable(n, limit);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiplicationTableWithZero() {
        int n = 0;

        List<String> expected = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            expected.add("0 x " + i + " = 0");
        }

        List<String> actual = MultiplicationTable.getMultiplicationTable(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiplicationTableWithOne() {
        int n = 1;

        List<String> expected = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            expected.add("1 x " + i + " = " + i);
        }

        List<String> actual = MultiplicationTable.getMultiplicationTable(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiplicationTableWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            MultiplicationTable.getMultiplicationTable(-5);
        });
    }

    @Test
    public void testGetMultiplicationTableWithNegativeLimit() {
        assertThrows(IllegalArgumentException.class, () -> {
            MultiplicationTable.getMultiplicationTable(5, -1);
        });
    }

    @Test
    public void testGetMultiplicationTableWithZeroLimit() {
        assertThrows(IllegalArgumentException.class, () -> {
            MultiplicationTable.getMultiplicationTable(5, 0);
        });
    }

    @Test
    public void testGetMultiplicationTableWithLargeNumber() {
        int n = 100;
        List<String> actual = MultiplicationTable.getMultiplicationTable(n);
        
        assertEquals(10, actual.size());
        assertEquals("100 x 1 = 100", actual.get(0));
        assertEquals("100 x 10 = 1000", actual.get(9));
    }

    @Test
    public void testGetMultiplicationTableWithSmallLimit() {
        int n = 7;
        int limit = 3;

        List<String> expected = new ArrayList<>();
        expected.add("7 x 1 = 7");
        expected.add("7 x 2 = 14");
        expected.add("7 x 3 = 21");

        List<String> actual = MultiplicationTable.getMultiplicationTable(n, limit);
        assertEquals(expected, actual);
    }
}
