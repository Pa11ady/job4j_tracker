package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {

    @Test
    void compare() {
        List<Item> result = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("D"),
                new Item("B")
        );
        List<Item> expect = Arrays.asList(
                new Item("A"),
                new Item("B"),
                new Item("C"),
                new Item("D")
        );
        result.sort(new ItemAscByName());
        assertThat(result).isEqualTo(expect);
    }
}