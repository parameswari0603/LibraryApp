package org.example.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic repository.
 */
public class Repository<T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }
}