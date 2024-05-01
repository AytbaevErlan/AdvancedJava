package org.example.parameterizedTypeExamples;

public class Main {
    public static void main(String[] args) {
        Pair<String> namePair = new Pair<>("Gaia", "Jones");
        Pair<Integer> agePair = new Pair<>(8, 5);

        String firstName = namePair.getFirst();
        int firstAge = agePair.getFirst();

        System.out.println("first Name: " + firstName);
        System.out.printf("first age: " + firstAge);
    }
}
