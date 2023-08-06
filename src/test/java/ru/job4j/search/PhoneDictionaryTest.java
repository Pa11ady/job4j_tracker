package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Ivan", "Arsentev", "123", "Moscow"));
        phones.add(new Person("Vlad", "Ivanov", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Arsentev");
        assertThat(persons.get(0).getName()).isEqualTo("Petr");
        assertThat(persons.get(1).getName()).isEqualTo("Ivan");
    }

    @Test
    public void whenFindByNameIsNotFound() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Ivanov");
        assertThat(persons.isEmpty()).isTrue();
    }
}