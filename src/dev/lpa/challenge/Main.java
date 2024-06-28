package dev.lpa.challenge;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        List<String> items;
        int option = 0;
        Scanner s = new Scanner(System.in);
        do {
            showMenu();
            option = Integer.parseInt(s.nextLine());
            switch (option) {
                case 0:
                    System.out.println("See you soon");
                    break;
                case 1:
                    System.out.println("Insert items to be inserted separated by\", \": ");
                    items = inputs();
                    removeDuplicates(items, groceryList);
                    groceryList.addAll(items);
                    groceryList.sort(Comparator.naturalOrder());
                    printCurrentList(groceryList);
                    break;
                case 2:
                    System.out.println("Insert items to be removed separated by \", \": ");
                    items = inputs();
                    removeItems(items, groceryList);
                    groceryList.sort(Comparator.naturalOrder());
                    printCurrentList(groceryList);
            }

        } while (option != 0);


    }

    public static List<String> inputs() {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        return Arrays.asList(input.split(", "));
    }

    public static void removeDuplicates(List<String> elements, List<String> items) {
        for (String element : elements) {
            if (items.contains(element)) {
                elements.remove(element);
            }
        }
    }

    public static void removeItems(List<String> elements, List<String> items) {
        items.removeAll(elements);
    }

    public static void showMenu() {
        System.out.println("0 - shutdown");
        System.out.println("1 - add item(s) to list");
        System.out.println("2 - remove items from list");
        System.out.println("Enter number to perform action");
    }

    public static void printCurrentList(List<String> groceryList) {
        System.out.println("Your current grocery list is:");
        System.out.println(groceryList);
    }
}
