package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
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

    }

    public static void printDashes(){
        System.out.println("-".repeat(30));
    }
}
