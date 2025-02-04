import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<String> groceryList = new ArrayList<>();

        boolean flag = true;

        while (flag) {
            printAction();

            switch (Integer.parseInt(sc.nextLine())) {
                case 1 -> addItem(groceryList);

                case 2 -> removeItem(groceryList);

                default -> flag = false;
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);
        }
    }

    // eggs, milk, cereal, bananas, cheese, ham
    public static void addItem(ArrayList<String> groceryList) {
        System.out.println("Add item(s) [seperate items by comma]:");
        String[] stringList = sc.nextLine().split(",");
        // groceryList.addAll(List.of(stringList));

        // duplication check
        for (String i : stringList) {
            String trimmed = i.trim();
            if (groceryList.indexOf(trimmed) < 0) {
                groceryList.add(trimmed);
            }
        }
        System.out.println("Added items");
    }

    public static void removeItem(ArrayList<String> groceryList) {
        System.out.println("Removal item(s) [seperate items by comma]:");
        String[] removalList = sc.nextLine().split(",");
        for (String i : removalList) {
            String trimmed = i.trim();
            groceryList.remove(trimmed);
        }
        System.out.println("Removed items");
    }

    public static void printAction() {
        System.out.println("""
                Available actions:

                0 - shutdown,

                1 - to add items to list (Add items seperated by comma),

                2 - to remove any items (Remove items seperated by comma)

                Enter a number for which action you want to do:
                """);
    }
}
