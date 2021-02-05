package com.patrykkuchar.app;

import com.google.common.base.Joiner;

import java.util.Arrays;

public class JoinerExample {

    private static final Joiner joiner = Joiner
            .on(", ")
//            .skipNulls()
            .useForNull("unknown");

    public static void main(String[] args) {

        System.out.println(joiner.join(Arrays.asList("Kurt", "Kevin", null, null, "Chris")));

    }
}
