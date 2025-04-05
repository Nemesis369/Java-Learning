package AbstractClassesChallenge.src;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {
}

public class Store {
    private static ArrayList<ProductForSale> products = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        products.add(
                new ArtObject("Canvas", 1450, "This has a tight weave and a good sustainable material for painting"));
        products.add(new ArtObject("Sculpture", 14000, "Stone carved sculpture from the 1800s"));
        products.add(new Furniture("Desk", 1000, "Mahogany Desk"));
        products.add(new Furniture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));

        listProducts();

        System.out.println("\nOrder 1");
        ArrayList<OrderItem> order1 = new ArrayList<>();
        addItemToOrder(order1, 0, 3);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        
        printOrder(order2);
    }

    public static void listProducts() {

        for (var items : products) {
            System.out.println("-".repeat(40));
            items.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, products.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;

        for (var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }

        System.out.printf("Sales Total: %.2f%n", salesTotal);
    }
}
