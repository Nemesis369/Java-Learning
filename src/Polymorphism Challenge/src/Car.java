public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine has started");
    }

    public void drive() {
        System.out.println("Car is moving forward, type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine is running");
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders = 6;

    
    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Gas Engine");
        System.out.printf("All %d cylinders are fired up %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Usage exceeds the average: %.2f %n", avgKmPerLitre);
    }

    // @Override
    // public void drive() {
    // }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage exceeds the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders = 6;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    public void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLitre);
    }
}
