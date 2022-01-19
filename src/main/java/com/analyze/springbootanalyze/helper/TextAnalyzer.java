package com.analyze.springbootanalyze.helper;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

@Component
public class TextAnalyzer {
    private final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    private final Predicate<Character> isVowel = c -> isVowel(c);
    private final Predicate<Character> isConsonent = c -> !isVowel(c);

    public HashMap<Character, Integer> getFreqCount(String text, String analyzeType) {
        text = text.toLowerCase();

        HashMap<Character, Integer> freqCount = new HashMap<>();

        Predicate<Character> filter;
        if ("vowels".equals(analyzeType)) {
            filter = isVowel;
        } else {
            filter = isConsonent;
        }

        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (filter.test(c)) {
                freqCount.put(c, 1 + freqCount.getOrDefault(c, 0));
            }
        }

        return freqCount;
    }

    private boolean isVowel(Character c) {
        return VOWELS.indexOf(c) != -1;
    }
}
