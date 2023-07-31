package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                return i;
            }
        }
        throw new ElementNotFoundException("Element Not Found");
    }

    public static void main(String[] args) {
        String[] strings = {"122", "222", "22"};
        try {
            indexOf(strings, "1");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
