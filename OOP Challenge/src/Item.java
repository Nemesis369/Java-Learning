public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "SMALL";

    public Item() {
    }

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
        if (type.equals("SIDES") || type.equals("DRINKS")) {
            return size + " " + name;
        }
        return name;
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "MEDIUM" -> getBasePrice() + 1.0;
            case "LARGE" -> getBasePrice() + 2.0;
            default -> getBasePrice();
        };
    }

    public static void printList(String name, double price) {
        System.out.print(name);
        System.out.printf(" : %.2f".indent(20 - name.length()), price);
        // System.out.println(String.format("%s : %.2f", name, price));
    }

    public void printList() {
        printList(getName(), getAdjustedPrice());
    }
}
