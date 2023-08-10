package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {
    @Test
    void compare() {
        List<Item> result = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("D"),
                new Item("B")
        );
        List<Item> expect = Arrays.asList(
                new Item("D"),
                new Item("C"),
                new Item("B"),
                new Item("A")
        );
        result.sort(new ItemDescByName());
        assertThat(result).isEqualTo(expect);
    }
}
