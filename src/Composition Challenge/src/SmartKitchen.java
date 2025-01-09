public class SmartKitchen {
    
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        dishWasher.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        iceBox.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean brew, boolean order, boolean wash) {
        brewMaster.setHasWorkToDo(brew);
        iceBox.setHasWorkToDo(order);
        dishWasher.setHasWorkToDo(wash);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker {
    
    private boolean hasWorkToDo;

    public CoffeeMaker() {
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if(hasWorkToDo) {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
} 

class DishWasher {
    
    private boolean hasWorkToDo;

    public DishWasher() {
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("Washing the dishes");
            hasWorkToDo = false;
        }
    }
}


class Refrigerator {
    
    private boolean hasWorkToDo;

    public Refrigerator() {
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Ordering the food");
        }
    }
}
