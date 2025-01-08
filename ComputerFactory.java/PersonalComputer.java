public class PersonalComputer extends Product {

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