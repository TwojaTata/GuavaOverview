package com.patrykkuchar.app;

import com.google.common.base.Splitter;

import java.util.Arrays;

public class SplitterExample {

    public static void main(String[] args) {

        String quiz = " foo, ,bar, kudos,";
        System.out.println(Arrays.toString(quiz.split(",")));

//        System.out.println(Splitter.on(",")
//                .trimResults()
//                .omitEmptyStrings()
//                .split(quiz));
    }
}
