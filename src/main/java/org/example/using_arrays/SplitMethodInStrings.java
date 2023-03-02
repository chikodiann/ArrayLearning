package org.example.using_arrays;

import java.util.Arrays;

public class VariableArgumentsPractice {
    public static void main(String... args) {
        //split a string... split simply takes a string splits it and returns an array of sub-strings
        String[] simpleString = "Hello From The Other Side".split(" ");
        System.out.println(Arrays.toString(simpleString));

        //there are 3 split()  methods in java
        //-1 split a string using space as we did above... if you don't specify a limit, it automatically splits them in equal substrings
       // -2 split method with regex and length
        String letters = "alpha, beta, gama, delta, sigma";
        //First convert it to an array of strings
        String[] convertedLetters = letters.split(",", 4);
        // 4th and 5th element will be combined in because the limit is 4, and we have 5 elements
        for (int i = 0; i < convertedLetters.length; i++) {
            System.out.println(convertedLetters[i]);
        }
        System.out.println("-".repeat(30));

        //-3 split a string with delimiter
        String dLetters = "alpha:beta:gama:delta:sigma";
        //loop through using an enhanced loop
        for (String dNewLetters: dLetters.split(":",2)) {
            System.out.println(dNewLetters);
        }

    }
}
