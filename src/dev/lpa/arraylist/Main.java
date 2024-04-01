package dev.lpa.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s",count, name.toUpperCase(),type);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Grocery Items using an array:");
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray));
        printDashes();
        System.out.println("Grocery Items with arrayList:");
        //raw use of type
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("butter"));
        objectList.add("Yogurt");

        //Specific to record type
        //Diamond operator
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE",5));
        // if the angle brackets is not present on the instantiation part, java won't do compile time checking
        printDashes();
        System.out.println("Adding an item to the beginning:");
        groceryList.add(0,new GroceryItem("apples", "PRODUCE", 6));
        System.out.println(groceryList);
        printDashes();
        System.out.println("Setting an item on the beginning:");
        groceryList.set(0, new GroceryItem("CHOCOLATE"));
        System.out.println(groceryList);
        printDashes();
        System.out.println("Removing an element from the list:");
        groceryList.remove(1);
        System.out.println(groceryList);
    }

    public static void printDashes(){
        System.out.println("-".repeat(30));
    }
}
