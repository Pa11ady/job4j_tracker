package ru.job4j.checkstyle;

public class Broken {
    private static final String NEW_VALUE = "";
    private static final int SIZE_OF_EMPTY = 10;

    private String name;
    public String surname;

    public Broken(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c) {

    }
}