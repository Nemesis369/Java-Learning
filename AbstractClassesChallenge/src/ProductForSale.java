package AbstractClassesChallenge.src;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedItem(int quantity) {
        System.out.printf("%s, %2d qty at $%8.2f each     %-30s%n", type, quantity, price, description);
    }

    public abstract void showDetails();
}

class ArtObject extends ProductForSale {

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    public void showDetails() {
        System.out.println("This " + type + " is a beautiful reproduction");
        System.out.printf("The price of the piece is %7.2f %n", price);
        System.out.println(description);
    }
}

// class Books extends ProductForSale {
// public void showDetails() {
// }
// }

// class NoteBooks extends ProductForSale {
// public void showDetails() {
// }
// }
