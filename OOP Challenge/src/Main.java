public class Main {

    public static void main(String[] args) {
        // Item fries = new Item("sides", "Fries", 3.0);
        // fries.printList();
        // fries.setSize("Large");
        // fries.printList();

        // Item cheese = new Item("topping", "Cheese", 1.0);
        // cheese.printList();

        // Item avocado = new Item("Topping", "avocado", 1.50);
        // avocado.printList();

        // Burger burger = new Burger("regular", 4.00);
        // burger.addToppings("HAM", "CHEESE", "AVOCADO");
        // burger.printList();

        MealOrder meal = new MealOrder("Sprite", "Tenders", "CheeseBurger");

        meal.addToppings("HAM", "CHEESE", "AVOCADO");
        meal.changeDrinkSize("LARGE");
        meal.printItemizedList();
    }
}
