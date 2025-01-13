public class MealOrder {

    private Item drink;
    private Item sideItem;
    private Burger burger;

    public MealOrder() {
        this("Coke", "Fries", "Cheeseburger");
    }

    public MealOrder(String drinkName, String sideName, String burgerName) {
        drink = new Item("drink", drinkName, 5.0);
        sideItem = new Item("sides", sideName, 1.50);
        burger = new Burger(burgerName, 3.0);
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void changeDrinkSize(String size) {
        drink.setSize(size);
    }

    public double getTotalPrice() {
        return drink.getAdjustedPrice() + sideItem.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printList();
        drink.printList();
        sideItem.printList();
        System.out.println("-".repeat(30));
        System.out.println(String.format("TOTAL :  %.2f", getTotalPrice()).indent(8));
    }
}
