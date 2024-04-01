package dev.lpa.morelists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] items = {"APPLES", "BANANAS", "MILK", "EGGS"};
        printDashes();
        System.out.println("Lists are immutables!");
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());

        printDashes();
        System.out.println("Lists can be passed as arguments for populating array lists:");
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("YOGURT");
        System.out.println(groceries);

        printDashes();
        System.out.println("We can pass variable arguments to List.of() with specified elements:");
        ArrayList<String> nextList = new ArrayList<>(
                List.of("PICKLES","MUSTARD", "CHEESE")
        );
        System.out.println(nextList);

        printDashes();
        System.out.println("Adding any list as argument on array list:");
        groceries.addAll(nextList);
        System.out.println(groceries);

        printDashes();
        System.out.println("Getting an element from the list:");
        System.out.println("Third item = " + groceries.get(2));


        printDashes();
        System.out.println("Checking if an element exists on the list:");
        if(groceries.contains("MUSTARD")){
            System.out.println("List contains the element");
        }

        printDashes();
        System.out.println("ArrayLists allows duplicate elements:");
        groceries.add("YOGURT");
        System.out.println("first = " + groceries.indexOf("YOGURT"));
        System.out.println("last = " + groceries.lastIndexOf("YOGURT"));


        printDashes();
        System.out.println("Removing an element from an arrayList:");
        System.out.println("Original list:");
        System.out.println(groceries);
        printDashes();
        System.out.println("After removing second element");
        groceries.remove(1);
        System.out.println(groceries);
        printDashes();
        System.out.println("After removing YOGURT");
        groceries.remove("YOGURT");
        System.out.println(groceries);
        printDashes();
        System.out.println("Removing a set of elements with a temporary list:");
        groceries.removeAll(List.of("APPLES","EGGS"));
        System.out.println(groceries);
        printDashes();
        System.out.println("Retaining only desired elements with list of:");
        groceries.retainAll(List.of("APPLES", "MILK", "MUSTARD", "CHEESE"));
        System.out.println(groceries);
        printDashes();
        System.out.println("Removing all elements from the arrayList:");
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        printDashes();
        System.out.println("Populating the arrayList again:");
        groceries.addAll(List.of("APPLES", "MILK", "MUSTARD", "CHEESE"));
        groceries.addAll(Arrays.asList("EGGS", "PICKLES", "MUSTARD", "HAM"));
        System.out.println(groceries);

        printDashes();
        System.out.println("Sorting elements on arrayList:");
        System.out.println("Unsorted:");
        System.out.println(groceries);
        System.out.println("Sorted:");
        //Comparator allows instances to be compared to one another
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        System.out.println("Reverse order:");
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        printDashes();
        System.out.println("Getting an list from an array:");
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
    public static void printDashes(){
        System.out.println("-".repeat(30));
    }
}
