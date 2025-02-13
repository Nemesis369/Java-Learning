package ArrayAndArrayLists.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] originalArray = new String[] { "First", "Second", "Third" };
        var originalList = Arrays.asList(originalArray);

        // changes done through after changing data type using function only changes the
        // original arrays elements
        originalList.set(0, "one");
        System.out.println("List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

        // originalList.add("fourth");

        // using this you cant change the size of List
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

        // var listOne = List.of("Sunday", "Monday", "Tuesday");
        // var days = Arrays.asList("Sunday", "Monday", "Tuesday");
        // gives error (cannot change size)
        // listOne.add("Wednesday");
        // days.add("Thursday");

        // it returns immutable instance List of fixed size
        // listOne.set(2, "Wednesday");
        // this returns mutable List but of fixed size
        // days.set(2, "Wednesday");

        ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "March"));
        /*
         * toArray takes one arguement which shld be instance of typed array
         * if length of array passed is more than list, extra elements will
         * be filled with the default type.
         * If less length is passed, still the whole array is returned.
         */
        String[] stringArray = stringLists.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray));
    }
}
