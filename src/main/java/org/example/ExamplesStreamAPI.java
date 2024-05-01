package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExamplesStreamAPI {
    public static void main(String[] args) {
        //creating streams from an array
        List<String> names = Arrays.asList("Lori", "Christa", "Maaike");
        Stream<String> nameStream = names.stream();

        //creating a stream from an Array
        String[] namesArray = {"Tsa", "Jonas", "Gaia"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);


        //Creating a Stream with Stream of
        Stream<String> namesOfStream = Stream.of("Ismael", "David", "Andreas");

        List<String> moreNames = Arrays.asList("Nabeel", "Youssef", "Ali", "Adam", "Syed");

        List<String> filteredNames = moreNames.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(filteredNames);



    }
}
