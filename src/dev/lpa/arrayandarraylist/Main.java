package dev.lpa.arrayandarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String [] originalArray = new String []{"Bob", "Clark", "Chips"};
        var originalList = Arrays.asList(originalArray);
        //Every change made to the originalList will be backed to the originalArray
        originalList.set(0, "Venice");
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray));

        //The list cannot add or remove elements because it's backed by the array!
        originalList.sort(Comparator.naturalOrder());
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray));

        System.out.println("Creating a fixed size List:");
        System.out.println("This list is mutable");
        List<String> newList = Arrays.asList("Shinjuku", "Kabukicho", "Shibuya");
        System.out.println(newList);

        System.out.println("Creating a immutable size list");
        System.out.println("This list is immutable");
        List<String> aList = List.of("person1","person2","person3");

        System.out.println("Creating arrays from arraylists");
        ArrayList<String> stringLists = new ArrayList<>(List.of("some", "words", "written"));
        String [] stringArray = stringLists.toArray(new String[0]);

    }
}
