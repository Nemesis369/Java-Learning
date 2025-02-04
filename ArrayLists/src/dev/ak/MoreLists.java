package dev.ak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = { "apples", "bananas", "milk", "eggs" };

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println(groceries.get(3));

        if (groceries.contains("eggs")) {
            System.out.println("contains eggs");
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        // groceries.remove("yogurt");
        System.out.println(groceries);
        // groceries.remove(6);
        System.out.println(groceries);

        groceries.removeAll(List.of("yogurt"));
        System.out.println(groceries);
        groceries.retainAll(List.of("apples", "bananas", "milk")); // removes everything other than the mentioned
                                                                   // elements
        System.out.println(groceries);
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<ArrayList<String>> mutliDList = new ArrayList<>();
        mutliDList.add(new ArrayList<>(List.of("ak", "ak", "ak", "ak", "ak")));
        mutliDList.add(new ArrayList<>(List.of("ak", "ak", "ak", "ak", "ak")));
        mutliDList.add(new ArrayList<>(List.of("ak", "ak", "ak", "ak", "ak")));
        mutliDList.add(new ArrayList<>(List.of("ak", "ak", "ak", "ak", "ak")));
        mutliDList.add(new ArrayList<>(List.of("ak", "ak", "ak", "ak", "ak")));
        mutliDList.add(new ArrayList<>(List.of("ak", "ak", "ak", "ak", "ak")));
        mutliDList.add(new ArrayList<>(List.of("ak", "ak", "ak", "ak", "ak")));
        mutliDList.add(new ArrayList<>(List.of("ak", "ak", "ak", "ak", "ak")));
        System.out.println(mutliDList);

        // int arr[][] = new int[5][5];
        // System.out.println(Arrays.deepToString(arr));

        int arr[] = new int[5];
        System.out.println(Arrays.binarySearch(arr, 0));
    }
}
