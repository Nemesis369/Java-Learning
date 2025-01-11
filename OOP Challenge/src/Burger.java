public class Burger extends Item {

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    public double getExtraPrice(String topping) {
        return switch (topping.toUpperCase()) {
            case "CHEESE", "TOMATO" -> 1.5;
            case "ONION", "HAM" -> 2;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("topping", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("topping", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("topping", extra3, getExtraPrice(extra3));
    }

    public void printExtraList() {
        if(extra1 != null) {extra1.printList();}
        if(extra2 != null) {extra2.printList();}
        if(extra3 != null) {extra3.printList();}
    }

    @Override
    public void printList() {
        System.out.println("BASE BURGER  : %.2f", getBasePrice());
        printExtraList();
    }
}
