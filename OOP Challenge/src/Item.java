public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "SMALL";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public double getBasePrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getAdjustedPrice() {
        return switch(size) {
            case "MEDIUM" -> getBasePrice()  + 1.0;
            case "LARGE" -> getBasePrice() + 2.0;
            default -> getBasePrice();
        };
    }
    public String printList() {

        if(type.equals("SIDES") || type.equals("DRINK")) {
            // return (size + " " + type + "  : " + price);
            return String.format("%s %s  : %.2f", size, type, getAdjustedPrice());
        }
        return String.format("%d  : %.2f", name, getAdjustedPrice());
    }
}
