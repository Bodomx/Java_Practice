package Practise;

public class Car {
    private String brand = "BMW";
    private static int wheels = 4;
    private float engineCapacity = 4.6f;
    private double fuelCapacity = 2.66;
    private int speed = 0;
    private Gear currentGear;
    private boolean engineOn = false;

    // Enum for gear states
    private enum Gear {
        PARK, REVERSE, NEUTRAL, DRIVE;
    }

    // Constructor
    public Car() {
        this.currentGear = Gear.PARK; // Default gear is PARK
    }

    // Start the car
    public void startEngine() {
        if (!engineOn) {
            engineOn = true;
            System.out.println("Engine started");
        } else {
            System.out.println("Engine is already on");
        }
    }

    // Stop the car
    public void stopEngine() {
        if (engineOn) {
            engineOn = false;
            speed = 0;
            currentGear = Gear.PARK;
            System.out.println("Engine stopped");
        } else {
            System.out.println("Engine is already off");
        }
    }

    // Change gears
    public void changeGear(Gear gear) {
        if (engineOn) {
            currentGear = gear;
            System.out.println("Gear changed to " + gear);
        } else {
            System.out.println("Cannot change gears when the engine is off");
        }
    }

    // Accelerate the car
    public void accelerate(int increment) {
        if (engineOn && currentGear == Gear.DRIVE) {
            speed += increment;
            System.out.println("Accelerating. Speed: " + speed + " km/h");
        } else {
            System.out.println("Cannot accelerate in current state");
        }
    }

    // Apply brakes
    public void applyBrakes(int decrement) {
        if (speed > 0) {
            speed = Math.max(speed - decrement, 0);
            System.out.println("Brakes applied. Speed: " + speed + " km/h");
        } else {
            System.out.println("Car is already stopped");
        }
    }

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.startEngine();
        bmw.changeGear(Gear.DRIVE);
        bmw.accelerate(20);
        bmw.applyBrakes(10);
        bmw.stopEngine();
    }
}
