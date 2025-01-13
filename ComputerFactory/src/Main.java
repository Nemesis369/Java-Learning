public class Main {
    
    public static void main(String[] args) {
        
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theMonitor, theMotherboard, theCase);

        // thePC.getMonitor().drawPixelAt(10, 10, "red");
        // thePC.getMotherboard().loadProgram("Windows OS");
        // thePC.getcomputerCase().pressPowerButton();

        thePC.powerUp();
    }
}

class Product {
    
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product {

    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.printf("Drawing pixel at %d,%d in color %s", x, y, color);
    }
}

class Motherboard extends Product {

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
}

class ComputerCase extends Product {

    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}

class PersonalComputer extends Product {

    private Monitor m;
    private Motherboard mb;
    private ComputerCase cc;

    public PersonalComputer(String model, String manufacturer, Monitor m, Motherboard mb, ComputerCase cc) {
        super(model, manufacturer);
        this.m = m;
        this.mb = mb;
        this.cc = cc;
    }

    // public ComputerCase getcomputerCase() {
    //     return cc;
    // }
    // public Monitor getMonitor() {
    //     return m;
    // }
    // public Motherboard getMotherboard() {
    //     return mb;
    // }

    private void drawLogo() {
        this.m.drawPixelAt(1200, 50, "yellow");
    }
    public void powerUp() {
        this.cc.pressPowerButton();
        drawLogo();
    }
}