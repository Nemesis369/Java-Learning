public class Burger extends Item {

    private Item extra1, extra2, extra3;

    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public double getExtraPrice(String topping) {
        return switch (topping.toUpperCase()) {
            case "AVOCADO" -> 1.0;
            case "CHEESE", "TOMATO" -> 1.5;
            case "ONION", "HAM" -> 2;
            default -> 0.0;
        };
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() + ((extra1 == null) ? 0 : extra1.getAdjustedPrice())
                + ((extra2 == null) ? 0 : extra2.getAdjustedPrice())
                + ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("TOPPING", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("TOPPING", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("TOPPING", extra3, getExtraPrice(extra3));
    }

    public void printExtraList() {
        if (extra1 != null) {
            extra1.printList();
        }
        if (extra2 != null) {
            extra2.printList();
        }
        if (extra3 != null) {
            extra3.printList();
        }
    }

    public void printList() {
        // prints the burger and goes on to the toppings
        System.out.printf(getName() + " : %.2f%n", getBasePrice());

        // toppings printed
        printExtraList();
    }
}
