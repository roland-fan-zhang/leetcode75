package fr.uge.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        var words = s.split(" ");
        Collections.reverse(Arrays.asList(words));
        return Arrays.stream(words).filter(word -> !word.isEmpty()).collect(Collectors.joining(" "));
    }
}