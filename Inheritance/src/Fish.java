public class Fish extends Animal {
    private int fins;
    private int gills;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles() {
        System.out.println("muscles moving ");
    }
    private void moveBackFin() {
        System.out.println("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
