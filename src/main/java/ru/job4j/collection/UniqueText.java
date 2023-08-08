package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>(List.of(text));
        for (String word : origin) {
            if (!check.contains(word)) {
                return false;
            }
        }
        return true;
    }
}

