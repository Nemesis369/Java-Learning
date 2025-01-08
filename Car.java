public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int door = 2;
    private boolean convertible = true;

    // getter method
    public String getMake() {
        return make;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
    public int getDoor() {
        return door;
    }
    public boolean isConvertible() {
        return convertible;
    }

    // setter methods
    public void setMake(String make) {
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setDoor(int door) {
        this.door = door;
    }
    public void setColor(String colour) {
        this.color = colour;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(door + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : "Non-Convertible"));
    }
}