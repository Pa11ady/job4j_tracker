package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            Character symbol = evenElements.removeFirst();
            if (i % 2 == 0) {
                stringBuilder.append(symbol);
            }
        }
        return stringBuilder.toString();
    }

    private String getDescendingElements() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(descendingElements.removeLast());

        }
        return stringBuilder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}