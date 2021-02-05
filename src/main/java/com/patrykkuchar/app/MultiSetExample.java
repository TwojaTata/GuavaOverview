package com.patrykkuchar.app;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Random;

public class MultiSetExample {

    public static void main(String[] args) {
        vote();
    }

    private static void vote() {
        Random random = new Random();
        Multiset<String> multiset = HashMultiset.create();
        String options = "ABC";
        for (int i = 0; i < 100; i++) {
            multiset.add(String.valueOf(options.charAt(random.nextInt(options.length()))));
        }
        System.out.println(multiset.toString());
        System.out.println("size: " + multiset.size());
        System.out.println("Number of unique elements: " + multiset.elementSet().size());
    }
}
