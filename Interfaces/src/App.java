package Interfaces.src;

import java.util.LinkedList;
import java.util.List;

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

        // ArrayList<FlightEnabled> fliers = new ArrayList<>();
        // fliers.add(bird);

        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);

        flier.transition(FlightStages.GROUNDED);
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();

        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    public static void triggerFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    public static void flyFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.fly();
        }
    }

    public static void landFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.land();
        }
    }
}
