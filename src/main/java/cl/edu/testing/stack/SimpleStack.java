package cl.edu.testing.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Objects;

/** Implementación sencilla para ejercitar diseño de casos y detección de defectos. */
public class SimpleStack<T> {
    private final List<T> elements = new ArrayList<>();

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void push(T value) {
        elements.add(Objects.requireNonNull(value, "No se admite null"));
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }
}
