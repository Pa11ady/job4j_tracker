package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> predicate1 = (x) -> x.getName().contains(key);
        Predicate<Person> predicate2 = (x) -> x.getSurname().contains(key);
        Predicate<Person> predicate3 = (x) -> x.getPhone().contains(key);
        Predicate<Person> predicate4 = (x) -> x.getAddress().contains(key);
        Predicate<Person> combine = predicate1.or(predicate2).or(predicate3).or(predicate4);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
