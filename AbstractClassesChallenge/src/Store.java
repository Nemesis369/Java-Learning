package AbstractClassesChallenge.src;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> products = new ArrayList<>();
    static ArrayList<OrderItem> order = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        products.add(
                new ArtObject("Canvas", 1450, "This has a tight weave and a good sustainable material for painting"));
        products.add(new ArtObject("Sculpture", 14000, "Stone carved sculpture from the 1800s"));

        listProducts();

        addItemToOrder(0, 3);
        printOrder();
    }

    public static void listProducts() {

        for (var items : products) {
            System.out.println("-".repeat(30));
            items.showDetails();
        }
    }

    public static void addItemToOrder(int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, products.get(orderIndex)));
    }

    public static void printOrder() {

        double salesTotal = 0;

        for (var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }

        System.out.printf("Sales Total: %.2f", salesTotal);
    }
}
