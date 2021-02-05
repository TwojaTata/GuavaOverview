package com.patrykkuchar.app;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Random;

public class TableExample {
    public static void main(String[] args) {
        coordinates();
    }

    private static void coordinates() {
        Table<Integer, Integer, String> coordinatesTable
                = HashBasedTable.create();
        Random random = new Random();
        String ship = "Ship";
        String water = "Water";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (random.nextInt(2) == 0) {
                    coordinatesTable.put(i, j, ship);
                } else {
                    coordinatesTable.put(i, j, water);
                }
            }
        }
        System.out.println(coordinatesTable.toString());
        System.out.println(coordinatesTable.column(4));
        System.out.println(coordinatesTable.row(1));

        System.out.println(coordinatesTable.get(3,4 ));
    }
}
