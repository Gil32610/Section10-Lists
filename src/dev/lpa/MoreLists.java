package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"APPLES", "BANANAS", "MILK", "EGGS"};
        System.out.println("-".repeat(30));
        System.out.println("Lists ara immutables!");
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());
        System.out.println("-".repeat(30));
        System.out.println("Lists can be passed as arguments for populating array lists:");
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("YOGURT");
        System.out.println(groceries);

        System.out.println("-".repeat(30));
        System.out.println("We can pass variable arguments to List.of() with specified elements:");
        ArrayList<String> nextList = new ArrayList<>(
                List.of("PICKLES","MUSTARD", "CHEESE")
        );
        System.out.println(nextList);

        System.out.println("-".repeat(30));
        System.out.println("Adding any list as argument on array list:");
        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}
