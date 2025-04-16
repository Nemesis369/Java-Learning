package Interfaces.src;

// Records and Enums can implement a interface

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {

        if(this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public void takeOff() {

    }

}

class Satellite implements OrbitEarth {

    @Override
    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public void takeOff() {

    }

}

interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();
}

interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();

    void land();

    void fly();
}

interface Trackable {

    void track();
}

public abstract class Animal {

    public abstract void move();
}
