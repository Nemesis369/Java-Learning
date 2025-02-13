package dev.ak;
import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        // ArrayList objectList = new ArrayList();
        // objectList.add(new GroceryItem("Butter"));
        // objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Curd"));
        groceryList.add(new GroceryItem("Oranges", "PRODUCE", 5));
        groceryList.add(0, new GroceryItem("Banana", "PRODUCE", 6));
        groceryList.set(0, new GroceryItem("Papaya", "PRODUCE", 6));
        groceryList.remove(2);
        System.out.println(groceryList);
    }
}
