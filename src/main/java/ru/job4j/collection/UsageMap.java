package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ivanov@ya.ru", "Ivanov S. A.");
        map.put("petrov@ya.ru", "Penrov V. G.");
        map.put("sidorov@ya.ru", "Sodorov E. V.");
        map.put("sidorov@ya.ru", "xxxxxx");
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
