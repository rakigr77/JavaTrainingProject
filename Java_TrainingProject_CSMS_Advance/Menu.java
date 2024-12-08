package Java_TrainingProject_CSMS_Advance;


import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Menu<T extends MenuItem> {
    private List<T> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public void displayMenu() {
        items.forEach(System.out::println);
    }
}







