package com.anabelenhernandez.javaloops;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    public static List<String> getMultiplicationTable(int n) {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            table.add(n + " x " + i + " = " + (n * i));
        }
        return table;
    }
}
