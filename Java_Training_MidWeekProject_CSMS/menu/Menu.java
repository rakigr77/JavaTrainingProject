package Java_Training_MidWeekProject_CSMS.menu;


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

    public void displayMenu() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}






