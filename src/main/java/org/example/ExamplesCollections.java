package org.example;

import java.util.ArrayList;
import java.util.List;

public class ExamplesCollections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mary-Ann");
        names.add("Carlos");
        names.add("Clark");
        names.remove(0);
        System.out.println(names);
    }
}
