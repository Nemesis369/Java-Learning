package Interfaces.src;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
        // flier.move();
        // tracked.move();

        // flier.takeOff();
        // flier.fly();
        // tracked.track();
        // flier.land();

        inFlight(flier);
        inFlight(bird);
        inFlight(new Jet());
        inFlight(new Satellite());

        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

        ArrayList<FlightEnabled> fliers
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();

        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
