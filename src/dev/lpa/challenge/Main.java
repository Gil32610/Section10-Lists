package dev.lpa.challenge;

import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        List<String> items;
        int option = 0;
        do {
            showMenu();
            option = Integer.parseInt(s.nextLine());
            switch (option) {
                case 0:
                    System.out.println("See you soon");
                    break;
                case 1:
                    addElements(groceryList);
                    break;
                case 2:
                    removeItems(groceryList);
                    break;
            }
            groceryList.sort(Comparator.naturalOrder());
            printCurrentList(groceryList);

        } while (option != 0);


    }

    public static void printCurrentList(List<String> groceryList) {
        System.out.println("Your current grocery list is:");
        System.out.println(groceryList);
    }

    public static void addElements(List<String> groceries) {
        System.out.println("Insert items to be inserted separated by\", \": ");
        List<String> items = inputs();
        trimItems(items);
        removeDuplicates(items, groceries);
        groceries.addAll(items);
    }

    public static List<String> inputs() {
        String input = s.nextLine();
        return Arrays.asList(input.split(","));
    }

    public static void removeDuplicates(List<String> elements, List<String> items) {
        for (String element : elements) {
            if (items.contains(element)) {
                elements.remove(element);
            }
        }
    }

    public static void removeItems(List<String> groceries) {
        System.out.println("Insert items to be removed separated by \", \": ");
        List<String> items = inputs();
        trimItems(items);
        groceries.removeAll(items);
    }

    public static void showMenu() {
        System.out.println("0 - shutdown");
        System.out.println("1 - add item(s) to list");
        System.out.println("2 - remove items from list");
        System.out.println("Enter number to perform action");
    }


    public static void trimItems(List<String> items) {
        for (String item : items) {
            items.set(items.indexOf(item), item.trim());
        }
    }
}
