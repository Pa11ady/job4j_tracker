package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter((x) -> x.getStandard() - x.getActual() >= 0)
                .filter((x) -> x.getStandard() - x.getActual() <= 3)
                .map((p) -> new Label(p.getName(), p.getPrice() * 0.5f))
                .map(Label::toString)
                .collect(Collectors.toList());
    }
}
