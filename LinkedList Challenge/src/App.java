import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Pair> placesList = new LinkedList<>();
        addPlace(placesList, new Pair("Adelaide", 1374));
        addPlace(placesList, new Pair("Alice Springs", 2771));
        addPlace(placesList, new Pair("Brisbane", 917));
        addPlace(placesList, new Pair("Darwin", 3972));
        addPlace(placesList, new Pair("Melbourne", 877));
        addPlace(placesList, new Pair("Perth", 3923));

        placesList.addFirst(new Pair("Sydney", 0));

        ListIterator<Pair> iterator = placesList.listIterator();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        boolean forward = true;

        printOptions();

        while (flag) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.print("Input: ");
            String option = sc.nextLine().toLowerCase().substring(0, 1);

            switch (option) {
                case "f":
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "b":
                    if (forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "l":
                    System.out.println(placesList);
                    break;
                default:
                    flag = false;
                    break;
            }
        }
        // listPlaces(placesList);
        sc.close();
    }

    public static void addPlace(LinkedList<Pair> list, Pair place) {
        // if (list.contains(place)) {
        // System.out.println("Found duplicate = " + place);
        // return;
        // }

        for (Pair p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Duplicate value found: " + place);
                return;
            }
        }

        int index = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(index, place);
                return;
            }
            index++;
        }
        list.add(place);
    }

    public static void listPlaces(LinkedList<Pair> list) {
        ListIterator<Pair> iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void printOptions() {
        System.out.println("""
                Available Actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

}

record Pair(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
